package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HzG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40596HzG {
    public static final boolean A00(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36311985688544094L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36311985688609631L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 36311985688478557L);
        boolean A064 = C18U.A06(c06090Tz, userSession, 36311985688413020L);
        if (!A06 && !A062 && !A063 && !A064) {
            return false;
        }
        return true;
    }
}
