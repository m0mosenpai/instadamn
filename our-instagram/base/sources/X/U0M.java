package X;

import com.instagram.common.session.UserSession;
import java.util.Comparator;

/* loaded from: classes11.dex */
public final class U0M implements InterfaceC13000lm {
    public final int A00;
    public final int A01;
    public final C195298kV A02;
    public final InterfaceC195278kT A03;
    public final C31702Dw7 A04;
    public final UserSession A05;
    public final C13920nI A06 = C13920nI.A00;
    public final Comparator A07;

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        this.A02.A01();
    }

    public static final void A00(U0M u0m) {
        C25621Ms A0M = AbstractC31177DnL.A0M(u0m.A05);
        A0M.A0B("fbsearch/nullstate_popular_keywords/");
        A0M.A0R(MZO.class, MZN.class);
        C1ON A0N = A0M.A0N();
        A0N.A00 = u0m.A04;
        C1GJ.A03(A0N);
    }

    public U0M(UserSession userSession) {
        this.A05 = userSession;
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        this.A01 = (int) C18U.A01(A0U, userSession, 36597811466472430L);
        this.A00 = (int) C18U.A01(A0U, userSession, 36597811466669041L);
        C65903Tw9 c65903Tw9 = new C65903Tw9(13);
        this.A07 = c65903Tw9;
        MZ5 mz5 = new MZ5();
        this.A03 = mz5;
        this.A02 = new C195298kV(mz5, C1AT.A01(userSession).A04(C1AV.A23, getClass()), "popularKeyword:", c65903Tw9);
        this.A04 = new C31702Dw7(this, 36);
    }
}
