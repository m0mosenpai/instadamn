package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8rX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC199308rX {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Boolean Cd9 = C08730cb.A00(userSession).A00().A03.Cd9();
        if (Cd9 != null) {
            return Cd9.booleanValue();
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C08730cb.A00(userSession).A00().A0T().contains(EnumC199318rY.A08);
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Boolean BWO = C08730cb.A00(userSession).A00().A03.BWO();
        if (BWO != null) {
            return BWO.booleanValue();
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        C08730cb c08730cb = C17060sy.A01;
        if (c08730cb.A01(userSession).A0T().contains(EnumC199318rY.A0B) || c08730cb.A01(userSession).A0T().contains(EnumC199318rY.A0E) || c08730cb.A01(userSession).A0T().contains(EnumC199318rY.A0I) || A06(userSession, true)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        if (C17060sy.A01.A01(userSession).A0I() != EnumC222416a.A05) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        if (C17060sy.A01.A01(userSession).A0T().contains(EnumC199318rY.A0D)) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            if (C18U.A06(c06090Tz, userSession, 36314631387679479L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A06(UserSession userSession, boolean z) {
        if (!C17060sy.A01.A01(userSession).A0T().contains(EnumC199318rY.A0F) && !A05(userSession, z)) {
            return false;
        }
        return true;
    }
}
