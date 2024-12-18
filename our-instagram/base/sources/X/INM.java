package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;

/* loaded from: classes7.dex */
public final class INM {
    public UpcomingEventIDType A00;
    public UpcomingEventReminderAction A01;
    public String A02;
    public String A03;

    public final UpcomingEventReminderAction A01() {
        UpcomingEventReminderAction upcomingEventReminderAction = this.A01;
        if (upcomingEventReminderAction != null) {
            return upcomingEventReminderAction;
        }
        C14360o3.A0F("eventReminderAction");
        throw C00O.createAndThrow();
    }

    public final String A02() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("upcomingEventId");
        throw C00O.createAndThrow();
    }

    public final C1ON A00(UserSession userSession) {
        String A02 = A02();
        UpcomingEventIDType upcomingEventIDType = this.A00;
        if (upcomingEventIDType != null) {
            return IT0.A00(upcomingEventIDType, userSession, A01(), A02, this.A02);
        }
        C14360o3.A0F("eventIdType");
        throw C00O.createAndThrow();
    }
}
