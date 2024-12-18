package X;

import android.os.SystemClock;

/* loaded from: classes8.dex */
public final class JWP implements Runnable {
    public long A00 = SystemClock.elapsedRealtime();
    public volatile boolean A01;
    public final /* synthetic */ C43647JSf A02;

    public JWP(C43647JSf c43647JSf) {
        this.A02 = c43647JSf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.A01) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C43647JSf c43647JSf = this.A02;
            long j = c43647JSf.A00 + (elapsedRealtime - this.A00);
            c43647JSf.A00 = j;
            this.A00 = elapsedRealtime;
            MPN mpn = c43647JSf.A04;
            if (mpn != null) {
                mpn.DtA(j);
            }
            c43647JSf.A03.postDelayed(this, c43647JSf.A02);
        }
    }
}
