package X;

/* loaded from: classes6.dex */
public final class E6P extends C0T6 {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6P) {
                E6P e6p = (E6P) obj;
                if (!C14360o3.A0K(this.A04, e6p.A04) || !C14360o3.A0K(this.A00, e6p.A00) || !C14360o3.A0K(this.A05, e6p.A05) || !C14360o3.A0K(this.A06, e6p.A06) || !C14360o3.A0K(this.A03, e6p.A03) || !C14360o3.A0K(this.A01, e6p.A01) || !C14360o3.A0K(this.A02, e6p.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public E6P(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3) {
        this.A04 = str;
        this.A00 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = l;
        this.A01 = num2;
        this.A02 = num3;
    }
}
