package X;

/* renamed from: X.BfA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26021BfA extends C0T6 {
    public final AbstractC27461CAe A00;
    public final C5QE A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final String A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26021BfA) {
                C26021BfA c26021BfA = (C26021BfA) obj;
                if (!C14360o3.A0K(this.A07, c26021BfA.A07) || !C14360o3.A0K(this.A06, c26021BfA.A06) || !C14360o3.A0K(this.A04, c26021BfA.A04) || !C14360o3.A0K(this.A08, c26021BfA.A08) || !C14360o3.A0K(this.A0E, c26021BfA.A0E) || this.A0B != c26021BfA.A0B || this.A0D != c26021BfA.A0D || !C14360o3.A0K(this.A00, c26021BfA.A00) || !C14360o3.A0K(this.A09, c26021BfA.A09) || !C14360o3.A0K(this.A03, c26021BfA.A03) || !C14360o3.A0K(this.A01, c26021BfA.A01) || !C14360o3.A0K(this.A0A, c26021BfA.A0A) || this.A0C != c26021BfA.A0C || !C14360o3.A0K(this.A05, c26021BfA.A05) || !C14360o3.A0K(this.A02, c26021BfA.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0C, (((((((AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0B, (((AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A07))) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31))) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public C26021BfA(AbstractC27461CAe abstractC27461CAe, C5QE c5qe, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3) {
        this.A07 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A08 = str4;
        this.A0E = str5;
        this.A0B = z;
        this.A0D = z2;
        this.A00 = abstractC27461CAe;
        this.A09 = str6;
        this.A03 = str7;
        this.A01 = c5qe;
        this.A0A = str8;
        this.A0C = z3;
        this.A05 = str9;
        this.A02 = str10;
    }
}
