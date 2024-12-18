package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4fP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC100604fP {
    public static final C8d A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36318896290077447L)) {
            return C8d.OPEN_TO_COLLAB_V2;
        }
        return C8d.OPEN_TO_COLLAB_V1;
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36328787599703850L);
    }

    public static final boolean A03(UserSession userSession, C38321qM c38321qM) {
        return C14360o3.A0K(c38321qM.A0C.BvE(), true) || C18U.A06(C06090Tz.A05, userSession, 36325420345406525L);
    }

    public static final boolean A04(UserSession userSession, boolean z) {
        long j;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (z) {
            j = 36324913539527259L;
        } else {
            j = 36324913539461722L;
        }
        if (C18U.A06(c06090Tz, userSession, j) && C18U.A06(c06090Tz, userSession, 36324913539592796L)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36318896290077447L) && !C18U.A06(c06090Tz, userSession, 36318896290011910L)) {
            return false;
        }
        return true;
    }
}
