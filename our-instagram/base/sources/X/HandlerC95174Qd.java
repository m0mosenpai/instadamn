package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.EnumSet;

/* renamed from: X.4Qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC95174Qd extends Handler {
    public final /* synthetic */ C4QT A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC95174Qd(C4QT c4qt) {
        super(Looper.getMainLooper());
        this.A00 = c4qt;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                C4QT c4qt = this.A00;
                EnumSet enumSet = C4QT.A1M;
                if (c4qt.A0M == C3Q0.PLAYING && c4qt.A0K != null) {
                    if (c4qt.A0O != null) {
                        final int currentPositionMs = c4qt.getCurrentPositionMs();
                        int Azm = c4qt.Azm();
                        float f = Azm;
                        float f2 = currentPositionMs / f;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (c4qt.A13 && c4qt.A0S) {
                            final int i2 = c4qt.A05;
                            c4qt.A0l.A01(1827799077, new Runnable() { // from class: X.J5W
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C4QT.A0J(HandlerC95174Qd.this.A00, currentPositionMs - i2);
                                }
                            });
                        }
                        C4SE c4se = c4qt.A0O;
                        long j = elapsedRealtime - c4se.A02;
                        int i3 = c4qt.A04;
                        if (j >= i3) {
                            c4se.A02 = elapsedRealtime;
                            float f3 = f2 - c4se.A00;
                            c4se.A00 = f2;
                            float f4 = (i3 / 100.0f) / f;
                            if (f3 < 0.0f || f3 > f4) {
                                z = false;
                            }
                            c4se.A06 = z;
                            c4qt.A0N.onProgressStateChanged(z);
                        }
                        c4qt.A0N.onProgressUpdate(currentPositionMs, Azm, c4qt.A0O.A06);
                    }
                    sendEmptyMessageDelayed(2, c4qt.A06);
                    return;
                }
                return;
            }
            return;
        }
        C4QT c4qt2 = this.A00;
        EnumSet enumSet2 = C4QT.A1M;
        C4SE c4se2 = c4qt2.A0O;
        if (c4se2 == null) {
            return;
        }
        c4qt2.A0N.onVideoDownloading(c4se2.A0B);
    }
}
