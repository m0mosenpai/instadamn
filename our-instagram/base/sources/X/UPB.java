package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class UPB extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public UPB(String str, String str2, String str3, String str4, List list) {
        C14360o3.A0B(list, 6);
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A01 = str4;
        this.A04 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPB) {
                UPB upb = (UPB) obj;
                if (!C14360o3.A0K(this.A02, upb.A02) || !C14360o3.A0K(this.A00, upb.A00) || !C14360o3.A0K(this.A03, upb.A03) || !C14360o3.A0K(this.A01, upb.A01) || !C14360o3.A0K(this.A04, upb.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A04, ((((((this.A02.hashCode() * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31 * 31) + AbstractC167017dG.A0O(this.A01)) * 31) * 31 * 31 * 31;
    }
}
