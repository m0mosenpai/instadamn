package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDO extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC53206Ng4 A01;
    public final OBK A02;
    public final InterfaceC15070pN A03;

    public NDO(UserSession userSession, EnumC53206Ng4 enumC53206Ng4, OBK obk, InterfaceC15070pN interfaceC15070pN) {
        AbstractC167027dH.A0a(1, userSession, enumC53206Ng4, interfaceC15070pN, obk);
        this.A00 = userSession;
        this.A01 = enumC53206Ng4;
        this.A03 = interfaceC15070pN;
        this.A02 = obk;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        EnumC53206Ng4 enumC53206Ng4 = this.A01;
        InterfaceC15070pN interfaceC15070pN = this.A03;
        C14360o3.A0B(userSession, 0);
        return new C53042NdE(userSession, enumC53206Ng4, new C54710OEm(userSession), this.A02, interfaceC15070pN);
    }
}
