package X;

import com.instagram.user.model.User;

/* renamed from: X.Ouv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56078Ouv implements InterfaceC66482zP {
    public final User A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC50102Ry.A00(this.A00, ((C56078Ouv) obj).A00);
    }

    public C56078Ouv(User user) {
        this.A00 = user;
    }
}
