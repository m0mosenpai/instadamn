package X;

/* loaded from: classes9.dex */
public final class PSW implements Runnable {
    public final /* synthetic */ C56395P2i A00;
    public final /* synthetic */ YRL A01;
    public final /* synthetic */ InterfaceC08830cm A02;

    public PSW(C56395P2i c56395P2i, YRL yrl, InterfaceC08830cm interfaceC08830cm) {
        this.A00 = c56395P2i;
        this.A02 = interfaceC08830cm;
        this.A01 = yrl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56395P2i c56395P2i = this.A00;
        c56395P2i.A06 = (InterfaceC197718oi) this.A02.get();
        c56395P2i.A07 = this.A01;
    }
}
