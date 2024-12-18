package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EW2 extends AbstractC61132qb {
    public final UserSession A00;

    public EW2(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C31830Dyo(userSession, new C33087Eik(userSession));
    }
}
