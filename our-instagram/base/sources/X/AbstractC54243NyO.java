package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.NyO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54243NyO {
    public static final String A00(UpcomingEvent upcomingEvent) {
        Integer num;
        if (AbstractC41774Ieq.A0B(upcomingEvent)) {
            num = C05F.A01;
        } else if (!AbstractC41774Ieq.A0B(upcomingEvent)) {
            num = C05F.A00;
        } else {
            num = C05F.A0C;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue != 1) {
            return "online_event";
        }
        return "scheduled_live";
    }
}
