package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KG0 extends AbstractC61132qb {
    public final UserSession A00;
    public final Integer A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Integer num = this.A01;
        UserSession userSession = this.A00;
        return new C44478Jlk(AbstractC46739Klw.A00(userSession), AbstractC46742Klz.A00(userSession, num), num);
    }

    public KG0(UserSession userSession, Integer num) {
        AbstractC167017dG.A1P(userSession, num);
        this.A00 = userSession;
        this.A01 = num;
    }
}
