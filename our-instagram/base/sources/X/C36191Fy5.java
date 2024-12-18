package X;

import com.instagram.user.model.User;

/* renamed from: X.Fy5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36191Fy5 implements InterfaceC66482zP {
    public final User A00;

    public C36191Fy5(User user) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        C36191Fy5 c36191Fy5 = (C36191Fy5) obj;
        User user2 = this.A00;
        if (c36191Fy5 != null) {
            user = c36191Fy5.A00;
        } else {
            user = null;
        }
        return C14360o3.A0K(user2, user);
    }
}
