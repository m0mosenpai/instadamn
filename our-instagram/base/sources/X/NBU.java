package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NBU extends AbstractC61132qb {
    public final UserSession A00;

    public NBU(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C52883Nae(userSession, MSX.A0W(OYB.A02(userSession)), OYB.A02(userSession).A01(), OYB.A02(userSession).A03());
    }
}
