package X;

import com.instagram.user.model.User;

/* renamed from: X.E5z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32047E5z extends C0T6 {
    public final User A00;

    public C32047E5z(User user) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32047E5z) && C14360o3.A0K(this.A00, ((C32047E5z) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
