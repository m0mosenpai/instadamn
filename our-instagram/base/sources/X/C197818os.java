package X;

/* renamed from: X.8os, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197818os implements InterfaceC179467xw {
    public InterfaceC179467xw A00;
    public final C197828ot A01 = new C197828ot();

    public final void A00(float f, float f2, float f3, int i, int i2, int i3, int i4) {
        C197828ot c197828ot = this.A01;
        if (c197828ot.A05 == i && c197828ot.A06 == i2 && c197828ot.A04 == i3 && c197828ot.A03 == i4 && c197828ot.A01 == f && c197828ot.A02 == f2 && c197828ot.A00 == f3) {
            return;
        }
        c197828ot.A05 = i;
        c197828ot.A06 = i2;
        c197828ot.A04 = i3;
        c197828ot.A03 = i4;
        c197828ot.A01 = f;
        c197828ot.A02 = f2;
        c197828ot.A00 = f3;
        ((AbstractC179397xp) c197828ot).A01 = true;
    }

    @Override // X.InterfaceC179467xw
    public final int ApO() {
        return this.A00.ApO();
    }

    @Override // X.InterfaceC179467xw
    public final int AxI() {
        return this.A00.AxI();
    }

    @Override // X.InterfaceC179467xw
    public final C68685VaL BD8() {
        return this.A00.BD8();
    }

    @Override // X.InterfaceC179467xw
    public final int BaI() {
        return this.A00.BaI();
    }

    @Override // X.InterfaceC179467xw
    public final long C8d() {
        return this.A00.C8d();
    }

    @Override // X.InterfaceC179467xw
    public final C179407xq CGV() {
        C179407xq CGV = this.A00.CGV();
        if (CGV != null) {
            C197828ot c197828ot = this.A01;
            c197828ot.A0A(CGV.A03);
            int i = CGV.A01;
            int i2 = CGV.A00;
            c197828ot.A09(i, i2, i, i2, 0, false, false);
        }
        return this.A01.A08();
    }

    @Override // X.InterfaceC179467xw
    public final boolean CVE() {
        return this.A00.CVE();
    }

    @Override // X.InterfaceC179467xw
    public final boolean CdG() {
        return this.A00.CdG();
    }

    @Override // X.InterfaceC179467xw
    public final void EVi(C68685VaL c68685VaL) {
        this.A00.EVi(c68685VaL);
    }

    @Override // X.InterfaceC179467xw
    public final AnonymousClass810 getTexture() {
        return this.A00.getTexture();
    }
}
