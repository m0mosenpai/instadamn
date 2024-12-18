package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGF extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public KGF(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C44499Jm5(new C47272Kuj(userSession), userSession, this.A01);
    }
}
