package X;

/* loaded from: classes7.dex */
public final class J5G implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C75113Zb A02;

    public J5G(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        this.A02 = c75113Zb;
        this.A01 = c38321qM;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb = this.A02;
        int A0p = this.A01.A0p();
        if (A0p != c75113Zb.A04) {
            c75113Zb.A04 = A0p;
            C75113Zb.A00(c75113Zb, 38);
        }
        c75113Zb.A2V = false;
        c75113Zb.A0X = this.A00;
    }
}
