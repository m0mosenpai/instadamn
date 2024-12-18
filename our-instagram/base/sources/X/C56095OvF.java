package X;

import com.instagram.user.model.User;

/* renamed from: X.OvF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56095OvF implements InterfaceC66482zP {
    public final User A00;
    public final /* synthetic */ N7C A01;

    public C56095OvF(N7C n7c, User user) {
        C14360o3.A0B(user, 2);
        this.A01 = n7c;
        this.A00 = user;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return C14360o3.A0K(this.A00.getId(), AbstractC25231BEo.A0t((User) obj));
    }
}
