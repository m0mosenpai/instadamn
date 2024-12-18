package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NBS extends AbstractC61132qb {
    public final UserSession A00;

    public NBS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        NZZ A02 = OYB.A02(this.A00);
        return new C50926Mev(A02.A04, A02.A03());
    }
}
