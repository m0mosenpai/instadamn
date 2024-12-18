package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCN extends AbstractC61132qb {
    public final UserSession A00;
    public final OWU A01;

    public NCN(UserSession userSession, OWU owu) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = owu;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C53033Nd5(new C56810PJc(this.A00, this.A01));
    }
}
