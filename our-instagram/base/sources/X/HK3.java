package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HK3 extends AbstractC64412w0 {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final String A02;

    @Override // X.AbstractC64412w0
    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        int i;
        int i2;
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C82713mZ A04 = AbstractC82703mY.A04(c120985dq, interfaceC60442pS, "time_spent");
        A04.A0B(j);
        UserSession userSession = this.A00;
        A04.A0K(userSession, c120985dq.A06());
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            i = c75113Zb.A0J;
        } else {
            i = -1;
        }
        A04.A0R(Integer.valueOf(i));
        if (c75113Zb != null) {
            i2 = c75113Zb.A0N;
        } else {
            i2 = -1;
        }
        A04.A0U(Integer.valueOf(i2));
        A04.A6S = this.A02;
        A04.A0D(c120985dq.A00());
        A04.A43 = AbstractC31171DnF.A0V(AbstractC37302Gc3.A02(c120985dq.A0B()));
        if (C18U.A06(C06090Tz.A06, userSession, 36329964420743771L)) {
            C41712Idi.A01(c120985dq, c37644Ghd, userSession, j);
        }
        C32U.A06(c120985dq, A04, c37644Ghd.A06());
        C32U.A0H(userSession, A04, interfaceC60442pS);
    }

    public HK3(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = interfaceC60442pS;
    }
}
