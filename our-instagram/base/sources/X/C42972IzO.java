package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IzO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42972IzO implements JHV {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC60442pS A01;

    public C42972IzO(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
    }

    @Override // X.JHV
    public final /* bridge */ /* synthetic */ C72274XaV ATu(XVS xvs, Object obj, Object obj2) {
        C38321qM c38321qM = (C38321qM) obj;
        C75113Zb c75113Zb = (C75113Zb) obj2;
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        String moduleName = this.A01.getModuleName();
        String A0c = AbstractC37302Gc3.A0c(c38321qM);
        UserSession userSession = this.A00;
        String A01 = AbstractC61402r3.A01(userSession, c38321qM);
        String A04 = AbstractC82563mK.A04(userSession, c38321qM);
        return new C72274XaV(xvs, AbstractC37302Gc3.A0O(c38321qM), moduleName, A0c, A01, A04, AbstractC82563mK.A05(c38321qM, c75113Zb), AbstractC82563mK.A07(c38321qM), System.currentTimeMillis());
    }

    @Override // X.JHV
    public final /* bridge */ /* synthetic */ C9CQ ATt(Object obj, Object obj2) {
        return AbstractC82563mK.A01(AbstractC37301Gc2.A0H(obj));
    }
}
