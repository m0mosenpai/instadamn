package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDN extends AbstractC61132qb {
    public final C18920wW A00;
    public final UserSession A01;
    public final C1YH A02;
    public final EnumC168447fe A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50942MfB(this.A00, this.A01, this.A02, this.A03);
    }

    public NDN(C18920wW c18920wW, UserSession userSession, C1YH c1yh, EnumC168447fe enumC168447fe) {
        AbstractC167017dG.A1P(userSession, enumC168447fe);
        this.A01 = userSession;
        this.A03 = enumC168447fe;
        this.A00 = c18920wW;
        this.A02 = c1yh;
    }
}
