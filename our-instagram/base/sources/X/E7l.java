package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class E7l extends C0T6 implements InterfaceC37241Gaq {
    public final User A00;
    public final String A01;

    public E7l(User user, String str) {
        C14360o3.A0B(user, 2);
        this.A01 = str;
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7l) {
                E7l e7l = (E7l) obj;
                if (!C14360o3.A0K(this.A01, e7l.A01) || !C14360o3.A0K(this.A00, e7l.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0O(this.A01) * 31);
    }
}
