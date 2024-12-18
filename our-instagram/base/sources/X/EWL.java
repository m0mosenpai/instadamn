package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWL extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC33357Eoq A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C31840Dyz(userSession, this.A01, AnonymousClass189.A00(userSession), this.A02);
    }

    public EWL(UserSession userSession, EnumC33357Eoq enumC33357Eoq, String str) {
        AbstractC167027dH.A13(userSession, str, enumC33357Eoq);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = enumC33357Eoq;
    }
}
