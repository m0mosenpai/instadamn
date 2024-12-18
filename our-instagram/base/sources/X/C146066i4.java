package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6i4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146066i4 {
    public final UserSession A00;
    public final C13920nI A01;
    public final C57822kv A02;
    public final C141986bH A03;

    public C146066i4(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C57822kv A00 = AbstractC57812ku.A00(userSession);
        C141986bH A002 = AbstractC146056i3.A00(userSession);
        C13920nI c13920nI = C13920nI.A00;
        C14360o3.A0B(A002, 3);
        C14360o3.A0B(c13920nI, 4);
        this.A00 = userSession;
        this.A02 = A00;
        this.A03 = A002;
        this.A01 = c13920nI;
    }

    public final boolean A00(UpcomingEvent upcomingEvent) {
        Long l;
        long A02;
        C14360o3.A0B(upcomingEvent, 0);
        Long BLn = upcomingEvent.BLn();
        if (BLn != null) {
            l = Long.valueOf(TimeUnit.SECONDS.toMillis(BLn.longValue()));
        } else {
            l = null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (l != null) {
            A02 = l.longValue();
        } else {
            A02 = AbstractC41774Ieq.A02(upcomingEvent);
        }
        if (timeUnit.toMinutes(A02) - 15 > timeUnit.toMinutes(System.currentTimeMillis())) {
            return true;
        }
        return false;
    }

    public final boolean A01(UpcomingEvent upcomingEvent) {
        C14360o3.A0B(upcomingEvent, 0);
        Boolean A0M = this.A02.A0M(upcomingEvent);
        UpcomingEvent A00 = this.A03.A00(upcomingEvent.getId());
        if (A0M != null) {
            return A0M.booleanValue();
        }
        if (A00 != null) {
            return A00.getReminderEnabled();
        }
        return upcomingEvent.getReminderEnabled();
    }
}
