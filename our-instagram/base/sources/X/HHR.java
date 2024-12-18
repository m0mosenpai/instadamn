package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HHR extends AbstractC61132qb {
    public final UserSession A00;
    public final C35167FfI A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new Gt9(this.A00, this.A01);
    }

    public HHR(UserSession userSession, C35167FfI c35167FfI) {
        AbstractC167017dG.A1P(userSession, c35167FfI);
        this.A00 = userSession;
        this.A01 = c35167FfI;
    }
}
