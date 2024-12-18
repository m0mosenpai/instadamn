package X;

/* renamed from: X.FrE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35776FrE implements InterfaceC71884X8r {
    public final /* synthetic */ C35229FgM A00;

    public C35776FrE(C35229FgM c35229FgM) {
        this.A00 = c35229FgM;
    }

    @Override // X.InterfaceC71884X8r
    public final void DeM() {
        C35229FgM c35229FgM = this.A00;
        c35229FgM.A0F.compareAndSet(true, false);
        C35229FgM.A03(c35229FgM, false);
        C35229FgM.A00(c35229FgM);
    }
}
