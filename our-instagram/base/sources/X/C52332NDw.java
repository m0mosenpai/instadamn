package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NDw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52332NDw extends AbstractC61132qb {
    public final UserSession A00;

    public C52332NDw(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C51043Mgu(userSession, IRO.A00(userSession, AbstractC166987dD.A1G()), AbstractC63302u8.A00(userSession));
    }

    public static C51043Mgu A00(InterfaceC018407e interfaceC018407e, InterfaceC09390do interfaceC09390do) {
        return (C51043Mgu) new C52942bb(new C52332NDw((UserSession) interfaceC09390do.getValue()), interfaceC018407e).A00(C51043Mgu.class);
    }
}
