package X;

import com.instagram.user.model.User;

/* renamed from: X.Mv6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51802Mv6 extends C0T6 implements InterfaceC58246Prq {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51802Mv6) {
                C51802Mv6 c51802Mv6 = (C51802Mv6) obj;
                if (!C14360o3.A0K(this.A01, c51802Mv6.A01) || !C14360o3.A0K(this.A00, c51802Mv6.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C51802Mv6(User user, String str) {
        AbstractC167017dG.A1P(str, user);
        this.A01 = str;
        this.A00 = user;
    }
}
