package X;

/* loaded from: classes10.dex */
public final class TK8 implements Runnable {
    public final /* synthetic */ C64082Syy A00;

    public TK8(C64082Syy c64082Syy) {
        this.A00 = c64082Syy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64082Syy c64082Syy = this.A00;
        RhR rhR = RhR.A0M;
        if (c64082Syy.A0E) {
            c64082Syy.A0E = false;
            c64082Syy.A0D.A0B();
            c64082Syy.A0D.A08(rhR);
            C64082Syy.A02(c64082Syy, null);
        }
    }
}
