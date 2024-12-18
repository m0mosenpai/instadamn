package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E6U extends C0T6 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6U) {
                E6U e6u = (E6U) obj;
                if (!C14360o3.A0K(this.A07, e6u.A07) || !C14360o3.A0K(this.A00, e6u.A00) || !C14360o3.A0K(this.A02, e6u.A02) || !C14360o3.A0K(this.A03, e6u.A03) || !C14360o3.A0K(this.A04, e6u.A04) || !C14360o3.A0K(this.A05, e6u.A05) || !C14360o3.A0K(this.A06, e6u.A06) || !C14360o3.A0K(this.A01, e6u.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0M(this.A07) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public E6U(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list) {
        this.A07 = list;
        this.A00 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A01 = num2;
    }
}
