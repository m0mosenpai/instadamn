package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CfA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28350CfA {
    public static long A00;
    public static final C28350CfA A01 = new Object();

    public static final boolean A00(UserSession userSession) {
        long max = Math.max(AbstractC166987dD.A0x(userSession).getLong("world_pages_tooltip_last_seen_timestamp_ms", 0L), A00);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36328989463429041L) && AbstractC166987dD.A0x(userSession).getInt("world_pages_tooltip_impression_count", 0) < C18U.A01(c06090Tz, userSession, 36610464440195157L)) {
            if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - max) > 1 || max == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
