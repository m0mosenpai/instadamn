package X;

/* renamed from: X.Gyw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38655Gyw extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38655Gyw) {
                C38655Gyw c38655Gyw = (C38655Gyw) obj;
                if (!C14360o3.A0K(this.A07, c38655Gyw.A07) || !C14360o3.A0K(this.A04, c38655Gyw.A04) || !C14360o3.A0K(this.A08, c38655Gyw.A08) || !C14360o3.A0K(this.A06, c38655Gyw.A06) || !C14360o3.A0K(this.A00, c38655Gyw.A00) || this.A0A != c38655Gyw.A0A || !C14360o3.A0K(this.A05, c38655Gyw.A05) || !C14360o3.A0K(this.A02, c38655Gyw.A02) || this.A0C != c38655Gyw.A0C || this.A0B != c38655Gyw.A0B || !C14360o3.A0K(this.A03, c38655Gyw.A03) || !C14360o3.A0K(this.A01, c38655Gyw.A01) || this.A09 != c38655Gyw.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A09, ((((AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0C, (((AbstractC167007dF.A0D(this.A0A, (((((((AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A07)) + AbstractC53644Nnp.A00()) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A01)) * 31);
    }

    public C38655Gyw(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167017dG.A1P(str, str2);
        this.A07 = str;
        this.A04 = str2;
        this.A08 = str3;
        this.A06 = str4;
        this.A00 = str5;
        this.A0A = z;
        this.A05 = str6;
        this.A02 = str7;
        this.A0C = z2;
        this.A0B = z3;
        this.A03 = str8;
        this.A01 = str9;
        this.A09 = z4;
    }
}
