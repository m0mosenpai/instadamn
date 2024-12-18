package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jwh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45052Jwh extends C0T6 {
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45052Jwh) {
                C45052Jwh c45052Jwh = (C45052Jwh) obj;
                if (!C14360o3.A0K(this.A03, c45052Jwh.A03) || !C14360o3.A0K(this.A04, c45052Jwh.A04) || !C14360o3.A0K(this.A00, c45052Jwh.A00) || !C14360o3.A0K(this.A02, c45052Jwh.A02) || !C14360o3.A0K(this.A01, c45052Jwh.A01) || !C14360o3.A0K(this.A05, c45052Jwh.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A05, (((((AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A01)) * 31);
    }

    public C45052Jwh(User user, String str, String str2, String str3, String str4, List list) {
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(list, 6);
        this.A03 = str;
        this.A04 = str2;
        this.A00 = user;
        this.A02 = str3;
        this.A01 = str4;
        this.A05 = list;
    }
}
