package X;

/* renamed from: X.JRo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43631JRo implements MRP {
    public C99G A00;
    public final InterfaceC2056798r A01;
    public final C28811aJ A02;
    public final C2DS A03;

    @Override // X.MRP
    public final void AV5(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3, String str) {
        AbstractC167007dF.A1D(abstractC46972Dl, 1, c4i3);
        C99G c99g = this.A00;
        if (c99g != null) {
            c99g.A02();
        }
        C99G c99g2 = new C99G(abstractC46972Dl, this.A01, this.A02, c4i3, str, true, true);
        c99g2.A03();
        this.A00 = c99g2;
    }

    @Override // X.MRP
    public final void Che(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        AbstractC167007dF.A1K(abstractC46972Dl, c4i3);
        C99G c99g = new C99G(abstractC46972Dl, this.A01, this.A02, c4i3, "page_scroll", false, false);
        c99g.A03();
        this.A00 = c99g;
    }

    @Override // X.MRP
    public final void EKd() {
    }

    @Override // X.MRP
    public final void EdV(AbstractC46972Dl abstractC46972Dl) {
    }

    @Override // X.MRP
    public final void pause() {
    }

    @Override // X.MRP
    public final void start() {
    }

    @Override // X.MRP
    public final void stop() {
    }

    @Override // X.MRP
    public final boolean CLW() {
        C99G c99g = this.A00;
        if (c99g == null || ((C7J1) c99g).A01) {
            return false;
        }
        return true;
    }

    @Override // X.MRP
    public final boolean CUG() {
        C99G c99g = this.A00;
        if (c99g == null || !((C7J1) c99g).A01 || ((C7J1) c99g).A03) {
            return false;
        }
        return true;
    }

    @Override // X.MRP
    public final boolean Cnw() {
        C99G c99g = this.A00;
        if (c99g != null) {
            c99g.A02();
            this.A00 = null;
            return true;
        }
        return false;
    }

    @Override // X.MRP
    public final boolean Eia() {
        C99G c99g = this.A00;
        boolean z = false;
        if (c99g != null && c99g.A02) {
            z = true;
        }
        return !z;
    }

    public C43631JRo(InterfaceC50423MOd interfaceC50423MOd, C28811aJ c28811aJ, C2DS c2ds) {
        this.A02 = c28811aJ;
        this.A03 = c2ds;
        this.A01 = new C44069Jdu(0, this, interfaceC50423MOd);
    }

    @Override // X.MRP
    public final boolean AFj(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        AbstractC167017dG.A1N(abstractC46972Dl, c4i3);
        C2DU c2du = (C2DU) this.A03;
        if (c2du.A0H.A0F && c2du.A0C.A0V(abstractC46972Dl, c4i3)) {
            return true;
        }
        return false;
    }

    @Override // X.MRP
    public final boolean isLoading() {
        return CLW();
    }
}
