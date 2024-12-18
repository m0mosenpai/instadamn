package X;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: X.XRd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72169XRd extends Y9S {
    public final long A00;
    public final Runnable A01;

    public C72169XRd(Handler handler, C177567uq c177567uq, InterfaceC178337w7 interfaceC178337w7, C72680Xl1 c72680Xl1, AC8 ac8) {
        super(handler, c177567uq, interfaceC178337w7, c72680Xl1, ac8);
        this.A01 = new YG9(this);
        this.A00 = (AMJ.A01(c177567uq.A07, c177567uq.A03, c177567uq.A02, c177567uq.A08) / 1000) / 2;
    }

    public static void A00(MediaCodec mediaCodec, C72169XRd c72169XRd) {
        AC8 ac8;
        Exception A0R;
        try {
            if (((Y9S) c72169XRd).A00 == null) {
                ac8 = c72169XRd.A06;
                A0R = AbstractC166987dD.A14("Unexpected null audio buffer info while attempting to process output buffers");
            } else {
                while (true) {
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(((Y9S) c72169XRd).A00, 0L);
                    MediaCodec.BufferInfo bufferInfo = ((Y9S) c72169XRd).A00;
                    if (bufferInfo.size <= 0 && (bufferInfo.flags & 4) != 0) {
                        mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                        return;
                    }
                    if (dequeueOutputBuffer != -1) {
                        if (dequeueOutputBuffer != -3) {
                            if (dequeueOutputBuffer == -2) {
                                c72169XRd.A02 = mediaCodec.getOutputFormat();
                            } else if (dequeueOutputBuffer >= 0) {
                                c72169XRd.A02(mediaCodec, dequeueOutputBuffer, bufferInfo);
                            } else {
                                ac8 = c72169XRd.A06;
                                A0R = AbstractC72046XLm.A0R(MSV.A00(593), new Object[]{Integer.valueOf(dequeueOutputBuffer)});
                                break;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            ac8.A01(A0R);
        } catch (Exception e) {
            c72169XRd.A06.A01(e);
        }
    }
}
