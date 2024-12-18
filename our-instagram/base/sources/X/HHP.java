package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HHP extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31834Dyt(this.A00, this.A01);
    }

    public HHP(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
