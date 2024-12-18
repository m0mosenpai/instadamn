package X;

/* renamed from: X.Msd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51708Msd extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51708Msd) {
                C51708Msd c51708Msd = (C51708Msd) obj;
                if (this.A0F != c51708Msd.A0F || this.A03 != c51708Msd.A03 || this.A04 != c51708Msd.A04 || this.A05 != c51708Msd.A05 || this.A06 != c51708Msd.A06 || this.A08 != c51708Msd.A08 || this.A09 != c51708Msd.A09 || this.A0C != c51708Msd.A0C || this.A0D != c51708Msd.A0D || this.A0E != c51708Msd.A0E || this.A07 != c51708Msd.A07 || !C14360o3.A0K(this.A01, c51708Msd.A01) || this.A0A != c51708Msd.A0A || !C14360o3.A0K(this.A02, c51708Msd.A02) || this.A00 != c51708Msd.A00 || this.A0B != c51708Msd.A0B) {
                }
            }
            return false;
        }
        return true;
    }

    public C51708Msd(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        AbstractC25229BEm.A1N(str, 12, str2);
        this.A0F = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A06 = z5;
        this.A08 = z6;
        this.A09 = z7;
        this.A0C = z8;
        this.A0D = z9;
        this.A0E = z10;
        this.A07 = z11;
        this.A01 = str;
        this.A0A = z12;
        this.A02 = str2;
        this.A00 = i;
        this.A0B = z13;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0B, (AbstractC166997dE.A0K(this.A02, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0K(this.A01, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC25225BEi.A08(this.A0F)))))))))))))) + this.A00) * 31);
    }

    public C51708Msd() {
        this("", "", 0, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }
}
