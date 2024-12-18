package X;

import com.instagram.user.model.User;

/* renamed from: X.H6s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38803H6s extends C0T6 implements JJ2 {
    public final User A00;

    public C38803H6s(User user) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38803H6s) && C14360o3.A0K(this.A00, ((C38803H6s) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
