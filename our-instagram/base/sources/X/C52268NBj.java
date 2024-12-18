package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52268NBj extends AbstractC61132qb {
    public final UserSession A00;

    public C52268NBj(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50888MeJ(userSession, new MV3(userSession));
    }
}
