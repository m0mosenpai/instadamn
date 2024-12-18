package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.89X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89X extends AbstractC61132qb {
    public final UserSession A00;

    public C89X(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C89Y(new C89Z(userSession), userSession);
    }
}
