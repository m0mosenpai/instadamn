package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* renamed from: X.Kqi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47025Kqi {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM) {
        InterfaceC39301sB Aty;
        String BFW;
        AbstractC167007dF.A1K(c38321qM, userSession);
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected == null || (Aty = injected.Aty()) == null || (BFW = Aty.BFW()) == null) {
            return false;
        }
        LL3.A03(userSession, ThreadFetchReason.CLICK_TO_JOIN, null, null, BFW, false);
        C81663kb C76 = C2JD.A00(userSession).C76(BFW);
        if (C76 == null) {
            return false;
        }
        return C76.CPZ();
    }
}
