package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ILy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41209ILy {
    public final UserSession A00;
    public final JHV A01;
    public final InterfaceC25391Lt A02;
    public final EnumC64222vh A03;

    public final void A00(XVS xvs, EnumC64262vl enumC64262vl, Object obj, Object obj2) {
        InterfaceC25391Lt interfaceC25391Lt = this.A02;
        String A0j = AbstractC167017dG.A0j();
        AnonymousClass317 anonymousClass317 = AnonymousClass317.A05;
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A03;
        EnumC64222vh enumC64222vh = this.A03;
        JHV jhv = this.A01;
        interfaceC25391Lt.DVh(new C9BW(new C9C7(jhv.ATt(obj, obj2), enumC64262vl, enumC74603Ws, anonymousClass317, enumC64222vh, A0j), jhv.ATu(xvs, obj, obj2)));
    }

    public /* synthetic */ C41209ILy(UserSession userSession, JHV jhv, EnumC64222vh enumC64222vh) {
        InterfaceC25391Lt A00 = C25361Lq.A00(userSession);
        AbstractC167017dG.A1Q(userSession, A00);
        this.A00 = userSession;
        this.A02 = A00;
        this.A01 = jhv;
        this.A03 = enumC64222vh;
    }
}
