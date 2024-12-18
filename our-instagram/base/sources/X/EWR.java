package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWR extends AbstractC61132qb {
    public final UserSession A00;
    public final C32315ELe A01;
    public final String A02;

    public EWR(UserSession userSession, C32315ELe c32315ELe, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c32315ELe;
        this.A02 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new Dz6(userSession, new FO0(userSession, C35107Fe9.A00), this.A01, this.A02);
    }
}
