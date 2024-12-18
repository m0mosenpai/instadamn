package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NBO extends AbstractC61132qb {
    public final UserSession A00;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50907Mec(OYB.A02(userSession).A03(), AbstractC109224vo.A04(userSession));
    }

    public NBO(UserSession userSession) {
        this.A00 = userSession;
    }
}
