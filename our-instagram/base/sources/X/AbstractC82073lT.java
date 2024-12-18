package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3lT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82073lT {
    public static final long A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return TimeUnit.MINUTES.toMillis(C18U.A01(C06090Tz.A05, userSession, 36606147998848375L));
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36322151875225623L);
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36327335900756477L);
    }

    public static final boolean A03(UserSession userSession) {
        long j;
        C14360o3.A0B(userSession, 0);
        boolean A0K = C14360o3.A0K(C55772hI.A00(userSession).A05, "PROFILE");
        C06090Tz c06090Tz = C06090Tz.A05;
        if (A0K) {
            j = 36317534785967449L;
        } else {
            j = 36317534786360670L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C14360o3.A0K(C55772hI.A00(userSession).A05, "PROFILE")) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317534786360670L) && C18U.A06(c06090Tz, userSession, 36317534786491744L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36330969443091556L);
    }

    public static final boolean A06(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36324844819788296L) && !C18U.A06(c06090Tz, userSession, 36327335900756477L)) {
            return false;
        }
        return true;
    }
}
