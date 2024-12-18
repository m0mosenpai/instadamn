package X;

/* renamed from: X.BHy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25303BHy extends C0T6 {
    public final BJ3 A00;
    public final C47P A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C25303BHy(BJ3 bj3, C47P c47p, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        C14360o3.A0B(bj3, 11);
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = str5;
        this.A02 = str6;
        this.A0B = true;
        this.A0A = true;
        this.A08 = z;
        this.A09 = z2;
        this.A00 = bj3;
        this.A01 = c47p;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25303BHy) {
                C25303BHy c25303BHy = (C25303BHy) obj;
                if (!C14360o3.A0K(this.A05, c25303BHy.A05) || !C14360o3.A0K(this.A04, c25303BHy.A04) || !C14360o3.A0K(this.A06, c25303BHy.A06) || !C14360o3.A0K(this.A07, c25303BHy.A07) || !C14360o3.A0K(this.A03, c25303BHy.A03) || !C14360o3.A0K(this.A02, c25303BHy.A02) || this.A0B != c25303BHy.A0B || this.A0A != c25303BHy.A0A || this.A08 != c25303BHy.A08 || this.A09 != c25303BHy.A09 || this.A00 != c25303BHy.A00 || !C14360o3.A0K(this.A01, c25303BHy.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0B, (((((AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A05))) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31))))));
    }
}
