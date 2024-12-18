package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7zU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC180407zU {
    public static final boolean A00(UserSession userSession, C55U c55u) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(c55u, 1);
        if (c55u instanceof C208509Kk) {
            c06090Tz = C06090Tz.A05;
            j = 36328585736240791L;
        } else if (c55u instanceof C81V) {
            c06090Tz = C06090Tz.A05;
            j = 36328585736306328L;
        } else {
            return false;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }
}
