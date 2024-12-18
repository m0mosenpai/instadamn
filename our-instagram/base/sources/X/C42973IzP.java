package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IzP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42973IzP implements JHV {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC60442pS A01;

    public C42973IzP(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
    }

    @Override // X.JHV
    public final /* bridge */ /* synthetic */ C9CQ ATt(Object obj, Object obj2) {
        C41181vS c41181vS = (C41181vS) obj;
        C14360o3.A0B(c41181vS, 0);
        return AbstractC82563mK.A01(c41181vS.A0b);
    }

    @Override // X.JHV
    public final /* bridge */ /* synthetic */ C72274XaV ATu(XVS xvs, Object obj, Object obj2) {
        String str;
        EnumC64262vl enumC64262vl;
        User A2E;
        C41181vS c41181vS = (C41181vS) obj;
        C41551w4 c41551w4 = (C41551w4) obj2;
        AbstractC167017dG.A1N(c41181vS, c41551w4);
        String moduleName = this.A01.getModuleName();
        C38321qM c38321qM = c41181vS.A0b;
        String A06 = AbstractC82563mK.A06(AbstractC37302Gc3.A0b(c38321qM));
        if (c38321qM != null && (A2E = c38321qM.A2E(this.A00)) != null) {
            str = A2E.getId();
        } else {
            str = "n/a";
        }
        UserSession userSession = this.A00;
        String A04 = AbstractC82563mK.A04(userSession, c38321qM);
        if (c38321qM != null && !c38321qM.CdW()) {
            enumC64262vl = EnumC64262vl.A04;
        } else {
            enumC64262vl = EnumC64262vl.A05;
        }
        return new C72274XaV(xvs, enumC64262vl, moduleName, A06, str, A04, AbstractC145786hb.A02(c41181vS), AbstractC145786hb.A03(userSession, c41551w4), System.currentTimeMillis());
    }
}
