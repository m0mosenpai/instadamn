package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JUW {
    public static final JUW A00 = new Object();

    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!new C5zZ(userSession).A02.A01(1)) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36325824072398237L) && !C18U.A06(c06090Tz, userSession, 36325824072332700L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        C06090Tz c06090Tz2;
        C14360o3.A0B(userSession, 0);
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        if (!C18U.A06(c06090Tz, userSession, 36325824072398237L)) {
            if (z) {
                c06090Tz2 = C06090Tz.A05;
            } else {
                c06090Tz2 = C06090Tz.A06;
            }
            if (!C18U.A06(c06090Tz2, userSession, 36325824072332700L)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A03(UserSession userSession, boolean z) {
        long j;
        C14360o3.A0B(userSession, 0);
        if (!new C5zZ(userSession).A02.A01(1)) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A06;
        if (z) {
            j = 36325824072332700L;
        } else {
            j = 36325824072398237L;
        }
        return AbstractC31176DnK.A1a(c06090Tz, userSession, j);
    }

    public static final boolean A01(UserSession userSession) {
        if (A00(userSession) && C18U.A06(C06090Tz.A05, userSession, 36325824073119139L)) {
            return true;
        }
        return false;
    }
}
