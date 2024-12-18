package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ND8 extends AbstractC61132qb {
    public final UserSession A00;
    public final Ng1 A01;
    public final InterfaceC15070pN A02;
    public final boolean A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        Ng1 ng1 = this.A01;
        InterfaceC15070pN interfaceC15070pN = this.A02;
        C14360o3.A0B(userSession, 0);
        return new C52619NPo(userSession, ng1, new OEU(userSession), interfaceC15070pN, this.A03);
    }

    public ND8(UserSession userSession, Ng1 ng1, InterfaceC15070pN interfaceC15070pN, boolean z) {
        AbstractC167027dH.A13(userSession, ng1, interfaceC15070pN);
        this.A00 = userSession;
        this.A01 = ng1;
        this.A02 = interfaceC15070pN;
        this.A03 = z;
    }
}
