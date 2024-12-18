package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashMap;

/* renamed from: X.YBk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73398YBk implements BES {
    public MediaCodec A00;
    public MediaFormat A01;
    public Handler A02;
    public InterfaceC176157sY A03;
    public Surface A04;
    public String A05;
    public final AC9 A06;
    public final StringBuilder A07;
    public final int A08;
    public final Handler A0A;
    public final InterfaceC176037sM A0B;
    public final C23014ACo A0C;
    public final MediaCodec.Callback A09 = new C72128XPa(this);
    public volatile Integer A0D = C05F.A0N;

    @Override // X.BES
    public final synchronized void EoS(InterfaceC176157sY interfaceC176157sY, Handler handler) {
        this.A07.append("stop, ");
        Integer num = this.A0D;
        Integer num2 = C05F.A0C;
        if (num != num2 && this.A0D != C05F.A0N) {
            if (this.A0D == C05F.A00) {
                A01(handler, interfaceC176157sY, this);
            } else {
                this.A0D = num2;
                this.A0A.post(new YHC(new C73396YBi(handler, new AbstractC223559ty(23001, "Timeout while stopping"), interfaceC176157sY, this.A08), this));
            }
        } else {
            AD8.A01(interfaceC176157sY, handler);
        }
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

    public static void A01(Handler handler, InterfaceC176157sY interfaceC176157sY, C73398YBk c73398YBk) {
        StringBuilder sb = c73398YBk.A07;
        sb.append("handleFinishedEncoding, ");
        c73398YBk.A03 = null;
        c73398YBk.A02 = null;
        if (interfaceC176157sY != null && handler != null) {
            try {
                Surface surface = c73398YBk.A04;
                if (surface != null) {
                    surface.release();
                }
                MediaCodec mediaCodec = c73398YBk.A00;
                if (mediaCodec != null) {
                    C0fT.A06(mediaCodec, 1116409503);
                    C0fT.A03(c73398YBk.A00, 420610723);
                }
                c73398YBk.A0D = C05F.A0N;
                c73398YBk.A00 = null;
                c73398YBk.A04 = null;
                c73398YBk.A01 = null;
                sb.append("asyncStop end, ");
                AD8.A01(interfaceC176157sY, handler);
            } catch (Exception e) {
                AbstractC223559ty abstractC223559ty = new AbstractC223559ty(23001, e);
                A03(abstractC223559ty, c73398YBk, e);
                MediaCodec mediaCodec2 = c73398YBk.A00;
                if (mediaCodec2 != null) {
                    try {
                        C0fT.A03(mediaCodec2, 157084351);
                    } catch (Exception unused) {
                    }
                }
                c73398YBk.A0D = C05F.A0N;
                c73398YBk.A00 = null;
                c73398YBk.A04 = null;
                c73398YBk.A01 = null;
                AD8.A00(handler, abstractC223559ty, interfaceC176157sY);
            }
        }
    }

    public static void A02(Handler handler, InterfaceC176157sY interfaceC176157sY, C73398YBk c73398YBk, boolean z) {
        AbstractC223559ty abstractC223559ty;
        MediaCodec A00;
        String obj;
        String str;
        StringBuilder sb = c73398YBk.A07;
        sb.append("(");
        sb.append(z);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(c73398YBk.A05);
        sb.append(")");
        sb.append("asyncPrepare, ");
        if (c73398YBk.A0D != C05F.A0N) {
            Integer num = c73398YBk.A0D;
            if (num != null) {
                str = XgU.A00(num);
            } else {
                str = "null";
            }
            abstractC223559ty = new AbstractC223559ty(23001, AnonymousClass001.A0R("Must only call prepare() on a stopped SurfaceVideoEncoder. Current state is: ", str));
            abstractC223559ty.A00(TraceFieldType.CurrentState, XgU.A00(c73398YBk.A0D));
            abstractC223559ty.A00("method_invocation", sb.toString());
        } else {
            try {
                C23014ACo c23014ACo = c73398YBk.A0C;
                MediaCodec.Callback callback = c73398YBk.A09;
                InterfaceC176037sM interfaceC176037sM = c73398YBk.A0B;
                String str2 = c73398YBk.A05;
                if ("high".equalsIgnoreCase(c23014ACo.A06)) {
                    MediaFormat mediaFormat = null;
                    try {
                        mediaFormat = A00(c23014ACo, str2, true, c23014ACo.A07, c23014ACo.A08);
                        A00 = XgV.A00(callback, mediaFormat, str2);
                    } catch (Exception e) {
                        C0K8.A0H("AsyncSurfaceVideoEncoderImpl", "Error getting video encoder for high profile. Fall back to baseline", e);
                        AbstractC223559ty abstractC223559ty2 = new AbstractC223559ty(AnonymousClass001.A0R("Failed to create high profile encoder, mime=", str2), e, 23001);
                        interfaceC176037sM.EmV("AsyncSurfaceVideoEncoderImpl", abstractC223559ty2, false);
                        HashMap A1G = AbstractC166987dD.A1G();
                        A1G.put("recording_video_encoder_config", c23014ACo.toString());
                        if (mediaFormat != null) {
                            obj = mediaFormat.toString();
                        } else {
                            obj = "null";
                        }
                        A1G.put(AbstractC111324zv.A00(1211), obj);
                        interfaceC176037sM.Cl9(abstractC223559ty2, AbstractC111324zv.A00(1179), "AsyncSurfaceVideoEncoderImpl", "", "createMediaCodec", A1G, interfaceC176037sM.hashCode());
                    }
                    c73398YBk.A00 = A00;
                    c73398YBk.A04 = A00.createInputSurface();
                    c73398YBk.A0D = C05F.A00;
                    sb.append("asyncPrepare end, ");
                    AD8.A01(interfaceC176157sY, handler);
                    return;
                }
                A00 = XgV.A00(callback, A00(c23014ACo, str2, false, false, c23014ACo.A08), str2);
                c73398YBk.A00 = A00;
                c73398YBk.A04 = A00.createInputSurface();
                c73398YBk.A0D = C05F.A00;
                sb.append("asyncPrepare end, ");
                AD8.A01(interfaceC176157sY, handler);
                return;
            } catch (Exception e2) {
                if (z) {
                    String str3 = c73398YBk.A05;
                    if ("video/av01".equals(str3)) {
                        c73398YBk.A05 = "video/hevc";
                        str3 = "video/hevc";
                    }
                    if ("video/hevc".equals(str3)) {
                        c73398YBk.A05 = "video/avc";
                    }
                    c73398YBk.A0B.EmV("AsyncSurfaceVideoEncoderImpl", new AbstractC223559ty("Failed to prepare, retrying", e2, 23001), false);
                    A02(handler, interfaceC176157sY, c73398YBk, !"video/avc".equals(c73398YBk.A05));
                    return;
                }
                abstractC223559ty = new AbstractC223559ty(23001, e2);
                A03(abstractC223559ty, c73398YBk, e2);
            }
        }
        AD8.A00(handler, abstractC223559ty, interfaceC176157sY);
    }

    public static void A03(AbstractC223559ty abstractC223559ty, C73398YBk c73398YBk, Exception exc) {
        abstractC223559ty.A00(TraceFieldType.CurrentState, XgU.A00(c73398YBk.A0D));
        abstractC223559ty.A00("method_invocation", c73398YBk.A07.toString());
        AbstractC72049XLp.A0I(abstractC223559ty, c73398YBk.A0C, exc);
    }

    @Override // X.BES
    public final void E5R(final InterfaceC176157sY interfaceC176157sY, final Handler handler) {
        this.A07.append("prepare, ");
        this.A0A.post(new Runnable() { // from class: X.YI9
            @Override // java.lang.Runnable
            public final void run() {
                C73398YBk c73398YBk = this;
                C73398YBk.A02(handler, interfaceC176157sY, c73398YBk, true);
            }
        });
    }

    @Override // X.BES
    public final void Emg(final InterfaceC176157sY interfaceC176157sY, final Handler handler) {
        this.A07.append("start, ");
        this.A0A.post(new Runnable() { // from class: X.YI8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC223559ty abstractC223559ty;
                String str;
                C73398YBk c73398YBk = this;
                InterfaceC176157sY interfaceC176157sY2 = interfaceC176157sY;
                Handler handler2 = handler;
                synchronized (c73398YBk) {
                    StringBuilder sb = c73398YBk.A07;
                    sb.append("asyncStart, ");
                    if (c73398YBk.A0D != C05F.A00) {
                        Integer num = c73398YBk.A0D;
                        if (num != null) {
                            str = XgU.A00(num);
                        } else {
                            str = "null";
                        }
                        abstractC223559ty = new AbstractC223559ty(23001, AnonymousClass001.A0R("prepare() must be called before starting video encoding. Current state is: ", str));
                        abstractC223559ty.A00(TraceFieldType.CurrentState, XgU.A00(c73398YBk.A0D));
                        abstractC223559ty.A00("method_invocation", sb.toString());
                    } else {
                        try {
                            MediaCodec mediaCodec = c73398YBk.A00;
                            mediaCodec.getClass();
                            C0fT.A05(mediaCodec, 1983915391);
                            c73398YBk.A0D = C05F.A01;
                            sb.append("asyncStart end, ");
                            AD8.A01(interfaceC176157sY2, handler2);
                        } catch (Exception e) {
                            abstractC223559ty = new AbstractC223559ty(23001, e);
                            C73398YBk.A03(abstractC223559ty, c73398YBk, e);
                        }
                    }
                    AD8.A00(handler2, abstractC223559ty, interfaceC176157sY2);
                }
            }
        });
    }

    public C73398YBk(Handler handler, InterfaceC176037sM interfaceC176037sM, AC9 ac9, C23014ACo c23014ACo, String str, int i) {
        this.A0C = c23014ACo;
        this.A06 = ac9;
        this.A0A = handler;
        this.A08 = i;
        this.A0B = interfaceC176037sM;
        this.A05 = str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        this.A07 = A1C;
        A1C.append(hashCode());
        A1C.append(" ctor, ");
    }

    @Override // X.BES
    public final Surface BI6() {
        return this.A04;
    }

    @Override // X.InterfaceC25158BBd
    public final MediaFormat BaG() {
        return this.A01;
    }
}
