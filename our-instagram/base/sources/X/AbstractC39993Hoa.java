package X;

import com.instagram.api.schemas.EventVisibilityType;
import com.instagram.api.schemas.IGLocalEventDictImpl;
import java.io.IOException;

/* renamed from: X.Hoa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39993Hoa {
    public static IGLocalEventDictImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            EventVisibilityType eventVisibilityType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ig_event_time_string".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ig_event_visibility".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    eventVisibilityType = (EventVisibilityType) EventVisibilityType.A01.get(A1P);
                    if (eventVisibilityType == null) {
                        eventVisibilityType = EventVisibilityType.A05;
                    }
                }
                c16l.A0z();
            }
            return new IGLocalEventDictImpl(eventVisibilityType, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
