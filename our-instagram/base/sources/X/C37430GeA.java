package X;

/* renamed from: X.GeA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37430GeA extends C1I2 implements InterfaceC61352qx {
    public int A00;
    public final C61372qz A01 = new C61372qz();

    @Override // X.InterfaceC61352qx
    public final void EDY(C1I2 c1i2) {
        C14360o3.A0B(c1i2, 0);
        this.A01.A03(c1i2);
    }

    @Override // X.InterfaceC61352qx
    public final int Auo() {
        return this.A00;
    }

    @Override // X.InterfaceC61352qx
    public final void F9f(C1I2 c1i2) {
        this.A01.A02.remove(c1i2);
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(515721585);
        C14360o3.A0B(c3fq, 0);
        this.A01.onScroll(c3fq, i, i2, i3, i4, i5);
        C0f9.A0A(-1831386393, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A0N = AbstractC167017dG.A0N(c3fq, -1320659294);
        this.A00 = i;
        this.A01.onScrollStateChanged(c3fq, i);
        C0f9.A0A(-488369862, A0N);
    }
}
