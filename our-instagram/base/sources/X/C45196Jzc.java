package X;

import com.instagram.user.model.User;

/* renamed from: X.Jzc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45196Jzc extends C0T6 implements InterfaceC66482zP {
    public final User A00;
    public final int A01;

    public C45196Jzc(User user, int i) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45196Jzc) {
                C45196Jzc c45196Jzc = (C45196Jzc) obj;
                if (!C14360o3.A0K(this.A00, c45196Jzc.A00) || this.A01 != c45196Jzc.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        User user;
        C45196Jzc c45196Jzc = (C45196Jzc) obj;
        String id = this.A00.getId();
        if (c45196Jzc != null && (user = c45196Jzc.A00) != null) {
            str = user.getId();
        } else {
            str = null;
        }
        return C14360o3.A0K(id, str);
    }
}
