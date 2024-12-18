package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HHS extends AbstractC61132qb {
    public final UserSession A00;
    public final C38321qM A01;

    public HHS(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c38321qM;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C38315GtA(this.A00, this.A01);
    }
}
