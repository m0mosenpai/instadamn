package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWM extends AbstractC61132qb {
    public final UserSession A00;
    public final C62592SHv A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50900MeV(new KZ6(this.A00), this.A01, this.A02);
    }

    public EWM(UserSession userSession, C62592SHv c62592SHv, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = c62592SHv;
    }
}
