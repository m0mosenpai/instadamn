package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NBT extends AbstractC61132qb {
    public final UserSession A00;

    public NBT(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        NZZ A02 = OYB.A02(userSession);
        return new C50927Mew(userSession, C08730cb.A00(userSession), A02.A01(), A02.A03());
    }
}
