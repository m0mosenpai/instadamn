package X;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.io.IOException;

/* renamed from: X.MbH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC50752MbH extends Handler {
    public final /* synthetic */ C55169OdX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC50752MbH(Looper looper, C55169OdX c55169OdX) {
        super(looper);
        this.A00 = c55169OdX;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Looper looper;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C55169OdX c55169OdX = this.A00;
                        if (c55169OdX.A09) {
                            C55169OdX.A00(c55169OdX);
                        }
                        if (c55169OdX.A01 != null) {
                            boolean A06 = C18U.A06(C06090Tz.A05, c55169OdX.A08, 36316654317539929L);
                            MediaCodec mediaCodec = c55169OdX.A01;
                            if (A06) {
                                Y2X.A00(mediaCodec);
                            } else {
                                C0fT.A03(mediaCodec, 122333883);
                            }
                            c55169OdX.A01 = null;
                        }
                        try {
                            try {
                                MediaMuxer mediaMuxer = c55169OdX.A02;
                                if (mediaMuxer != null) {
                                    mediaMuxer.release();
                                }
                            } catch (IllegalStateException e) {
                                C55169OdX.A01(c55169OdX, e, "MediaMuxer.release() Error");
                            }
                            c55169OdX.A02 = null;
                            Surface surface = c55169OdX.A03;
                            if (surface != null) {
                                surface.release();
                                c55169OdX.A03 = null;
                            }
                            HandlerC50752MbH handlerC50752MbH = c55169OdX.A05;
                            if (handlerC50752MbH != null && (looper = handlerC50752MbH.getLooper()) != null) {
                                looper.quitSafely();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            c55169OdX.A02 = null;
                            throw th;
                        }
                    }
                    throw AbstractC166987dD.A18(AnonymousClass001.A0O("Unsupported msg what = ", i));
                }
                C55169OdX.A00(this.A00);
                return;
            }
            C55169OdX.A03(this.A00, false);
            return;
        }
        C55169OdX c55169OdX2 = this.A00;
        String str = (String) message.obj;
        int i2 = message.arg1;
        if (c55169OdX2.A01 == null) {
            AbstractC12120kG.A01("BoomerangEncoder", "attempted to handle video recording without configuring first");
            return;
        }
        try {
            MediaMuxer mediaMuxer2 = new MediaMuxer(str, 0);
            c55169OdX2.A02 = mediaMuxer2;
            mediaMuxer2.setOrientationHint(i2);
            C0fT.A05(c55169OdX2.A01, -859442207);
            c55169OdX2.A09 = true;
        } catch (IOException e2) {
            C55169OdX.A01(c55169OdX2, e2, "IOException: Cannot create MediaMuxer");
        } catch (IllegalStateException e3) {
            C55169OdX.A02(c55169OdX2, e3);
        }
    }
}
