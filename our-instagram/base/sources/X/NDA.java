package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDA extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50976Mfj(userSession, new MV3(userSession), this.A03, this.A02, this.A01);
    }

    public NDA(UserSession userSession, String str, String str2, String str3) {
        AbstractC167027dH.A13(userSession, str, str2);
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
