package X;

/* loaded from: classes10.dex */
public final /* synthetic */ class TJJ implements Runnable {
    public final /* synthetic */ C63651SrH A00;

    public /* synthetic */ TJJ(C63651SrH c63651SrH) {
        this.A00 = c63651SrH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63651SrH c63651SrH = this.A00;
        if (c63651SrH.A00 == 0) {
            c63651SrH.A00 = 1;
            C48442Kl.A00();
            C2WP c2wp = c63651SrH.A08;
            C63650SrG c63650SrG = c63651SrH.A06;
            if (c63650SrG.A04.A04(null, c63651SrH.A05)) {
                C62942SYk c62942SYk = c63650SrG.A08;
                synchronized (c62942SYk.A01) {
                    C48442Kl.A00();
                    c62942SYk.A00(c2wp);
                    TMk tMk = new TMk(c2wp, c62942SYk);
                    c62942SYk.A03.put(c2wp, tMk);
                    c62942SYk.A02.put(c2wp, c63651SrH);
                    ((C2L9) c62942SYk.A00).A00.postDelayed(tMk, 600000L);
                }
                return;
            }
            C63651SrH.A00(c63651SrH);
            return;
        }
        C48442Kl.A00();
    }
}
