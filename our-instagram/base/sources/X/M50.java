package X;

/* loaded from: classes8.dex */
public final class M50 implements Runnable {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ String A02;

    public M50(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, String str) {
        this.A00 = c6fq;
        this.A01 = interfaceC103384lE;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6FQ c6fq = this.A00;
        InterfaceC103384lE interfaceC103384lE = this.A01;
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A01(this.A02);
        AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
    }
}
