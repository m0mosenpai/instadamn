package X;

import com.instagram.user.model.User;

/* renamed from: X.H4x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38757H4x extends C0T6 implements InterfaceC58240Prk {
    public final User A00;
    public final C54M A01;
    public final Boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38757H4x) {
                C38757H4x c38757H4x = (C38757H4x) obj;
                if (!C14360o3.A0K(this.A01, c38757H4x.A01) || !C14360o3.A0K(this.A02, c38757H4x.A02) || !C14360o3.A0K(this.A00, c38757H4x.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38757H4x(C54M c54m, User user, Boolean bool) {
        this.A01 = c54m;
        this.A02 = bool;
        this.A00 = user;
    }
}
