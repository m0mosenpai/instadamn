package X;

import com.instagram.api.schemas.DirectMediaFallbackUrl;

/* loaded from: classes6.dex */
public final class E6Q extends C0T6 {
    public final DirectMediaFallbackUrl A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6Q) {
                E6Q e6q = (E6Q) obj;
                if (!C14360o3.A0K(this.A00, e6q.A00) || !C14360o3.A0K(this.A01, e6q.A01) || !C14360o3.A0K(this.A05, e6q.A05) || !C14360o3.A0K(this.A02, e6q.A02) || !C14360o3.A0K(this.A06, e6q.A06) || !C14360o3.A0K(this.A04, e6q.A04) || !C14360o3.A0K(this.A03, e6q.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public E6Q(DirectMediaFallbackUrl directMediaFallbackUrl, Integer num, Integer num2, Integer num3, Long l, String str, String str2) {
        this.A00 = directMediaFallbackUrl;
        this.A01 = num;
        this.A05 = str;
        this.A02 = num2;
        this.A06 = str2;
        this.A04 = l;
        this.A03 = num3;
    }
}
