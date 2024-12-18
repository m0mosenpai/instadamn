package X;

/* renamed from: X.NHv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52425NHv extends O29 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52425NHv) {
                C52425NHv c52425NHv = (C52425NHv) obj;
                if (this.A03 != c52425NHv.A03 || this.A04 != c52425NHv.A04 || this.A05 != c52425NHv.A05 || this.A00 != c52425NHv.A00 || Float.compare(20.0f, 20.0f) != 0 || this.A02 != c52425NHv.A02 || this.A01 != c52425NHv.A01 || this.A06 != c52425NHv.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public C52425NHv(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        super(C05F.A0C);
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A06 = z4;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, (((AbstractC166997dE.A00((AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A03))) + this.A00) * 31, 20.0f) + this.A02) * 31) + this.A01) * 31);
    }
}
