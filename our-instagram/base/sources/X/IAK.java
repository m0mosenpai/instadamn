package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class IAK {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM, boolean z) {
        User A2E;
        if (!C2TN.A02(userSession, c38321qM) ? !((((A2E = c38321qM.A2E(userSession)) == null || A2E.A0M() != C05F.A01) && !z) || c38321qM.CdW() || c38321qM.A5D() || c38321qM.A69() || c38321qM.A1x() == EnumC76383bi.A0C || (c38321qM.A63() && !c38321qM.A4X())) : !(c38321qM.A69() || c38321qM.A1x() == EnumC76383bi.A0C)) {
            if (c38321qM.A1y() != C3YU.A04) {
                return true;
            }
        }
        return false;
    }
}
