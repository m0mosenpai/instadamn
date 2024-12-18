package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class E9D extends C0T6 implements InterfaceC37094GWd {
    public final User A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E9D) && C14360o3.A0K(this.A00, ((E9D) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public E9D(User user) {
        this.A00 = user;
    }
}
