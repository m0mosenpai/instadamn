package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCJ extends AbstractC61132qb {
    public final UserSession A00;
    public final boolean A01;

    public NCJ(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50909Mee(OYB.A02(userSession).A01(), OYB.A02(userSession).A03(), AbstractC54273Nyt.A00(userSession), this.A01);
    }
}
