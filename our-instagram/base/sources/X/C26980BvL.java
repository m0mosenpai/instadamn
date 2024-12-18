package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BvL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26980BvL extends AbstractC61132qb {
    public final UserSession A00;

    public C26980BvL(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36330101859893947L);
        return new C25879Bce(new C27271C1v(userSession), userSession);
    }
}
