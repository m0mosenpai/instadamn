package X;

import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class H3N extends C0T6 implements InterfaceC43468JIg {
    public final XFB A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3N) {
                H3N h3n = (H3N) obj;
                if (!C14360o3.A0K(this.A00, h3n.A00) || !C14360o3.A0K(this.A02, h3n.A02) || !C14360o3.A0K(this.A03, h3n.A03) || !C14360o3.A0K(this.A04, h3n.A04) || !C14360o3.A0K(this.A05, h3n.A05) || !C14360o3.A0K(this.A01, h3n.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H3N(XFB xfb, User user, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.A00 = xfb;
        this.A02 = bool;
        this.A03 = bool2;
        this.A04 = bool3;
        this.A05 = str;
        this.A01 = user;
    }
}
