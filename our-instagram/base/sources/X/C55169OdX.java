package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.OdX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55169OdX {
    public MediaCodec A01;
    public MediaMuxer A02;
    public Surface A03;
    public C68727Vb6 A04;
    public HandlerC50752MbH A05;
    public final UserSession A08;
    public final MediaCodec.BufferInfo A07 = new MediaCodec.BufferInfo();
    public boolean A06 = false;
    public volatile boolean A09 = false;
    public int A00 = -1;

    public static void A01(C55169OdX c55169OdX, Exception exc, String str) {
        c55169OdX.A09 = false;
        C0K8.A0F("BoomerangEncoder", str, exc);
        if (c55169OdX.A04 != null) {
            C0K8.A0F("PosesFramesHandlerV1", str, exc);
        }
    }

    public static void A00(C55169OdX c55169OdX) {
        MediaCodec mediaCodec;
        if (c55169OdX.A09 && (mediaCodec = c55169OdX.A01) != null) {
            try {
                try {
                    mediaCodec.signalEndOfInputStream();
                    A03(c55169OdX, true);
                    c55169OdX.A01.flush();
                } catch (IllegalStateException e) {
                    A02(c55169OdX, e);
                }
                try {
                    if (C18U.A06(C06090Tz.A05, c55169OdX.A08, 36316654317539929L)) {
                        Exception A01 = Y2X.A01(c55169OdX.A01);
                        if (A01 != null) {
                            throw A01;
                        }
                    } else {
                        C0fT.A06(c55169OdX.A01, 1883330788);
                    }
                } catch (Exception e2) {
                    A01(c55169OdX, e2, "MediaCodec.stop() Error");
                }
                c55169OdX.A06 = false;
                c55169OdX.A00 = -1;
                C68727Vb6 c68727Vb6 = c55169OdX.A04;
                if (c68727Vb6 != null) {
                    NTX ntx = c68727Vb6.A00.A0B.A00;
                    ntx.A0F.A00.A00(new P9Z());
                    MSW.A09(ntx.A0I).post(new POB(ntx));
                }
            } finally {
                c55169OdX.A09 = false;
            }
        }
    }

    public static void A02(C55169OdX c55169OdX, IllegalStateException illegalStateException) {
        String str;
        if (illegalStateException instanceof MediaCodec.CodecException) {
            str = "MediaCodec.CodecException Error";
        } else {
            str = "IllegalStateException Error";
        }
        A01(c55169OdX, illegalStateException, str);
    }

    public static void A03(C55169OdX c55169OdX, boolean z) {
        if (c55169OdX.A09) {
            try {
                MediaCodec mediaCodec = c55169OdX.A01;
                if (mediaCodec == null || c55169OdX.A02 == null) {
                    return;
                }
                while (true) {
                    ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
                    while (true) {
                        MediaCodec mediaCodec2 = c55169OdX.A01;
                        MediaCodec.BufferInfo bufferInfo = c55169OdX.A07;
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
                                if (!c55169OdX.A06) {
                                    c55169OdX.A00 = c55169OdX.A02.addTrack(c55169OdX.A01.getOutputFormat());
                                    c55169OdX.A02.start();
                                    c55169OdX.A06 = true;
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
                                    if (c55169OdX.A06) {
                                        AbstractC50522MSa.A0v(bufferInfo, byteBuffer);
                                        c55169OdX.A02.writeSampleData(c55169OdX.A00, byteBuffer, bufferInfo);
                                    } else {
                                        throw MSY.A0d("video/avc", ": muxer hasn't started");
                                    }
                                }
                                c55169OdX.A01.releaseOutputBuffer(dequeueOutputBuffer, false);
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
                    mediaCodec = c55169OdX.A01;
                }
            } catch (IllegalStateException e) {
                A02(c55169OdX, e);
            }
        }
    }

    public final boolean A04(int i, int i2, int i3, int i4) {
        if (i4 < 10) {
            try {
                this.A01 = C0fT.A02("video/avc", 222554277);
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
                createVideoFormat.setInteger(TraceFieldType.Bitrate, i3);
                createVideoFormat.setInteger("i-frame-interval", 1);
                createVideoFormat.setInteger("max-input-size", 0);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("frame-rate", 30);
                C0fT.A07(this.A01, null, createVideoFormat, null, 1, 1298097044);
                this.A03 = this.A01.createInputSurface();
                return true;
            } catch (IOException e) {
                C0K8.A0F("BoomerangEncoder", "Cannot create encoder!", e);
                if (this.A04 != null) {
                    String message = e.getMessage();
                    C14360o3.A0B(message, 0);
                    C0K8.A0F("PosesFramesHandlerV1", message, e);
                }
            } catch (IllegalArgumentException unused) {
                return A04(i, i2, i3, i4 + 1);
            } catch (IllegalStateException e2) {
                A02(this, e2);
                return false;
            }
        }
        return false;
    }

    public C55169OdX(UserSession userSession) {
        this.A08 = userSession;
    }
}
