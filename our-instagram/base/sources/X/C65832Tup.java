package X;

import android.os.Handler;

/* renamed from: X.Tup, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65832Tup {
    public RunnableC65833Tuq A00;
    public final Handler A01 = new Handler();
    public final C0eR A02;

    private final void A00(C07R c07r) {
        RunnableC65833Tuq runnableC65833Tuq = this.A00;
        if (runnableC65833Tuq != null) {
            runnableC65833Tuq.run();
        }
        RunnableC65833Tuq runnableC65833Tuq2 = new RunnableC65833Tuq(c07r, this.A02);
        this.A00 = runnableC65833Tuq2;
        this.A01.postAtFrontOfQueue(runnableC65833Tuq2);
    }

    public final C0eR A01() {
        return this.A02;
    }

    public final void A02() {
        A00(C07R.ON_START);
    }

    public final void A03() {
        A00(C07R.ON_CREATE);
    }

    public final void A04() {
        A00(C07R.ON_STOP);
        A00(C07R.ON_DESTROY);
    }

    public final void A05() {
        A00(C07R.ON_START);
    }

    public C65832Tup(C07X c07x) {
        this.A02 = new C0eR(c07x);
    }
}
