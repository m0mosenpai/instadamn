package X;

import com.instagram.user.model.User;

/* renamed from: X.NdP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53050NdP extends AbstractC53585Nmr {
    public final User A00;
    public final String A01;

    public C53050NdP(User user, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53050NdP) {
                C53050NdP c53050NdP = (C53050NdP) obj;
                if (!C14360o3.A0K(this.A01, c53050NdP.A01) || !C14360o3.A0K(this.A00, c53050NdP.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }
}
