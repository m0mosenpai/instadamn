package X;

import com.instagram.user.model.User;

/* renamed from: X.Ebe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32774Ebe extends FKR {
    public final User A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32774Ebe(User user, String str, String str2) {
        super(C2EY.A1R, str);
        C14360o3.A0B(str2, 3);
        this.A01 = str;
        this.A00 = user;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32774Ebe) {
                C32774Ebe c32774Ebe = (C32774Ebe) obj;
                if (!C14360o3.A0K(this.A01, c32774Ebe.A01) || !C14360o3.A0K(this.A00, c32774Ebe.A00) || !C14360o3.A0K(this.A02, c32774Ebe.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00)) * 31);
    }
}
