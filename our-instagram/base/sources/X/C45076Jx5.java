package X;

/* renamed from: X.Jx5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45076Jx5 extends C0T6 {
    public final long A00;
    public final Long A01;
    public final Long A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45076Jx5) {
                C45076Jx5 c45076Jx5 = (C45076Jx5) obj;
                if (!C14360o3.A0K(this.A0A, c45076Jx5.A0A) || this.A00 != c45076Jx5.A00 || !C14360o3.A0K(this.A02, c45076Jx5.A02) || !C14360o3.A0K(this.A01, c45076Jx5.A01) || !C14360o3.A0K(this.A05, c45076Jx5.A05) || !C14360o3.A0K(this.A04, c45076Jx5.A04) || !C14360o3.A0K(this.A03, c45076Jx5.A03) || !C14360o3.A0K(this.A08, c45076Jx5.A08) || !C14360o3.A0K(this.A0B, c45076Jx5.A0B) || !C14360o3.A0K(this.A09, c45076Jx5.A09) || !C14360o3.A0K(this.A06, c45076Jx5.A06) || !C14360o3.A0K(this.A07, c45076Jx5.A07) || !C14360o3.A0K(this.A0C, c45076Jx5.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((AbstractC25236BEt.A01(this.A00, AbstractC167017dG.A0O(this.A0A) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC25227BEk.A07(this.A0C);
    }

    public C45076Jx5(Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j) {
        this.A0A = str;
        this.A00 = j;
        this.A02 = l;
        this.A01 = l2;
        this.A05 = l3;
        this.A04 = l4;
        this.A03 = l5;
        this.A08 = str2;
        this.A0B = str3;
        this.A09 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A0C = str7;
    }
}
