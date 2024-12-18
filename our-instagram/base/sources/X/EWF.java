package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWF extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public EWF(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = "birthday_effects_visibility_fragment";
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31807DyR(this.A00);
    }
}
