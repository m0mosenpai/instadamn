package X;

/* renamed from: X.Onb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55650Onb implements XE6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.XE6
    public final void D6h(W63 w63) {
        C14360o3.A0B(w63, 0);
        ((InterfaceC23621Ds) this.A01).resumeWith(w63);
    }

    @Override // X.XE6
    public final void DFz(VIA via) {
        C14360o3.A0B(via, 0);
        ((InterfaceC23621Ds) this.A01).resumeWith(MSW.A1D(via));
    }

    public C55650Onb(InterfaceC58100PpP interfaceC58100PpP, C15370ps c15370ps, InterfaceC24901Jp interfaceC24901Jp, int i) {
        this.A00 = i;
        this.A01 = interfaceC24901Jp;
        this.A03 = interfaceC58100PpP;
        this.A02 = c15370ps;
    }

    @Override // X.XE6
    public final void D1z() {
        Object A1D;
        Object obj;
        Object A1D2;
        Object obj2;
        int i = this.A00;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
        InterfaceC58100PpP interfaceC58100PpP = (InterfaceC58100PpP) this.A03;
        C15370ps c15370ps = (C15370ps) this.A02;
        if (i != 0) {
            try {
                obj2 = c15370ps.A00;
            } catch (Throwable th) {
                A1D2 = MSW.A1D(th);
            }
            if (obj2 != null) {
                A1D2 = interfaceC58100PpP.FDr((InterfaceC57793PkK) obj2);
                interfaceC23621Ds.resumeWith(A1D2);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        try {
            obj = c15370ps.A00;
        } catch (Throwable th2) {
            A1D = MSW.A1D(th2);
        }
        if (obj != null) {
            A1D = interfaceC58100PpP.FDr((InterfaceC57793PkK) obj);
            interfaceC23621Ds.resumeWith(A1D);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XE6
    public final void onStart() {
    }

    @Override // X.XE6
    public final void Dbk(float f) {
    }
}
