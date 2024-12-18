package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class MU6 {
    public static final boolean A00(UserSession userSession, C2EC c2ec) {
        User Ba5;
        Boolean AaV;
        if (A03(userSession, c2ec) && (Ba5 = c2ec.Ba5()) != null && (AaV = Ba5.A03.AaV()) != null && AaV.booleanValue()) {
            return true;
        }
        if (c2ec.C7g() == 1014 && C18U.A06(C06090Tz.A05, userSession, 36331291565638888L)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, C2EC c2ec) {
        User Ba5;
        Boolean AaW;
        if (A03(userSession, c2ec) && (Ba5 = c2ec.Ba5()) != null && (AaW = Ba5.A03.AaW()) != null && AaW.booleanValue()) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C2EC c2ec) {
        return c2ec.C7g() == 1014 && C18U.A06(C06090Tz.A05, userSession, 36331291565638888L);
    }

    public static final boolean A04(UserSession userSession, C7T2 c7t2) {
        User Ba5;
        Boolean AaW;
        if (c7t2 != null) {
            if (A05(userSession, c7t2.Ba5(), c7t2.BJh(), c7t2.C7g(), c7t2.BSD().size()) && (Ba5 = c7t2.Ba5()) != null && (AaW = Ba5.A03.AaW()) != null && AaW.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, User user, Map map, int i, int i2) {
        if (i != 0) {
            if (i != 1003) {
                if (i == 1013) {
                    return true;
                }
            } else if (user != null && user.CS0(new C150866ql(userSession))) {
                if (map != null && !map.isEmpty()) {
                    if (C14360o3.A0K(map.get(user.getId()), true) && C14360o3.A0K(map.get(userSession.userId), true)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } else if (i2 == 1 && user != null && user.CS0(new C150866ql(userSession))) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, C2EC c2ec) {
        return A05(userSession, c2ec.Ba5(), c2ec.CRw(), c2ec.C7g(), c2ec.BSH().size());
    }
}
