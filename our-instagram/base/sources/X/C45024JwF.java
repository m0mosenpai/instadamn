package X;

import com.instagram.user.model.User;

/* renamed from: X.JwF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45024JwF extends C0T6 {
    public final C32050E6c A00;
    public final User A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45024JwF) {
                C45024JwF c45024JwF = (C45024JwF) obj;
                if (!C14360o3.A0K(this.A02, c45024JwF.A02) || !C14360o3.A0K(this.A01, c45024JwF.A01) || !C14360o3.A0K(this.A00, c45024JwF.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C45024JwF(C32050E6c c32050E6c, User user, String str) {
        this.A02 = str;
        this.A01 = user;
        this.A00 = c32050E6c;
    }
}
