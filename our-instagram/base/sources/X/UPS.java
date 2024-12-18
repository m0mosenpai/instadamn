package X;

/* loaded from: classes11.dex */
public final class UPS extends C0T6 {
    public final C26069Bfx A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPS) {
                UPS ups = (UPS) obj;
                if (!C14360o3.A0K(this.A05, ups.A05) || !C14360o3.A0K(this.A03, ups.A03) || !C14360o3.A0K(this.A09, ups.A09) || !C14360o3.A0K(this.A08, ups.A08) || !C14360o3.A0K(this.A07, ups.A07) || !C14360o3.A0K(this.A02, ups.A02) || !C14360o3.A0K(this.A00, ups.A00) || !C14360o3.A0K(this.A01, ups.A01) || !C14360o3.A0K(this.A06, ups.A06) || !C14360o3.A0K(this.A04, ups.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((((((((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public UPS(C26069Bfx c26069Bfx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A05 = str;
        this.A03 = str2;
        this.A09 = str3;
        this.A08 = str4;
        this.A07 = str5;
        this.A02 = str6;
        this.A00 = c26069Bfx;
        this.A01 = str7;
        this.A06 = str8;
        this.A04 = str9;
    }
}
