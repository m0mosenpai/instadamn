package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;

/* renamed from: X.Oeo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55222Oeo {
    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!A02(userSession) && !A03(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!A06(userSession) && !A07(userSession) && !A08(userSession) && !A09(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!A01(userSession) && !C18U.A06(C06090Tz.A05, userSession, 36328852024213325L)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession) {
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36610022058825732L);
        if (Long.valueOf(A01) != null && A01 == 2) {
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36607153020671531L);
        if (Long.valueOf(A01) != null && A01 == 1) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UserSession userSession) {
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36607153020671531L);
        if (Long.valueOf(A01) != null && A01 == 2) {
            return true;
        }
        return false;
    }

    public static final boolean A08(UserSession userSession) {
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36607153020671531L);
        if (Long.valueOf(A01) != null && A01 == 3) {
            return true;
        }
        return false;
    }

    public static final boolean A09(UserSession userSession) {
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36607153020671531L);
        if (Long.valueOf(A01) != null && A01 == 4) {
            return true;
        }
        return false;
    }

    public static void A00(FollowersShareFragment followersShareFragment, boolean z) {
        if (A0A(followersShareFragment.A0R())) {
            AbstractC25651Mw.A00(followersShareFragment.A0R()).E4s(new C56000OtX(z));
        }
    }

    public static final boolean A02(UserSession userSession) {
        long A01 = C18U.A01(AbstractC166997dE.A0U(userSession), userSession, 36610022058825732L);
        if (Long.valueOf(A01) != null && A01 == 1) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        if (A05(userSession) && C18U.A06(C06090Tz.A05, userSession, 36325678043837706L)) {
            return true;
        }
        return false;
    }

    public static boolean A0B(FollowersShareFragment followersShareFragment) {
        return A0A(followersShareFragment.A0R());
    }
}
