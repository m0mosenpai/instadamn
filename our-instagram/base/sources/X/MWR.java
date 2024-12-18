package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MWR {
    public UserSession A00;
    public boolean A01;

    public static synchronized void A00(MWR mwr, boolean z) {
        synchronized (mwr) {
            mwr.A01 = z;
        }
    }

    public final synchronized void A01(MWN mwn) {
        if (!this.A01) {
            A00(this, true);
            C907442n c907442n = new C907442n(AbstractC25225BEi.A0b(), MWP.class, "IGPaymentsAccountDisabledRiskQuery", false);
            UserSession userSession = this.A00;
            C14360o3.A0B(userSession, 0);
            C1ON A0H = AbstractC31178DnM.A0H(c907442n, userSession);
            MWM.A00(A0H, this, mwn, 15);
            C1GJ.A06(A0H, 216, 3, C18U.A06(C06090Tz.A05, userSession, 36328117586246853L), false);
        }
    }
}
