package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: X.YBj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73397YBj implements BES {
    public MediaCodec A00;
    public MediaFormat A01;
    public Surface A02;
    public String A04;
    public final Handler A05;
    public final StringBuilder A06;
    public final int A07;
    public final InterfaceC176037sM A08;
    public final AC9 A09;
    public final C23014ACo A0A;
    public volatile boolean A0C;
    public volatile Integer A0B = C05F.A0N;
    public boolean A03 = true;

    public static void A03(C73397YBj c73397YBj, boolean z) {
        long j = 0;
        try {
            MediaCodec mediaCodec = c73397YBj.A00;
            mediaCodec.getClass();
            ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                if (c73397YBj.A0B == C05F.A01 || (c73397YBj.A0B == C05F.A0C && z)) {
                    int dequeueOutputBuffer = c73397YBj.A00.dequeueOutputBuffer(bufferInfo, 1000L);
                    if (bufferInfo.size <= 0 && (bufferInfo.flags & 4) != 0) {
                        c73397YBj.A00.releaseOutputBuffer(dequeueOutputBuffer, false);
                        break;
                    }
                    if (dequeueOutputBuffer != -1) {
                        if (dequeueOutputBuffer != -3) {
                            if (dequeueOutputBuffer != -2) {
                                if (dequeueOutputBuffer < 0) {
                                    if (z) {
                                        c73397YBj.A03 = true;
                                    }
                                    c73397YBj.A09.A01(AbstractC72046XLm.A0R("Unexpected result from encoder.dequeueOutputBuffer: %d", new Object[]{Integer.valueOf(dequeueOutputBuffer)}), null);
                                    return;
                                }
                                ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                                if (byteBuffer != null) {
                                    byteBuffer.position(bufferInfo.offset).limit(bufferInfo.size);
                                    if ((bufferInfo.flags & 2) != 0) {
                                        bufferInfo.flags = 2;
                                    }
                                    if (bufferInfo.size > 0) {
                                        c73397YBj.A09.A00(bufferInfo, byteBuffer);
                                    }
                                    c73397YBj.A00.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    if ((bufferInfo.flags & 4) != 0) {
                                        break;
                                    } else {
                                        j++;
                                    }
                                } else {
                                    if (z) {
                                        c73397YBj.A03 = true;
                                    }
                                    c73397YBj.A09.A01(AbstractC72046XLm.A0R("encoderOutputBuffer %d was null", new Object[]{Integer.valueOf(dequeueOutputBuffer)}), null);
                                    return;
                                }
                            } else {
                                c73397YBj.A01 = c73397YBj.A00.getOutputFormat();
                            }
                        } else {
                            outputBuffers = c73397YBj.A00.getOutputBuffers();
                        }
                    }
                } else {
                    return;
                }
            }
            c73397YBj.A03 = true;
        } catch (Exception e) {
            if (z) {
                c73397YBj.A03 = true;
            }
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put(TraceFieldType.CurrentState, XgU.A00(c73397YBj.A0B));
            A1G.put("is_end_of_stream", String.valueOf(z));
            A1G.put("frames_processed", String.valueOf(0L));
            A1G.put("method_invocation", c73397YBj.A06.toString());
            if (e instanceof MediaCodec.CodecException) {
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) e;
                A1G.put("isRecoverable", String.valueOf(codecException.isRecoverable()));
                A1G.put("isTransient", String.valueOf(codecException.isTransient()));
            }
            c73397YBj.A09.A01(e, A1G);
        }
    }

    @Override // X.BES
    public final synchronized void EoS(InterfaceC176157sY interfaceC176157sY, Handler handler) {
        this.A06.append("stop, ");
        this.A0C = AbstractC167007dF.A1X(this.A0B, C05F.A01);
        this.A0B = C05F.A0C;
        this.A05.post(new YHD(new C73396YBi(handler, new AbstractC223559ty(23001, "Timeout while stopping"), interfaceC176157sY, this.A07), this));
    }

    public static MediaFormat A00(C23014ACo c23014ACo, String str, boolean z, boolean z2, boolean z3) {
        int i;
        String str2;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, c23014ACo.A05, c23014ACo.A04);
        boolean A1a = AbstractC72048XLo.A1a(createVideoFormat, c23014ACo);
        if ("video/av01".equals(str)) {
            if (Build.VERSION.SDK_INT >= 29) {
                createVideoFormat.setInteger("profile", A1a ? 1 : 0);
                i = 512;
            } else {
                throw AbstractC166987dD.A18(AnonymousClass001.A0c("Attempting to configure AV1 codec on API level ", " (<29)", 28));
            }
        } else {
            if ("video/hevc".equals(str)) {
                AbstractC72048XLo.A0P(createVideoFormat, c23014ACo, A1a);
                return createVideoFormat;
            }
            i = 256;
            if (z) {
                createVideoFormat.setInteger("profile", 8);
                createVideoFormat.setInteger("level", 256);
                if (z2) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        str2 = AbstractC111324zv.A00(1092);
                    } else {
                        str2 = "latency";
                    }
                    createVideoFormat.setInteger(str2, A1a ? 1 : 0);
                    return createVideoFormat;
                }
            } else if (z3) {
                createVideoFormat.setInteger("profile", A1a ? 1 : 0);
            }
            return createVideoFormat;
        }
        createVideoFormat.setInteger("level", i);
        return createVideoFormat;
    }

    public static void A01(Handler handler, InterfaceC176157sY interfaceC176157sY, C73397YBj c73397YBj, boolean z) {
        AbstractC223559ty abstractC223559ty;
        MediaCodec A00;
        String obj;
        String str;
        StringBuilder sb = c73397YBj.A06;
        sb.append("(");
        sb.append(z);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(c73397YBj.A04);
        sb.append(")");
        sb.append("asyncPrepare, ");
        if (c73397YBj.A0B != C05F.A0N) {
            Integer num = c73397YBj.A0B;
            if (num != null) {
                str = XgU.A00(num);
            } else {
                str = "null";
            }
            abstractC223559ty = new AbstractC223559ty(23001, AnonymousClass001.A0R("Must only call prepare() on a stopped SurfaceVideoEncoder. Current state is: ", str));
            abstractC223559ty.A00(TraceFieldType.CurrentState, XgU.A00(c73397YBj.A0B));
            abstractC223559ty.A00("method_invocation", sb.toString());
        } else {
            try {
                C23014ACo c23014ACo = c73397YBj.A0A;
                InterfaceC176037sM interfaceC176037sM = c73397YBj.A08;
                String str2 = c73397YBj.A04;
                if ("high".equalsIgnoreCase(c23014ACo.A06)) {
                    MediaFormat mediaFormat = null;
                    try {
                        mediaFormat = A00(c23014ACo, str2, true, c23014ACo.A07, c23014ACo.A08);
                        A00 = XgV.A00(null, mediaFormat, str2);
                    } catch (Exception e) {
                        C0K8.A0H("SurfaceVideoEncoderImpl", "Error getting video encoder for high profile. Fall back to baseline", e);
                        AbstractC223559ty abstractC223559ty2 = new AbstractC223559ty(AnonymousClass001.A0R("Failed to create high profile encoder, mime=", str2), e, 23001);
                        interfaceC176037sM.EmV("SurfaceVideoEncoderImpl", abstractC223559ty2, false);
                        HashMap A1G = AbstractC166987dD.A1G();
                        A1G.put("recording_video_encoder_config", c23014ACo.toString());
                        if (mediaFormat != null) {
                            obj = mediaFormat.toString();
                        } else {
                            obj = "null";
                        }
                        A1G.put(AbstractC111324zv.A00(1211), obj);
                        interfaceC176037sM.Cl9(abstractC223559ty2, AbstractC111324zv.A00(1179), "SurfaceVideoEncoderImpl", "", "createMediaCodec", A1G, interfaceC176037sM.hashCode());
                    }
                    c73397YBj.A00 = A00;
                    c73397YBj.A02 = A00.createInputSurface();
                    c73397YBj.A03 = true;
                    c73397YBj.A0B = C05F.A00;
                    sb.append("asyncPrepare end, ");
                    AD8.A01(interfaceC176157sY, handler);
                    return;
                }
                A00 = XgV.A00(null, A00(c23014ACo, str2, false, false, c23014ACo.A08), str2);
                c73397YBj.A00 = A00;
                c73397YBj.A02 = A00.createInputSurface();
                c73397YBj.A03 = true;
                c73397YBj.A0B = C05F.A00;
                sb.append("asyncPrepare end, ");
                AD8.A01(interfaceC176157sY, handler);
                return;
            } catch (Exception e2) {
                if (z) {
                    String str3 = c73397YBj.A04;
                    if ("video/av01".equals(str3)) {
                        c73397YBj.A04 = "video/hevc";
                        str3 = "video/hevc";
                    }
                    if ("video/hevc".equals(str3)) {
                        c73397YBj.A04 = "video/avc";
                    }
                    c73397YBj.A08.EmV("SurfaceVideoEncoderImpl", new AbstractC223559ty("Failed to prepare, retrying", e2, 23001), false);
                    A01(handler, interfaceC176157sY, c73397YBj, !"video/avc".equals(c73397YBj.A04));
                    return;
                }
                abstractC223559ty = new AbstractC223559ty(23001, e2);
                A02(abstractC223559ty, c73397YBj, e2);
            }
        }
        AD8.A00(handler, abstractC223559ty, interfaceC176157sY);
    }

    public static void A02(AbstractC223559ty abstractC223559ty, C73397YBj c73397YBj, Exception exc) {
        abstractC223559ty.A00(TraceFieldType.CurrentState, XgU.A00(c73397YBj.A0B));
        abstractC223559ty.A00("method_invocation", c73397YBj.A06.toString());
        AbstractC72049XLp.A0I(abstractC223559ty, c73397YBj.A0A, exc);
    }

    @Override // X.BES
    public final void E5R(final InterfaceC176157sY interfaceC176157sY, final Handler handler) {
        this.A06.append("prepare, ");
        this.A05.post(new Runnable() { // from class: X.YIA
            @Override // java.lang.Runnable
            public final void run() {
                C73397YBj c73397YBj = this;
                C73397YBj.A01(handler, interfaceC176157sY, c73397YBj, true);
            }
        });
    }

    @Override // X.BES
    public final void Emg(final InterfaceC176157sY interfaceC176157sY, final Handler handler) {
        this.A06.append("start, ");
        this.A05.post(new Runnable() { // from class: X.YIB
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC223559ty abstractC223559ty;
                String str;
                final C73397YBj c73397YBj = this;
                InterfaceC176157sY interfaceC176157sY2 = interfaceC176157sY;
                Handler handler2 = handler;
                synchronized (c73397YBj) {
                    StringBuilder sb = c73397YBj.A06;
                    sb.append("asyncStart, ");
                    if (c73397YBj.A0B != C05F.A00) {
                        Integer num = c73397YBj.A0B;
                        if (num != null) {
                            str = XgU.A00(num);
                        } else {
                            str = "null";
                        }
                        abstractC223559ty = new AbstractC223559ty(23001, AnonymousClass001.A0R("prepare() must be called before starting video encoding. Current state is: ", str));
                        abstractC223559ty.A00(TraceFieldType.CurrentState, XgU.A00(c73397YBj.A0B));
                        abstractC223559ty.A00("method_invocation", sb.toString());
                    } else {
                        try {
                            MediaCodec mediaCodec = c73397YBj.A00;
                            mediaCodec.getClass();
                            C0fT.A05(mediaCodec, -1968880236);
                            c73397YBj.A0B = C05F.A01;
                            c73397YBj.A03 = false;
                            c73397YBj.A05.post(new Runnable() { // from class: X.YGO
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C73397YBj.A03(C73397YBj.this, false);
                                }
                            });
                            sb.append("asyncStart end, ");
                            AD8.A01(interfaceC176157sY2, handler2);
                        } catch (Exception e) {
                            abstractC223559ty = new AbstractC223559ty(23001, e);
                            C73397YBj.A02(abstractC223559ty, c73397YBj, e);
                        }
                    }
                    AD8.A00(handler2, abstractC223559ty, interfaceC176157sY2);
                }
            }
        });
    }

    public C73397YBj(Handler handler, InterfaceC176037sM interfaceC176037sM, AC9 ac9, C23014ACo c23014ACo, String str, int i) {
        this.A0A = c23014ACo;
        this.A09 = ac9;
        this.A05 = handler;
        this.A07 = i;
        this.A08 = interfaceC176037sM;
        this.A04 = str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        this.A06 = A1C;
        A1C.append(hashCode());
        A1C.append(" ctor, ");
    }

    @Override // X.BES
    public final Surface BI6() {
        return this.A02;
    }

    @Override // X.InterfaceC25158BBd
    public final MediaFormat BaG() {
        return this.A01;
    }
}
