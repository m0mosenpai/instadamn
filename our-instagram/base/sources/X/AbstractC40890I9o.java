package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import java.io.IOException;

/* renamed from: X.I9o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40890I9o {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.INM] */
    public static INM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("upcoming_event_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A03 = A0m;
                } else if (AbstractC111324zv.A00(919).equals(A0s)) {
                    UpcomingEventIDType upcomingEventIDType = (UpcomingEventIDType) UpcomingEventIDType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (upcomingEventIDType == null) {
                        upcomingEventIDType = UpcomingEventIDType.A05;
                    }
                    obj.A00 = upcomingEventIDType;
                } else if (AbstractC111324zv.A00(3005).equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    UpcomingEventReminderAction upcomingEventReminderAction = (UpcomingEventReminderAction) UpcomingEventReminderAction.A01.get(A0m2);
                    if (upcomingEventReminderAction != null) {
                        obj.A01 = upcomingEventReminderAction;
                    } else {
                        throw AbstractC167007dF.A0c("Unsupported event reminder action: ", A0m2);
                    }
                } else if ("media_pk".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
