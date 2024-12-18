package X;

/* renamed from: X.Mra, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51643Mra extends C0T6 {
    public final int A00;
    public final int A01;
    public final C5QE A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51643Mra) {
                C51643Mra c51643Mra = (C51643Mra) obj;
                if (this.A05 != c51643Mra.A05 || this.A09 != c51643Mra.A09 || this.A0A != c51643Mra.A0A || this.A06 != c51643Mra.A06 || !C14360o3.A0K(this.A02, c51643Mra.A02) || this.A01 != c51643Mra.A01 || !C14360o3.A0K(this.A03, c51643Mra.A03) || this.A04 != c51643Mra.A04 || this.A07 != c51643Mra.A07 || this.A08 != c51643Mra.A08 || this.A00 != c51643Mra.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0K(this.A03, (((AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, AbstractC25225BEi.A08(this.A05)))) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A01) * 31)))) + this.A00;
    }

    public C51643Mra(C5QE c5qe, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A05 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A06 = z4;
        this.A02 = c5qe;
        this.A01 = i;
        this.A03 = str;
        this.A04 = z5;
        this.A07 = z6;
        this.A08 = z7;
        this.A00 = i2;
    }
}
