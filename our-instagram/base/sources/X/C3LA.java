package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;

/* renamed from: X.3LA, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3LA {
    public static final int A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C17s.A05(new C17u(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 1200), (int) C18U.A01(C06090Tz.A05, userSession, 36603197357233046L));
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36321722381510410L);
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36321722378495719L) || !C18U.A06(c06090Tz, userSession, 36321722379806456L)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36321722382755612L);
    }

    public static final boolean A05(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        C14360o3.A0B(userSession, 0);
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        return C18U.A06(c06090Tz, userSession, 36321722378495719L);
    }

    public static final boolean A03(UserSession userSession) {
        return C18U.A06(C06090Tz.A06, userSession, 36321722379937530L);
    }
}
