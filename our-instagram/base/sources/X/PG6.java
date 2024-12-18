package X;

/* loaded from: classes9.dex */
public final class PG6 implements InterfaceC58075Pp0 {
    public final /* synthetic */ NVj A00;

    public PG6(NVj nVj) {
        this.A00 = nVj;
    }

    @Override // X.InterfaceC58075Pp0
    public final void D1x() {
        NVj nVj = this.A00;
        MSY.A1G(nVj.A06);
        nVj.A0B = true;
    }

    @Override // X.InterfaceC58075Pp0
    public final void D70() {
        NVj nVj = this.A00;
        nVj.A02();
        InterfaceC57990Pna interfaceC57990Pna = nVj.A06;
        if (interfaceC57990Pna != null) {
            interfaceC57990Pna.afterSelection(true);
        }
        nVj.A0B = true;
    }
}
