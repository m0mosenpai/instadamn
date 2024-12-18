package X;

import com.instagram.user.model.User;

/* renamed from: X.Jyz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45159Jyz extends C0T6 implements InterfaceC50389MMr {
    public final User A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45159Jyz) {
                C45159Jyz c45159Jyz = (C45159Jyz) obj;
                if (!C14360o3.A0K(this.A00, c45159Jyz.A00) || !C14360o3.A0K(this.A01, c45159Jyz.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C45159Jyz(User user, String str) {
        this.A00 = user;
        this.A01 = str;
    }
}
