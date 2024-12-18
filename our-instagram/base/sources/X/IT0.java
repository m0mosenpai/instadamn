package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;

/* loaded from: classes7.dex */
public abstract class IT0 {
    public static final C1ON A00(UpcomingEventIDType upcomingEventIDType, UserSession userSession, UpcomingEventReminderAction upcomingEventReminderAction, String str, String str2) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("upcoming_events/%s/%s/", upcomingEventReminderAction, str);
        A0c.A9s(AbstractC111324zv.A00(919), upcomingEventIDType.A00);
        if (str2 != null && AbstractC25225BEi.A1Y(str2)) {
            A0c.A9s("media_pk", str2);
        }
        AbstractC31173DnH.A1N(A0c);
        return AbstractC31172DnG.A0U(A0c, true);
    }

    public static final C1ON A01(UserSession userSession) {
        C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
        A0D.A0B("upcoming_events/add_event_list/");
        return AbstractC25227BEk.A0e(A0D, C171937lO.class, C171947lP.class);
    }
}
