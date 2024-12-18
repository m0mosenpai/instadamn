package X;

/* renamed from: X.WwD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71563WwD implements Runnable {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;

    public RunnableC71563WwD(C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE;
        this.A00 = c6fg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6FQ c6fq = this.A01;
        InterfaceC103384lE interfaceC103384lE = this.A02;
        C6FX c6fx = new C6FX();
        c6fx.A01(this.A00);
        AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
    }
}
