package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.IzS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42976IzS implements InterfaceC61432r6 {
    public final IIZ A00;

    @Override // X.InterfaceC61432r6
    public final /* synthetic */ void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        EnumC64262vl enumC64262vl;
        String str;
        EnumC64262vl enumC64262vl2;
        User A2E;
        C41181vS c41181vS = (C41181vS) obj;
        C41551w4 c41551w4 = (C41551w4) obj2;
        AbstractC167027dH.A12(anonymousClass317, c41181vS, c41551w4);
        AnonymousClass317 anonymousClass3172 = AnonymousClass317.A0R;
        if (anonymousClass317 == anonymousClass3172) {
            IIZ iiz = this.A00;
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null && !c38321qM.CdW()) {
                enumC64262vl = EnumC64262vl.A04;
            } else {
                enumC64262vl = EnumC64262vl.A05;
            }
            InterfaceC25391Lt interfaceC25391Lt = iiz.A02;
            String A0j = AbstractC167017dG.A0j();
            EnumC74603Ws enumC74603Ws = EnumC74603Ws.A03;
            EnumC64222vh enumC64222vh = iiz.A03;
            IF2 if2 = iiz.A01;
            C9C7 c9c7 = new C9C7(AbstractC82563mK.A01(c38321qM), enumC64262vl, enumC74603Ws, anonymousClass3172, enumC64222vh, A0j);
            String moduleName = if2.A01.getModuleName();
            String A06 = AbstractC82563mK.A06(AbstractC37302Gc3.A0b(c38321qM));
            if (c38321qM != null && (A2E = c38321qM.A2E(if2.A00)) != null) {
                str = A2E.getId();
            } else {
                str = "n/a";
            }
            UserSession userSession = if2.A00;
            String A04 = AbstractC82563mK.A04(userSession, c38321qM);
            if (c38321qM != null && !c38321qM.CdW()) {
                enumC64262vl2 = EnumC64262vl.A04;
            } else {
                enumC64262vl2 = EnumC64262vl.A05;
            }
            interfaceC25391Lt.DVh(new C9BW(c9c7, new C72272XaT(enumC64262vl2, moduleName, A06, str, A04, AbstractC145786hb.A02(c41181vS), AbstractC145786hb.A03(userSession, c41551w4), System.currentTimeMillis())));
            return;
        }
        throw AbstractC37303Gc4.A0M(anonymousClass317, "Wrong signal type in TapAndHoldRealtimeSignalProviderImpl for Stories: ", AbstractC166987dD.A1C());
    }

    public C42976IzS(IIZ iiz) {
        this.A00 = iiz;
    }

    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        return AbstractC166987dD.A1I();
    }
}
