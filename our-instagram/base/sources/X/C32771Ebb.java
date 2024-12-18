package X;

import com.instagram.user.model.User;

/* renamed from: X.Ebb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32771Ebb extends FKR {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32771Ebb) {
                C32771Ebb c32771Ebb = (C32771Ebb) obj;
                if (!C14360o3.A0K(this.A01, c32771Ebb.A01) || !C14360o3.A0K(this.A00, c32771Ebb.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32771Ebb(User user, String str) {
        super(C2EY.A1h, str);
        this.A01 = str;
        this.A00 = user;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
