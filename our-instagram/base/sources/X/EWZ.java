package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWZ extends AbstractC61132qb {
    public final UserSession A00;
    public final C38321qM A01;
    public final String A02;
    public final String A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        String str = this.A03;
        return new C25841Bbw(userSession, this.A01, AbstractC60952qJ.A01(this.A02, false, true), str);
    }

    public EWZ(UserSession userSession, C38321qM c38321qM, String str, String str2) {
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = c38321qM;
    }
}
