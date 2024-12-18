package X;

/* renamed from: X.Bf9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26020Bf9 extends C0T6 {
    public final int A00;
    public final C47P A01;
    public final Integer A02;
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
            if (obj instanceof C26020Bf9) {
                C26020Bf9 c26020Bf9 = (C26020Bf9) obj;
                if (!C14360o3.A0K(this.A01, c26020Bf9.A01) || this.A00 != c26020Bf9.A00 || !C14360o3.A0K(this.A06, c26020Bf9.A06) || !C14360o3.A0K(this.A05, c26020Bf9.A05) || !C14360o3.A0K(this.A07, c26020Bf9.A07) || !C14360o3.A0K(this.A08, c26020Bf9.A08) || !C14360o3.A0K(this.A04, c26020Bf9.A04) || !C14360o3.A0K(this.A03, c26020Bf9.A03) || this.A02 != c26020Bf9.A02 || this.A09 != c26020Bf9.A09 || this.A0A != c26020Bf9.A0A || this.A0B != c26020Bf9.A0B || this.A0C != c26020Bf9.A0C) {
                }
            }
            return false;
        }
        return true;
    }

    public C26020Bf9(C47P c47p, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(num, 9);
        this.A01 = c47p;
        this.A00 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A04 = str5;
        this.A03 = str6;
        this.A02 = num;
        this.A09 = z;
        this.A0A = z2;
        this.A0B = z3;
        this.A0C = z4;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0C, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, (((((((((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A06, (AbstractC166987dD.A0G(this.A01) + this.A00) * 31)) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31) + CJK.A00(this.A02)) * 31))));
    }
}
