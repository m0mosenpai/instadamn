package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3uW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87133uW {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM, String str) {
        C06090Tz c06090Tz;
        long j;
        if (!c38321qM.CdW() || c38321qM.A5v()) {
            return false;
        }
        if (!str.equals("feed_timeline") && !str.equals("explore_interest_feed") && !str.equals("feed_contextual_chain")) {
            if (str.equals("feed_contextual_profile")) {
                c06090Tz = C06090Tz.A05;
                j = 36315808212455007L;
            } else {
                if (!str.equals("feed_contextual_ads_chain")) {
                    return false;
                }
                c06090Tz = C06090Tz.A06;
                j = 36312874759095807L;
            }
            return C18U.A06(c06090Tz, userSession, j);
        }
        return true;
    }
}
