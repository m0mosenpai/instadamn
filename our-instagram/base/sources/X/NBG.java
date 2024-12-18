package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NBG extends AbstractC61132qb {
    public final UserSession A00;

    public NBG(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50913Mei(userSession, new C52680NSk(userSession));
    }
}
