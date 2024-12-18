package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E6S extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public E6S(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        C14360o3.A0B(list, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A06 = list;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6S) {
                E6S e6s = (E6S) obj;
                if (!C14360o3.A0K(this.A00, e6s.A00) || !C14360o3.A0K(this.A01, e6s.A01) || !C14360o3.A0K(this.A06, e6s.A06) || !C14360o3.A0K(this.A02, e6s.A02) || !C14360o3.A0K(this.A03, e6s.A03) || !C14360o3.A0K(this.A04, e6s.A04) || !C14360o3.A0K(this.A05, e6s.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A06, ((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05);
    }
}
