package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Gck, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37342Gck implements InterfaceC128405r9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C37342Gck(UserSession userSession, InterfaceC60442pS interfaceC60442pS, int i) {
        this.A00 = i;
        this.A01 = interfaceC60442pS;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC128405r9
    public final /* bridge */ /* synthetic */ C9CQ AUg(Object obj) {
        C38321qM c38321qM;
        if (2 - this.A00 != 0) {
            c38321qM = AbstractC37301Gc2.A0H(obj);
        } else {
            C41181vS c41181vS = (C41181vS) obj;
            C14360o3.A0B(c41181vS, 0);
            c38321qM = c41181vS.A0b;
        }
        return AbstractC82563mK.A01(c38321qM);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC128405r9
    public final /* bridge */ /* synthetic */ C221269pq AUh(Object obj, Object obj2, String str) {
        String A0W;
        String A0c;
        String id;
        String A04;
        EnumC64262vl A0O;
        List A07;
        long currentTimeMillis;
        String A05;
        User A2E;
        switch (this.A00) {
            case 0:
                C38321qM c38321qM = (C38321qM) obj;
                C75113Zb c75113Zb = (C75113Zb) obj2;
                AbstractC167027dH.A12(c38321qM, c75113Zb, str);
                A0W = AbstractC37300Gc1.A0W(this.A01);
                A0c = AbstractC37302Gc3.A0c(c38321qM);
                UserSession userSession = (UserSession) this.A02;
                User A2E2 = c38321qM.A2E(userSession);
                if (A2E2 != null) {
                    id = A2E2.getId();
                    A04 = AbstractC82563mK.A04(userSession, c38321qM);
                    A0O = AbstractC37302Gc3.A0O(c38321qM);
                    A07 = AbstractC82563mK.A07(c38321qM);
                    currentTimeMillis = System.currentTimeMillis();
                    A05 = AbstractC82563mK.A05(c38321qM, c75113Zb);
                    return new C221269pq(A0O, A0W, A0c, id, A04, A05, str, A07, currentTimeMillis);
                }
                throw AbstractC166997dE.A0g();
            case 1:
                C38321qM c38321qM2 = (C38321qM) obj;
                C75113Zb c75113Zb2 = (C75113Zb) obj2;
                AbstractC167027dH.A12(c38321qM2, c75113Zb2, str);
                A0W = AbstractC37300Gc1.A0W(this.A01);
                A0c = AbstractC37302Gc3.A0c(c38321qM2);
                UserSession userSession2 = (UserSession) this.A02;
                id = AbstractC61402r3.A01(userSession2, c38321qM2);
                A04 = AbstractC82563mK.A04(userSession2, c38321qM2);
                A0O = AbstractC37302Gc3.A0O(c38321qM2);
                A07 = AbstractC82563mK.A07(c38321qM2);
                currentTimeMillis = System.currentTimeMillis();
                A05 = AbstractC82563mK.A05(c38321qM2, c75113Zb2);
                return new C221269pq(A0O, A0W, A0c, id, A04, A05, str, A07, currentTimeMillis);
            default:
                C41181vS c41181vS = (C41181vS) obj;
                C41551w4 c41551w4 = (C41551w4) obj2;
                AbstractC167027dH.A12(c41181vS, c41551w4, str);
                A0W = AbstractC37300Gc1.A0W(this.A01);
                C38321qM c38321qM3 = c41181vS.A0b;
                A0c = AbstractC82563mK.A06(AbstractC37302Gc3.A0b(c38321qM3));
                if (c38321qM3 != null && (A2E = c38321qM3.A2E((UserSession) this.A02)) != null) {
                    id = A2E.getId();
                } else {
                    id = "n/a";
                }
                UserSession userSession3 = (UserSession) this.A02;
                A04 = AbstractC82563mK.A04(userSession3, c38321qM3);
                if (c38321qM3 != null && c38321qM3.CdW()) {
                    A0O = EnumC64262vl.A05;
                } else {
                    A0O = EnumC64262vl.A04;
                }
                A07 = AbstractC145786hb.A03(userSession3, c41551w4);
                currentTimeMillis = System.currentTimeMillis();
                A05 = AbstractC145786hb.A02(c41181vS);
                return new C221269pq(A0O, A0W, A0c, id, A04, A05, str, A07, currentTimeMillis);
        }
    }
}
