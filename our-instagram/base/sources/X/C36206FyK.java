package X;

import com.instagram.user.model.User;

/* renamed from: X.FyK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36206FyK implements InterfaceC66482zP {
    public final User A00;
    public final N7s A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;

    public C36206FyK(User user, N7s n7s, Integer num, boolean z, boolean z2) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = num;
        this.A01 = n7s;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        C36206FyK c36206FyK = (C36206FyK) obj;
        User user2 = this.A00;
        if (c36206FyK != null) {
            user = c36206FyK.A00;
        } else {
            user = null;
        }
        if (C14360o3.A0K(user2, user) && this.A04 == c36206FyK.A04) {
            return true;
        }
        return false;
    }
}
