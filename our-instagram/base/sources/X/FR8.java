package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class FR8 {
    public final AbstractC33620EtW A00;
    public final String A01;
    public final InterfaceC16660sJ A02;

    public final boolean A01(UserSession userSession) {
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        if (interfaceC16660sJ != null && AbstractC25231BEo.A1a(userSession, interfaceC16660sJ)) {
            return false;
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (System.currentTimeMillis() - AbstractC31175DnJ.A03(A00.A01, this.A01) < TimeUnit.DAYS.toMillis(AbstractC166987dD.A0N(this.A00.A00(userSession)))) {
            return true;
        }
        return false;
    }

    public FR8(AbstractC33620EtW abstractC33620EtW, String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = str;
        this.A00 = abstractC33620EtW;
        this.A02 = interfaceC16660sJ;
    }

    public final void A00(UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        String str = this.A01;
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
        A0w.E7G(str, currentTimeMillis);
        A0w.apply();
    }
}
