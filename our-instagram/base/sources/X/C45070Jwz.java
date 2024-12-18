package X;

/* renamed from: X.Jwz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45070Jwz extends C0T6 {
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45070Jwz) {
                C45070Jwz c45070Jwz = (C45070Jwz) obj;
                if (this.A01 != c45070Jwz.A01 || this.A00 != c45070Jwz.A00 || !C14360o3.A0K(this.A07, c45070Jwz.A07) || !C14360o3.A0K(this.A04, c45070Jwz.A04) || !C14360o3.A0K(this.A06, c45070Jwz.A06) || !C14360o3.A0K(this.A02, c45070Jwz.A02) || !C14360o3.A0K(this.A03, c45070Jwz.A03) || !C14360o3.A0K(this.A05, c45070Jwz.A05) || !C14360o3.A0K(this.A08, c45070Jwz.A08) || !C14360o3.A0K(this.A0A, c45070Jwz.A0A) || !C14360o3.A0K(this.A09, c45070Jwz.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return ((((((((((((((AbstractC166997dE.A0K(this.A07, AbstractC167007dF.A07(this.A00, ((int) (j ^ (j >>> 32))) * 31)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC25227BEk.A07(this.A09);
    }

    public C45070Jwz(Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        this.A07 = str;
        this.A04 = l;
        this.A06 = str2;
        this.A02 = num;
        this.A03 = l2;
        this.A05 = l3;
        this.A08 = str3;
        this.A0A = str4;
        this.A09 = str5;
    }
}
