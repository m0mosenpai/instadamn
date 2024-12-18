package X;

/* loaded from: classes5.dex */
public final class D21 implements Runnable {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;

    public D21(C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE;
        this.A00 = c6fg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6FQ c6fq = this.A01;
        InterfaceC103384lE interfaceC103384lE = this.A02;
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A01(this.A00);
        AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
    }
}
