package X;

import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ieq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41774Ieq {
    public static final long A02(UpcomingEvent upcomingEvent) {
        C14360o3.A0B(upcomingEvent, 0);
        return TimeUnit.SECONDS.toMillis(upcomingEvent.getStartTime());
    }

    public static final boolean A06(UpcomingEvent upcomingEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        UpcomingEventLiveMetadata BNx = upcomingEvent.BNx();
        if (BNx != null) {
            if (BNx.AiJ() == null || !AbstractC166997dE.A1Z(BNx.CQq(), false)) {
                return false;
            }
        } else if (A02(upcomingEvent) > currentTimeMillis) {
            return false;
        }
        if (currentTimeMillis <= A00(upcomingEvent)) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(UpcomingEvent upcomingEvent) {
        C14360o3.A0B(upcomingEvent, 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit.toMinutes(A02(upcomingEvent)) - timeUnit.toMinutes(System.currentTimeMillis()) <= TimeUnit.SECONDS.toMinutes(1200L) && TimeUnit.MILLISECONDS.toMinutes(A02(upcomingEvent)) + TimeUnit.SECONDS.toMinutes(2700L) >= TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis())) {
            return true;
        }
        return false;
    }

    public static final boolean A0B(UpcomingEvent upcomingEvent) {
        C14360o3.A0B(upcomingEvent, 0);
        UpcomingEventLiveMetadata BNx = upcomingEvent.BNx();
        if (BNx != null && BNx.CcQ()) {
            return true;
        }
        return false;
    }

    public static final boolean A0C(UpcomingEvent upcomingEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= A01(upcomingEvent)) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(A01(upcomingEvent));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(5, -7);
        if (calendar.getTimeInMillis() > currentTimeMillis) {
            return false;
        }
        return true;
    }

    public static final long A00(UpcomingEvent upcomingEvent) {
        Long B24 = upcomingEvent.B24();
        if (B24 != null) {
            return TimeUnit.SECONDS.toMillis(B24.longValue());
        }
        return A02(upcomingEvent) + TimeUnit.HOURS.toMillis(24L);
    }

    public static final long A01(UpcomingEvent upcomingEvent) {
        if (A03(upcomingEvent) == C05F.A01) {
            return A00(upcomingEvent);
        }
        return A02(upcomingEvent);
    }

    public static final Integer A03(UpcomingEvent upcomingEvent) {
        if (upcomingEvent.getStartTime() == 0 && upcomingEvent.B24() != null) {
            return C05F.A01;
        }
        return C05F.A00;
    }

    public static final String A04(UpcomingEvent upcomingEvent) {
        UpcomingEventMedia BQO = upcomingEvent.BQO();
        if (BQO != null) {
            return BQO.getId();
        }
        return null;
    }

    public static final boolean A05(UpcomingEvent upcomingEvent) {
        long A02;
        long currentTimeMillis = System.currentTimeMillis();
        if (A03(upcomingEvent).intValue() == 1) {
            A02 = A00(upcomingEvent);
        } else {
            A02 = A02(upcomingEvent);
        }
        if (A02 > currentTimeMillis) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UpcomingEvent upcomingEvent) {
        if (A06(upcomingEvent) && !A0D(upcomingEvent, System.currentTimeMillis())) {
            return true;
        }
        return false;
    }

    public static final boolean A08(UpcomingEvent upcomingEvent) {
        long j;
        boolean A0B = A0B(upcomingEvent);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(A02(upcomingEvent)) - timeUnit.toMinutes(System.currentTimeMillis());
        if (A0B) {
            j = TimeUnit.SECONDS.toMinutes(1200L);
        } else {
            j = 15;
        }
        if (minutes <= j) {
            return true;
        }
        return false;
    }

    public static final boolean A09(UpcomingEvent upcomingEvent) {
        UpcomingEventLiveMetadata BNx = upcomingEvent.BNx();
        if (BNx == null) {
            return false;
        }
        if (!A06(upcomingEvent) && (!A0D(upcomingEvent, System.currentTimeMillis()) || BNx.Bf3() == null)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r4 > java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r1 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0D(com.instagram.user.model.UpcomingEvent r7, long r8) {
        /*
            com.instagram.user.model.UpcomingEventLiveMetadata r6 = r7.BNx()
            r3 = 1
            if (r6 == 0) goto L47
            long r1 = A02(r7)
            long r4 = A00(r7)
            boolean r0 = r6.CcQ()
            if (r0 == 0) goto L47
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L47
            java.lang.String r0 = r6.AiJ()
            if (r0 != 0) goto L39
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r0.toMinutes(r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 2700(0xa8c, double:1.334E-320)
            long r0 = r2.toMinutes(r0)
            long r4 = r4 + r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r0.toMinutes(r8)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L3a
        L39:
            r1 = 0
        L3a:
            java.lang.Boolean r0 = r6.CQq()
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r3)
            if (r0 != 0) goto L46
            if (r1 == 0) goto L47
        L46:
            return r3
        L47:
            long r1 = A00(r7)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L46
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41774Ieq.A0D(com.instagram.user.model.UpcomingEvent, long):boolean");
    }
}
