package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.78X, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C78X {
    public static final boolean A00(UserSession userSession, C81613kW c81613kW) {
        if (!C161867Mw.A02(c81613kW)) {
            return false;
        }
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322748875680198L);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        boolean booleanValue = ((Boolean) A00.A7t.CES(A00, C23031Ai.A8c[510])).booleanValue();
        if (!A06 || booleanValue) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, C81613kW c81613kW, C83403nh c83403nh, C910143t c910143t) {
        if (c83403nh.A1T() || c83403nh.A2P || c83403nh.A10 == C2EY.A1u || !A00(userSession, c81613kW)) {
            if (c83403nh.A1S() && c910143t.A0Q == EnumC910243u.PLAIN) {
                return true;
            }
            return false;
        }
        return true;
    }
}
