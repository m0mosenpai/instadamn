package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OPM {
    public static final boolean A00(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        if (z) {
            return false;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36322684451170713L);
    }

    public static final boolean A01(UserSession userSession, boolean z, boolean z2) {
        C06090Tz c06090Tz;
        C14360o3.A0B(userSession, 1);
        if (!z) {
            if (z2) {
                c06090Tz = C06090Tz.A06;
            } else {
                c06090Tz = C06090Tz.A05;
            }
            if (C18U.A06(c06090Tz, userSession, 36323058113457044L) || C18U.A06(c06090Tz, userSession, 36329169851924528L)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
