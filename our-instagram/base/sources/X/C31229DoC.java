package X;

import com.instagram.user.model.User;

/* renamed from: X.DoC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31229DoC extends AbstractC46458KhI {
    public final User A00;

    public C31229DoC(User user) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C31229DoC) && C14360o3.A0K(this.A00, ((C31229DoC) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OneOnOne(user=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
