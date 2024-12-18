package X;

import android.os.Handler;

/* renamed from: X.SYh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62939SYh {
    public static volatile Handler A03;
    public final C63335Shm A00;
    public final Runnable A01 = new TLQ(this);
    public volatile long A02;

    public static final Handler A00(AbstractC62939SYh abstractC62939SYh) {
        Handler handler;
        if (A03 != null) {
            return A03;
        }
        synchronized (AbstractC62939SYh.class) {
            if (A03 == null) {
                A03 = new Handler(abstractC62939SYh.A00.A00.getMainLooper());
            }
            handler = A03;
        }
        return handler;
    }

    public final void A01(long j) {
        this.A02 = 0L;
        Handler A00 = A00(this);
        Runnable runnable = this.A01;
        A00.removeCallbacks(runnable);
        if (j >= 0) {
            C63335Shm c63335Shm = this.A00;
            this.A02 = System.currentTimeMillis();
            if (!A00(this).postDelayed(runnable, j)) {
                C60687RMf c60687RMf = c63335Shm.A0C;
                C63335Shm.A02(c60687RMf);
                c60687RMf.A0G("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public AbstractC62939SYh(C63335Shm c63335Shm) {
        this.A00 = c63335Shm;
    }
}
