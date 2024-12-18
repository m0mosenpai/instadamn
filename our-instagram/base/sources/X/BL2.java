package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class BL2 {
    public static final Integer A00(C25377BKu c25377BKu, C120985dq c120985dq, UserSession userSession, C38321qM c38321qM, boolean z) {
        InterfaceC39541sb injected;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c25377BKu, 3);
        if (c120985dq.CdW() && (injected = c38321qM.A0C.getInjected()) != null && C14360o3.A0K(injected.AyV(), true) && c25377BKu.A03) {
            return C05F.A0N;
        }
        if (C76493bt.A0V(userSession, c120985dq.A02, AbstractC37647Ghg.A01(c120985dq.A01), c120985dq.CdW())) {
            return C05F.A0j;
        }
        if (z) {
            return C05F.A01;
        }
        if (AbstractC41071vF.A0P(null, c38321qM)) {
            return C05F.A0C;
        }
        return C05F.A00;
    }

    public static final Integer A01(C120985dq c120985dq, UserSession userSession, C38321qM c38321qM, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (c38321qM.A4r()) {
            return C05F.A0Y;
        }
        if (C76493bt.A0V(userSession, c120985dq.A02, AbstractC37647Ghg.A01(c120985dq.A01), c120985dq.CdW())) {
            return C05F.A0j;
        }
        if (z) {
            return C05F.A01;
        }
        if (AbstractC41071vF.A0Z(c38321qM)) {
            return C05F.A0C;
        }
        return C05F.A00;
    }
}
