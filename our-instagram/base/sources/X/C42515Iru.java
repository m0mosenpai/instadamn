package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Iru, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42515Iru implements C2u2 {
    public final /* synthetic */ C38284GsT A00;

    public C42515Iru(C38284GsT c38284GsT) {
        this.A00 = c38284GsT;
    }

    @Override // X.C2u2
    public final /* bridge */ /* synthetic */ void DNT(Object obj, int i, int i2) {
        C3XG c3xg = (C3XG) obj;
        C14360o3.A0B(c3xg, 0);
        InterfaceC38381qS interfaceC38381qS = c3xg.A05;
        if (interfaceC38381qS instanceof InterfaceC38371qR) {
            C38321qM A02 = C3XH.A02(interfaceC38381qS);
            if (A02 != null) {
                C38284GsT c38284GsT = this.A00;
                UserSession userSession = c38284GsT.A05;
                C5SE c5se = new C5SE(userSession, A02);
                InterfaceC60442pS interfaceC60442pS = c38284GsT.A08;
                C32U.A0N(userSession, c5se, A02, interfaceC60442pS, C05F.A01, "delivery");
                if (A02.CdW() && !C5SG.A00(userSession, A02) && !AbstractC61652rS.A08(userSession, AbstractC23021Ah.A00(userSession))) {
                    C32U.A0O(userSession, c5se, A02, interfaceC60442pS, Integer.valueOf(A02.A0n()), "duplicate_ad_received", A02.A2w(), AbstractC166987dD.A1J("duplicate_ad_inserted"), AbstractC166987dD.A1J("duplicate_ad_received"));
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
