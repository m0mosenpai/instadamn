package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class UP6 extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public UP6(String str, String str2, String str3, List list) {
        C14360o3.A0B(list, 1);
        this.A03 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UP6) {
                UP6 up6 = (UP6) obj;
                if (!C14360o3.A0K(this.A03, up6.A03) || !C14360o3.A0K(this.A00, up6.A00) || !C14360o3.A0K(this.A01, up6.A01) || !C14360o3.A0K(this.A02, up6.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.A03.hashCode() * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
