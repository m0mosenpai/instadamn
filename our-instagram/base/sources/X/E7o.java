package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class E7o extends C0T6 implements InterfaceC37243Gas {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7o) {
                E7o e7o = (E7o) obj;
                if (!C14360o3.A0K(this.A01, e7o.A01) || !C14360o3.A0K(this.A00, e7o.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public E7o(User user, String str) {
        AbstractC167017dG.A1P(str, user);
        this.A01 = str;
        this.A00 = user;
    }
}
