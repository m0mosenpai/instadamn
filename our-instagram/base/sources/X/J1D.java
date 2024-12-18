package X;

/* loaded from: classes7.dex */
public final class J1D implements InterfaceC62602sz {
    public final /* synthetic */ C41620IbA A00;

    public J1D(C41620IbA c41620IbA) {
        this.A00 = c41620IbA;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        HEK hek = this.A00.A07.A00;
        if (hek == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return AbstractC167007dF.A1O(hek.A01.A02());
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A00.A05;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC167007dF.A1X(this.A00.A02, C05F.A0C);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return this.A00.A05;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        C41620IbA.A00(this.A00, false);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC167007dF.A1X(this.A00.A02, C05F.A00);
    }
}
