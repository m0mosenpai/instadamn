package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H7U extends C0T6 implements JJ7 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7U) {
                H7U h7u = (H7U) obj;
                if (!C14360o3.A0K(this.A00, h7u.A00) || !C14360o3.A0K(this.A04, h7u.A04) || !C14360o3.A0K(this.A01, h7u.A01) || !C14360o3.A0K(this.A02, h7u.A02) || !C14360o3.A0K(this.A03, h7u.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public H7U(String str, String str2, String str3, String str4, List list) {
        this.A00 = str;
        this.A04 = list;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
