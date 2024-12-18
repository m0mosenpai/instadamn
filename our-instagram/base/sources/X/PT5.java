package X;

/* loaded from: classes9.dex */
public final class PT5 implements Runnable {
    public final /* synthetic */ OLS A00;
    public final /* synthetic */ OmY A01;
    public final /* synthetic */ InterfaceC16660sJ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public PT5(OLS ols, OmY omY, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A01 = omY;
        this.A00 = ols;
        this.A03 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A02.A00(this.A00, this.A03, this.A02);
    }
}
