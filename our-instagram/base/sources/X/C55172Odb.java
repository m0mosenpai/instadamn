package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.tigon.tigonhuc.HucClient;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.Odb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55172Odb {
    public MediaCodec A01;
    public MediaMuxer A02;
    public Surface A03;
    public InterfaceC58102PpR A04;
    public HandlerC50751MbG A05;
    public InterfaceC178337w7 A06;
    public final MediaCodec.BufferInfo A08 = new MediaCodec.BufferInfo();
    public boolean A07 = false;
    public volatile boolean A09 = false;
    public int A00 = -1;

    public static void A01(C55172Odb c55172Odb, Exception exc, String str) {
        c55172Odb.A09 = false;
        C0K8.A0F("BoomerangEncoder", str, exc);
        InterfaceC58102PpR interfaceC58102PpR = c55172Odb.A04;
        if (interfaceC58102PpR != null) {
            interfaceC58102PpR.DDU(exc, str);
        }
    }

    public final synchronized void A04(String str) {
        if (this.A05 == null) {
            HandlerThread A0A = MSY.A0A("BurstFramesEncoderThread");
            A0A.start();
            Looper looper = A0A.getLooper();
            looper.getClass();
            HandlerC50751MbG handlerC50751MbG = new HandlerC50751MbG(looper, this);
            this.A05 = handlerC50751MbG;
            Message obtainMessage = handlerC50751MbG.obtainMessage(1, str);
            obtainMessage.arg1 = 0;
            this.A05.sendMessage(obtainMessage);
        } else {
            throw AbstractC166987dD.A14("startVideoEncoding() is called more than once!");
        }
    }

    public final boolean A05(int i, int i2, int i3, int i4) {
        if (i4 < 1) {
            try {
                this.A01 = C0fT.A02("video/avc", -1994066217);
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
                createVideoFormat.setInteger(TraceFieldType.Bitrate, i3);
                createVideoFormat.setInteger("i-frame-interval", 1);
                createVideoFormat.setInteger("max-input-size", 0);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("frame-rate", 30);
                C0fT.A07(this.A01, null, createVideoFormat, null, 1, -1726113650);
                this.A03 = this.A01.createInputSurface();
                return true;
            } catch (IOException e) {
                C0K8.A0F("BoomerangEncoder", "Cannot create encoder!", e);
                if (this.A04 != null && e.getMessage() != null) {
                    this.A04.DDU(e, e.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                return A05(i, i2, i3, 1);
            } catch (IllegalStateException e2) {
                A02(this, e2);
                return false;
            }
        }
        return false;
    }

    public static void A00(C55172Odb c55172Odb) {
        MediaCodec mediaCodec;
        if (c55172Odb.A09 && (mediaCodec = c55172Odb.A01) != null) {
            try {
                try {
                    mediaCodec.signalEndOfInputStream();
                    A03(c55172Odb, true);
                    c55172Odb.A01.flush();
                } catch (IllegalStateException e) {
                    A02(c55172Odb, e);
                }
                try {
                    InterfaceC178337w7 interfaceC178337w7 = c55172Odb.A06;
                    if (interfaceC178337w7 != null && interfaceC178337w7.CUZ(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS)) {
                        Exception A01 = Y2X.A01(c55172Odb.A01);
                        if (A01 != null) {
                            throw A01;
                        }
                    } else {
                        C0fT.A06(c55172Odb.A01, 1342025506);
                    }
                } catch (Exception e2) {
                    A01(c55172Odb, e2, "MediaCodec.stop() Error");
                }
                c55172Odb.A07 = false;
                c55172Odb.A00 = -1;
                InterfaceC58102PpR interfaceC58102PpR = c55172Odb.A04;
                if (interfaceC58102PpR != null) {
                    interfaceC58102PpR.DDV();
                }
            } finally {
                c55172Odb.A09 = false;
            }
        }
    }

    public static void A02(C55172Odb c55172Odb, IllegalStateException illegalStateException) {
        String str;
        if (illegalStateException instanceof MediaCodec.CodecException) {
            str = "MediaCodec.CodecException Error";
        } else {
            str = "IllegalStateException Error";
        }
        A01(c55172Odb, illegalStateException, str);
    }

    public static void A03(C55172Odb c55172Odb, boolean z) {
        if (c55172Odb.A09) {
            try {
                MediaCodec mediaCodec = c55172Odb.A01;
                if (mediaCodec == null || c55172Odb.A02 == null) {
                    return;
                }
                while (true) {
                    ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
                    while (true) {
                        MediaCodec mediaCodec2 = c55172Odb.A01;
                        MediaCodec.BufferInfo bufferInfo = c55172Odb.A08;
                        int dequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, 2500L);
                        if (dequeueOutputBuffer == -1) {
                            if (!z) {
                                return;
                            }
                        } else {
                            if (dequeueOutputBuffer == -3) {
                                break;
                            }
                            if (dequeueOutputBuffer == -2) {
                                if (!c55172Odb.A07) {
                                    c55172Odb.A00 = c55172Odb.A02.addTrack(c55172Odb.A01.getOutputFormat());
                                    c55172Odb.A02.start();
                                    c55172Odb.A07 = true;
                                } else {
                                    throw MSY.A0d("video/avc", ": format changed twice");
                                }
                            } else if (dequeueOutputBuffer < 0) {
                                C0K8.A0P("BoomerangEncoder", "unexpected result from encoder.dequeueOutputBuffer: %d", Integer.valueOf(dequeueOutputBuffer));
                            } else {
                                ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                                if ((bufferInfo.flags & 2) != 0) {
                                    bufferInfo.size = 0;
                                }
                                if (bufferInfo.size != 0) {
                                    if (c55172Odb.A07) {
                                        AbstractC50522MSa.A0v(bufferInfo, byteBuffer);
                                        c55172Odb.A02.writeSampleData(c55172Odb.A00, byteBuffer, bufferInfo);
                                    } else {
                                        throw MSY.A0d("video/avc", ": muxer hasn't started");
                                    }
                                }
                                c55172Odb.A01.releaseOutputBuffer(dequeueOutputBuffer, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    if (!z) {
                                        C0K8.A0P("BoomerangEncoder", "%s: reached end of stream unexpectedly", "video/avc");
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    mediaCodec = c55172Odb.A01;
                }
            } catch (IllegalStateException e) {
                A02(c55172Odb, e);
            }
        }
    }
}
