package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KG7 extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C45996KXk(userSession, AbstractC92954Eo.A00(userSession), this.A01);
    }

    public KG7(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
