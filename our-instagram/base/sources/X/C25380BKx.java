package X;

import com.instagram.common.session.UserSession;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;

/* renamed from: X.BKx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25380BKx {
    public static final boolean A01(UserSession userSession, C38321qM c38321qM) {
        InterfaceC87803vo BUx;
        InterfaceC107114sH B7j;
        return (c38321qM == null || !c38321qM.CdW() || (BUx = c38321qM.A0C.BUx()) == null || (B7j = BUx.B7j()) == null || B7j.Aya() == null || !C18U.A06(C06090Tz.A06, userSession, 36326098950174350L)) ? false : true;
    }

    public static final boolean A00(C120985dq c120985dq, UserSession userSession) {
        C38321qM c38321qM;
        InterfaceC87803vo BUx;
        InterfaceC107114sH B7j;
        AdsRatingInfoIntf AaE;
        if (c120985dq.CdW() && (c38321qM = c120985dq.A02) != null && (BUx = c38321qM.A0C.BUx()) != null && (B7j = BUx.B7j()) != null && (AaE = B7j.AaE()) != null && AaE.Ayb() != null && C18U.A06(C06090Tz.A06, userSession, 36326098950239887L)) {
            return true;
        }
        return false;
    }
}
