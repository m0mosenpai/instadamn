package X;

/* renamed from: X.K4n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45335K4n extends AbstractC53642Nnn {
    public final /* synthetic */ LJ4 A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ boolean A03;

    public C45335K4n(LJ4 lj4, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        this.A00 = lj4;
        this.A03 = z;
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
    }

    @Override // X.AbstractC53642Nnn
    public final void A00() {
        LJ4 lj4 = this.A00;
        C23031Ai A10 = AbstractC25226BEj.A10(lj4.A03);
        AbstractC167007dF.A1L(A10, A10.A1M, C23031Ai.A8c, 497, true);
        if (this.A03) {
            LLR.A02(EnumC46289KeL.PRE_LOCATION_PERMISSIONS_NUX, lj4.A02, "NUX_PROCEED", "TAP");
        }
        this.A02.invoke();
    }

    @Override // X.AbstractC53642Nnn
    public final void A01() {
        if (this.A03) {
            this.A00.A02.A0A(EnumC46289KeL.PRE_LOCATION_PERMISSIONS_NUX);
        }
        this.A01.invoke();
    }

    @Override // X.AbstractC53642Nnn
    public final void A02() {
        if (this.A03) {
            this.A00.A02.A0A(EnumC46289KeL.PRE_LOCATION_PERMISSIONS_NUX);
        }
        this.A01.invoke();
    }

    @Override // X.AbstractC53642Nnn
    public final void A03() {
        if (this.A03) {
            this.A00.A02.A0A(EnumC46289KeL.PRE_LOCATION_PERMISSIONS_NUX);
        }
        this.A01.invoke();
    }

    @Override // X.AbstractC53642Nnn
    public final void A04(Throwable th) {
        this.A01.invoke();
    }
}
