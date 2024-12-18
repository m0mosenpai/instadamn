package X;

import com.instagram.user.model.User;

/* renamed from: X.EbD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32747EbD extends FKR {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32747EbD) {
                C32747EbD c32747EbD = (C32747EbD) obj;
                if (!C14360o3.A0K(this.A01, c32747EbD.A01) || !C14360o3.A0K(this.A00, c32747EbD.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32747EbD(User user, String str) {
        super(C2EY.A0H, str);
        this.A01 = str;
        this.A00 = user;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
