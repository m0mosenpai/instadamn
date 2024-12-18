package X;

import android.os.Handler;

/* loaded from: classes9.dex */
public final class OJW {
    public boolean A00;
    public final long A01;
    public final InterfaceC58004Pno A03;
    public final InterfaceC08830cm A05;
    public final Handler A02 = AbstractC167007dF.A0J();
    public final Runnable A04 = new RunnableC56945POm(this);

    public final void A00() {
        long j;
        Handler handler = this.A02;
        Runnable runnable = this.A04;
        handler.removeCallbacks(runnable);
        InterfaceC58192Pqy interfaceC58192Pqy = (InterfaceC58192Pqy) this.A05.get();
        if (interfaceC58192Pqy != null && interfaceC58192Pqy.C9p() >= this.A01) {
            j = 10000;
        } else {
            j = 1000;
        }
        handler.postDelayed(runnable, j);
    }

    public OJW(InterfaceC58004Pno interfaceC58004Pno, InterfaceC08830cm interfaceC08830cm, long j) {
        this.A01 = j;
        this.A05 = interfaceC08830cm;
        this.A03 = interfaceC58004Pno;
    }
}
