package X;

/* loaded from: classes4.dex */
public final class AVY implements BDZ {
    public final /* synthetic */ AKN A00;

    @Override // X.BDZ
    public final void D1S(Exception exc) {
    }

    @Override // X.BDZ
    public final void D1X(String str, String str2) {
    }

    @Override // X.BDZ
    public final void D1b() {
    }

    public AVY(AKN akn) {
        this.A00 = akn;
    }

    @Override // X.BDZ
    public final void D1W() {
        AKN akn = this.A00;
        InterfaceC179867yc interfaceC179867yc = akn.A0E;
        if (interfaceC179867yc.Bfy() != null) {
            akn.A02 = interfaceC179867yc.Bfy().getWidth();
            akn.A01 = interfaceC179867yc.Bfy().getHeight();
        }
    }
}
