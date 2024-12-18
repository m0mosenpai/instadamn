package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.3P8, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3P8 {
    public static final boolean A00(UserSession userSession, C3G4 c3g4) {
        C14360o3.A0B(userSession, 0);
        if (C3G2.A1L == c3g4.A04 && C3OT.A00(userSession, c3g4) == 3) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, C3G4 c3g4) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c3g4, 1);
        if (A02(userSession, c3g4) && A00(userSession, c3g4)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C3G4 c3g4) {
        Reel reel = c3g4.A03;
        if (reel.A1a && ((c3g4.A06(userSession) || reel.A0k()) && !reel.A0i() && !reel.A0p() && !c3g4.A02)) {
            return true;
        }
        return false;
    }
}
