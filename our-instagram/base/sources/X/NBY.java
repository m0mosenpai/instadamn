package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NBY extends AbstractC61132qb {
    public final UserSession A00;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        NZZ A02 = OYB.A02(this.A00);
        return new C50941MfA(A02.A02(), A02.A03());
    }

    public NBY(UserSession userSession) {
        this.A00 = userSession;
    }
}
