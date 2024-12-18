package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class E9M extends C0T6 implements InterfaceC37096GWf {
    public final User A00;

    public E9M(User user) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E9M) && C14360o3.A0K(this.A00, ((E9M) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
