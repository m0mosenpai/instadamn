package X;

/* renamed from: X.BWu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC25684BWu implements Runnable {
    public final /* synthetic */ C27858CPv A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ C102884kP A03;
    public final /* synthetic */ Runnable A04;

    public RunnableC25684BWu(C27858CPv c27858CPv, C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2, Runnable runnable) {
        this.A00 = c27858CPv;
        this.A03 = c102884kP;
        this.A04 = runnable;
        this.A02 = c102884kP2;
        this.A01 = c6fg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C27858CPv c27858CPv = this.A00;
        c27858CPv.A00 = null;
        if (!c27858CPv.A01) {
            c27858CPv.A01 = true;
            InterfaceC103384lE A0A = this.A03.A0A();
            if (A0A != null) {
                C102884kP c102884kP = this.A02;
                C6FG c6fg = this.A01;
                C6FX A0s = AbstractC25225BEi.A0s();
                A0s.A01(c102884kP);
                C6FP.A03(c6fg, c102884kP, AbstractC25227BEk.A0f(A0s, c6fg, 1), A0A);
            }
        }
        InterfaceC103384lE A09 = this.A03.A09();
        if (A09 != null) {
            C102884kP c102884kP2 = this.A02;
            C6FG c6fg2 = this.A01;
            C6FX A0s2 = AbstractC25225BEi.A0s();
            A0s2.A01(c102884kP2);
            C6FP.A03(c6fg2, c102884kP2, AbstractC25227BEk.A0f(A0s2, c6fg2, 1), A09);
        }
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
