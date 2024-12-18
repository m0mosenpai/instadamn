package X;

import com.instagram.user.model.User;

/* renamed from: X.EbU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32764EbU extends FKR {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32764EbU) {
                C32764EbU c32764EbU = (C32764EbU) obj;
                if (!C14360o3.A0K(this.A01, c32764EbU.A01) || !C14360o3.A0K(this.A00, c32764EbU.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32764EbU(User user, String str) {
        super(C2EY.A1Q, str);
        this.A01 = str;
        this.A00 = user;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
