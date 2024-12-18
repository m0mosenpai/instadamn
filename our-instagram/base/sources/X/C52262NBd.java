package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52262NBd extends AbstractC61132qb {
    public final UserSession A00;

    public C52262NBd(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50896MeR(userSession, AbstractC54287Nz7.A00(userSession));
    }
}
