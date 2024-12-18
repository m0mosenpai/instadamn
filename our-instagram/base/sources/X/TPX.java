package X;

/* loaded from: classes10.dex */
public final class TPX implements Runnable {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ String A02;

    public TPX(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, String str) {
        this.A02 = str;
        this.A01 = interfaceC103384lE;
        this.A00 = c6fq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A01(this.A02);
        C131845xK.A00(this.A00, A0s.A00(), this.A01);
    }
}
