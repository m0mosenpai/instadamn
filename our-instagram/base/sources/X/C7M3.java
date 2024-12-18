package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7M3, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7M3 {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C7M4.A00(userSession).booleanValue();
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36318604232235346L);
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36320640046736162L);
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36325214186976134L);
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((C18U.A06(c06090Tz, userSession, 36318604232235346L) || C7M4.A00(userSession).booleanValue()) && C18U.A06(c06090Tz, userSession, 36318604232759641L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36320640046736162L) && (((!C18U.A06(c06090Tz, userSession, 36318604232235346L) && !C7M4.A00(userSession).booleanValue()) || !C18U.A06(c06090Tz, userSession, 2342161613446256983L)) && !C18U.A06(c06090Tz, userSession, 36325214186976134L))) {
            return false;
        }
        return true;
    }
}
