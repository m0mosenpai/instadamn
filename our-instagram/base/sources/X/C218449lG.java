package X;

/* renamed from: X.9lG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218449lG extends AbstractC223789uN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C218449lG) {
                C218449lG c218449lG = (C218449lG) obj;
                if (this.A00 != c218449lG.A00 || this.A01 != c218449lG.A01 || this.A02 != c218449lG.A02 || this.A03 != c218449lG.A03 || this.A07 != c218449lG.A07 || this.A05 != c218449lG.A05 || this.A04 != c218449lG.A04 || this.A06 != c218449lG.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A07, ((((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31))));
    }

    public C218449lG(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A07 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A06 = z4;
    }
}
