package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NB7 extends AbstractC61132qb {
    public final UserSession A00;

    public NB7(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50874Me5(this.A00);
    }
}
