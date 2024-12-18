package X;

import android.os.SystemClock;

/* renamed from: X.TPt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64688TPt implements Runnable {
    public final long A00;
    public volatile boolean A01;
    public final /* synthetic */ T08 A02;

    public RunnableC64688TPt(T08 t08, long j) {
        this.A02 = t08;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (!this.A01) {
            long uptimeMillis = SystemClock.uptimeMillis() - (this.A00 / 1000000);
            long A00 = AbstractC37300Gc1.A00(uptimeMillis);
            if (16.666666f - ((float) uptimeMillis) >= 1.0f) {
                T08 t08 = this.A02;
                synchronized (t08.A0A) {
                    z = t08.A03;
                }
                if (z) {
                    t08.A09.callIdleCallbacks(A00);
                }
                t08.A00 = null;
            }
        }
    }
}
