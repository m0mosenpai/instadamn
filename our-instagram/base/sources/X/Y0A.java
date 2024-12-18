package X;

import android.os.Handler;

/* loaded from: classes12.dex */
public final class Y0A {
    public Handler A02;
    public C72671Xkm A03;
    public long A00 = 0;
    public long A01 = 0;
    public final Runnable A04 = new YGF(this);

    public static synchronized void A00(Y0A y0a) {
        synchronized (y0a) {
            Handler handler = y0a.A02;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            C175907s4.A02(y0a.A02, false, true);
            y0a.A02 = null;
        }
    }
}
