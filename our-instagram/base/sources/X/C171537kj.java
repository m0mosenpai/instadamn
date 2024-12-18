package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171537kj {
    public InterfaceC171827lD A00;
    public List A01 = new ArrayList();

    public final UpcomingEvent A00(UserSession userSession) {
        Object obj;
        C14360o3.A0B(userSession, 0);
        Iterator it = this.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                UpcomingEvent upcomingEvent = (UpcomingEvent) obj;
                UpcomingEventLiveMetadata BNx = upcomingEvent.BNx();
                if (BNx != null && BNx.CcQ() && AbstractC41774Ieq.A0A(upcomingEvent)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (UpcomingEvent) obj;
    }
}
