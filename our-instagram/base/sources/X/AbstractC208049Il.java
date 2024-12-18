package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC208049Il {
    public static final void A01(C1Dk c1Dk, UserSession userSession, Integer num) {
        int intValue = num.intValue();
        int i = 0;
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    A00(c1Dk, c06090Tz, userSession, timeUnit);
                    c1Dk.setNetworkTimeoutSeconds((int) C18U.A01(c06090Tz, userSession, 36599400604896790L));
                    c1Dk.setCacheFallbackByDuration_EXPERIMENTAL(4000L);
                    return;
                }
                c1Dk.setEnsureCacheWrite(true);
                return;
            }
            A00(c1Dk, C06090Tz.A05, userSession, TimeUnit.MINUTES);
        } else {
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            C06090Tz c06090Tz2 = C06090Tz.A05;
            A00(c1Dk, c06090Tz2, userSession, timeUnit2);
            i = (int) C18U.A01(c06090Tz2, userSession, 36599400604896790L);
        }
        c1Dk.setNetworkTimeoutSeconds(i);
    }

    public static void A00(C1Dk c1Dk, C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, TimeUnit timeUnit) {
        c1Dk.setMaxToleratedCacheAgeMs(timeUnit.toMillis(C18U.A01(c06090Tz, abstractC12990ll, 36599400604175892L)));
        c1Dk.setFreshCacheAgeMs(TimeUnit.SECONDS.toMillis(C18U.A01(c06090Tz, abstractC12990ll, 36599400604241429L)));
    }
}
