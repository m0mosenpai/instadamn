package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ND5 extends AbstractC61132qb {
    public final UserSession A00;
    public final O39 A01;
    public final String A02;
    public final String A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50943MfC(this.A00, this.A01, this.A02, this.A03);
    }

    public ND5(UserSession userSession, O39 o39, String str, String str2) {
        AbstractC167027dH.A13(userSession, str, str2);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = o39;
    }
}
