package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KFU extends AbstractC61132qb {
    public final UserSession A00;

    public KFU(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50970Mfd(this.A00);
    }
}