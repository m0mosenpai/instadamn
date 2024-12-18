package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class E7i extends C0T6 implements InterfaceC58223PrT {
    public final User A00;
    public final Boolean A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7i) {
                E7i e7i = (E7i) obj;
                if (!C14360o3.A0K(this.A02, e7i.A02) || !C14360o3.A0K(this.A01, e7i.A01) || !C14360o3.A0K(this.A00, e7i.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31);
    }

    public E7i(User user, Boolean bool, String str) {
        AbstractC167017dG.A1Q(str, user);
        this.A02 = str;
        this.A01 = bool;
        this.A00 = user;
    }
}
