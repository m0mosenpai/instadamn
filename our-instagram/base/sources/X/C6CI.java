package X;

/* renamed from: X.6CI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CI extends C58J implements C5DV, InterfaceC113435Af, InterfaceC1129358c {
    public C28802CnY A00;
    public InterfaceC16660sJ A01;
    public boolean A02;
    public final C137576Ld A03;

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        if (!this.A02) {
            C137576Ld c137576Ld = this.A03;
            c137576Ld.A01 = null;
            c137576Ld.A02 = interfaceC1129057z;
            AbstractC137676Lo.A00(this, new C9F8(2, c137576Ld, this));
            if (c137576Ld.A01 != null) {
                this.A02 = true;
            } else {
                AbstractC28290Cdc.A02("DrawResult not defined, did you forget to call onDraw?");
                throw C00O.createAndThrow();
            }
        }
        AnonymousClass699 anonymousClass699 = this.A03.A01;
        C14360o3.A0A(anonymousClass699);
        anonymousClass699.A00.invoke(interfaceC1129057z);
    }

    @Override // X.C5DV
    public final long Bxc() {
        return AbstractC119215ad.A01(((C59W) AbstractC114335Dx.A04(this, 128)).A03);
    }

    @Override // X.InterfaceC113435Af
    public final void COw() {
        C28802CnY c28802CnY = this.A00;
        if (c28802CnY != null) {
            c28802CnY.A00();
        }
        this.A02 = false;
        this.A03.A01 = null;
        C5Zx.A00(this);
    }

    public C6CI(C137576Ld c137576Ld, InterfaceC16660sJ interfaceC16660sJ) {
        this.A03 = c137576Ld;
        this.A01 = interfaceC16660sJ;
        c137576Ld.A00 = this;
        c137576Ld.A03 = new C9EV(this, 18);
    }

    @Override // X.InterfaceC113445Ag
    public final void DRD() {
        COw();
    }

    @Override // X.InterfaceC1129358c
    public final void DWO() {
        COw();
    }

    @Override // X.C5DV
    public final InterfaceC1128957x getDensity() {
        return AbstractC114335Dx.A02(this).A0C;
    }

    @Override // X.C5DV
    public final AnonymousClass583 getLayoutDirection() {
        return AbstractC114335Dx.A02(this).A0D;
    }
}
