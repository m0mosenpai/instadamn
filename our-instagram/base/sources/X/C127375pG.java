package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5pG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127375pG implements InterfaceC127385pH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC60442pS A01;

    public C127375pG(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC127385pH
    public final /* bridge */ /* synthetic */ C9CQ AU6(Object obj, Object obj2) {
        C38321qM c38321qM = (C38321qM) obj;
        C14360o3.A0B(c38321qM, 0);
        return AbstractC82563mK.A01(c38321qM);
    }

    @Override // X.InterfaceC127385pH
    public final /* bridge */ /* synthetic */ XNM AU7(Object obj, Object obj2) {
        EnumC64262vl enumC64262vl;
        C38321qM c38321qM = (C38321qM) obj;
        C75113Zb c75113Zb = (C75113Zb) obj2;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        String moduleName = this.A01.getModuleName();
        String A06 = AbstractC82563mK.A06(c38321qM.A0C.BJN());
        UserSession userSession = this.A00;
        String A01 = AbstractC61402r3.A01(userSession, c38321qM);
        String A04 = AbstractC82563mK.A04(userSession, c38321qM);
        if (c38321qM.CdW()) {
            enumC64262vl = EnumC64262vl.A05;
        } else {
            enumC64262vl = EnumC64262vl.A04;
        }
        return new XNM(enumC64262vl, moduleName, A06, A01, A04, AbstractC82563mK.A05(c38321qM, c75113Zb), AbstractC82563mK.A07(c38321qM), System.currentTimeMillis());
    }
}
