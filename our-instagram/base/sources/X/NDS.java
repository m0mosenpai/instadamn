package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDS extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC53098NeB A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public NDS(UserSession userSession, EnumC53098NeB enumC53098NeB, String str, String str2, String str3) {
        AbstractC167027dH.A0a(1, userSession, str, str2, str3);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = enumC53098NeB;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C54681ODh c54681ODh = new C54681ODh(userSession, this.A02);
        O2D o2d = new O2D(userSession, this.A03);
        O2E o2e = new O2E(userSession);
        return new C51019MgR(C12L.A00, userSession, o2d, this.A01, c54681ODh, o2e, this.A04);
    }
}
