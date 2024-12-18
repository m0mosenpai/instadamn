package X;

/* loaded from: classes8.dex */
public final class M6V implements Runnable {
    public final /* synthetic */ C19260xA A00;
    public final /* synthetic */ InterfaceC37261GbE A01;
    public final /* synthetic */ C1OW A02;
    public final /* synthetic */ C49235Lpq A03;

    public M6V(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C49235Lpq c49235Lpq) {
        this.A03 = c49235Lpq;
        this.A02 = c1ow;
        this.A00 = c19260xA;
        this.A01 = interfaceC37261GbE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C49235Lpq c49235Lpq = this.A03;
        C49235Lpq.A00(this.A00, this.A01, this.A02, c49235Lpq);
    }
}
