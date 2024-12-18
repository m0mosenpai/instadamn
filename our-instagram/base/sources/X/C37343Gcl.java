package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gcl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37343Gcl implements InterfaceC129625tR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C37343Gcl(UserSession userSession, InterfaceC60442pS interfaceC60442pS, int i) {
        this.A00 = i;
        this.A01 = interfaceC60442pS;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC129625tR
    public final /* bridge */ /* synthetic */ C9CQ AUA(Object obj, Object obj2) {
        C38321qM c38321qM;
        switch (this.A00) {
            case 1:
                AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
                C14360o3.A0B(abstractC127945qN, 0);
                C130505uv c130505uv = abstractC127945qN.A03;
                if (c130505uv != null) {
                    c38321qM = c130505uv.A0A;
                    break;
                } else {
                    c38321qM = null;
                    break;
                }
            case 2:
            default:
                c38321qM = AbstractC37301Gc2.A0H(obj);
                break;
            case 3:
                C41181vS c41181vS = (C41181vS) obj;
                C14360o3.A0B(c41181vS, 0);
                c38321qM = c41181vS.A0b;
                break;
        }
        return AbstractC82563mK.A01(c38321qM);
    }

    @Override // X.InterfaceC129625tR
    public final /* bridge */ /* synthetic */ C72275XaX AUB(C206209Bd c206209Bd, Object obj, Object obj2) {
        C38321qM c38321qM;
        String A0W;
        String A06;
        EnumC64262vl enumC64262vl;
        List list;
        long A0t;
        UserSession userSession;
        String A04;
        boolean A1a;
        String str;
        String A03;
        switch (this.A00) {
            case 1:
                AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
                AbstractC167017dG.A1O(abstractC127945qN, c206209Bd);
                C130505uv c130505uv = abstractC127945qN.A03;
                String str2 = null;
                if (c130505uv != null) {
                    c38321qM = c130505uv.A0A;
                } else {
                    c38321qM = null;
                }
                A0W = AbstractC37300Gc1.A0W(this.A01);
                if (c38321qM != null) {
                    str2 = AbstractC37300Gc1.A0S(c38321qM);
                }
                A06 = AbstractC82563mK.A06(str2);
                if (c38321qM != null && !c38321qM.CdW()) {
                    enumC64262vl = EnumC64262vl.A04;
                } else {
                    enumC64262vl = EnumC64262vl.A05;
                }
                list = C16930sl.A00;
                A0t = AbstractC25232BEp.A0t((Number) c206209Bd.A00);
                userSession = (UserSession) this.A02;
                A04 = AbstractC82563mK.A04(userSession, c38321qM);
                A1a = AbstractC31177DnL.A1a((Boolean) c206209Bd.A02);
                if (c38321qM == null || (str = c38321qM.getId()) == null) {
                    str = "n/a";
                }
                A03 = AbstractC82563mK.A03(userSession, c38321qM);
                break;
            case 2:
            default:
                c38321qM = (C38321qM) obj;
                C75113Zb c75113Zb = (C75113Zb) obj2;
                AbstractC167027dH.A12(c38321qM, c75113Zb, c206209Bd);
                A0W = AbstractC37300Gc1.A0W(this.A01);
                A06 = AbstractC37302Gc3.A0c(c38321qM);
                enumC64262vl = AbstractC37302Gc3.A0O(c38321qM);
                list = AbstractC82563mK.A07(c38321qM);
                A0t = AbstractC25232BEp.A0t((Number) c206209Bd.A00);
                userSession = (UserSession) this.A02;
                A04 = AbstractC82563mK.A04(userSession, c38321qM);
                A1a = AbstractC31177DnL.A1a((Boolean) c206209Bd.A02);
                str = AbstractC82563mK.A05(c38321qM, c75113Zb);
                A03 = AbstractC82563mK.A03(userSession, c38321qM);
                break;
            case 3:
                C41181vS c41181vS = (C41181vS) obj;
                C41551w4 c41551w4 = (C41551w4) obj2;
                AbstractC167027dH.A12(c41181vS, c41551w4, c206209Bd);
                A0W = AbstractC37300Gc1.A0W(this.A01);
                C38321qM c38321qM2 = c41181vS.A0b;
                A06 = AbstractC82563mK.A06(AbstractC37302Gc3.A0b(c38321qM2));
                UserSession userSession2 = (UserSession) this.A02;
                A04 = AbstractC82563mK.A04(userSession2, c38321qM2);
                if (c38321qM2 != null && !c38321qM2.CdW()) {
                    enumC64262vl = EnumC64262vl.A04;
                } else {
                    enumC64262vl = EnumC64262vl.A05;
                }
                list = AbstractC145786hb.A03(userSession2, c41551w4);
                A0t = AbstractC25232BEp.A0t((Number) c206209Bd.A00);
                A1a = AbstractC31177DnL.A1a((Boolean) c206209Bd.A02);
                str = AbstractC145786hb.A02(c41181vS);
                A03 = AbstractC82563mK.A03(userSession2, c38321qM2);
                break;
        }
        return new C72275XaX(enumC64262vl, A04, A0W, A06, str, A03, list, A0t, A1a);
    }
}
