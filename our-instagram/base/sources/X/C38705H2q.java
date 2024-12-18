package X;

import com.instagram.user.model.User;

/* renamed from: X.H2q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38705H2q extends C0T6 implements JJD {
    public final int A00;
    public final User A01;

    public C38705H2q(User user, int i) {
        C14360o3.A0B(user, 2);
        this.A00 = i;
        this.A01 = user;
    }

    @Override // X.JJD
    public final C38705H2q EsJ(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38705H2q) {
                C38705H2q c38705H2q = (C38705H2q) obj;
                if (this.A00 != c38705H2q.A00 || !C14360o3.A0K(this.A01, c38705H2q.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, this.A00 * 31);
    }
}
