package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;

/* renamed from: X.DoJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31236DoJ {
    public static final boolean A00(UserSession userSession, Capabilities capabilities, C2EC c2ec) {
        C14360o3.A0B(capabilities, 1);
        C14360o3.A0B(userSession, 2);
        if (capabilities.A00(EnumC2054697t.A15) && c2ec != null && c2ec.C7I() != null && !c2ec.CVQ() && !c2ec.CPl() && !c2ec.CS1() && !c2ec.CX1() && !c2ec.BSD().isEmpty() && !((User) c2ec.BSH().get(0)).CQf() && !((User) c2ec.BSH().get(0)).isRestricted()) {
            if (!AbstractC31224Do7.A04(c2ec.BSH(), c2ec.isPending(), c2ec.CVQ()) && ((c2ec.BLX() != null || ((C81663kb) c2ec).A01.A24 == null) && c2ec.C4i() != EnumC46982Dm.A04 && ((!((User) c2ec.BSH().get(0)).A2O() || c2ec.CL1() || !AbstractC1337462f.A00(userSession)) && !C6X6.A0J(userSession, c2ec.Aic())))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, C7TT c7tt, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (A02(userSession, C161867Mw.A02(c7tt.A0G)) && !C6X6.A0D(userSession, c7tt, z)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, boolean z) {
        if (z && C18U.A06(C06090Tz.A05, userSession, 2342165362955528383L)) {
            return false;
        }
        int intValue = C47382Fl.A00(userSession).A01().intValue();
        if (intValue != 2 && intValue != 1) {
            return false;
        }
        return true;
    }
}
