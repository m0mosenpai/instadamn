package X;

/* loaded from: classes11.dex */
public final class U1V extends C1I2 {
    public int A00;
    public final XDv A01;

    public U1V(XDv xDv) {
        C14360o3.A0B(xDv, 1);
        this.A01 = xDv;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(339466338);
        if (this.A00 == i3 && (i3 - i2) - i <= 3) {
            this.A01.Chg();
        }
        this.A00 = i3;
        this.A01.DyB();
        C0f9.A0A(116434691, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03 = C0f9.A03(-2031754086);
        this.A01.CMc();
        C0f9.A0A(1475850944, A03);
    }
}
