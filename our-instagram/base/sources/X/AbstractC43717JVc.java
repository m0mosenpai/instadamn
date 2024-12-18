package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JVc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43717JVc {
    public static final C43716JVb A00(UserSession userSession, Object obj, List list) {
        MQ0 mq0;
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                mq0 = (MQ0) it.next();
                if (!mq0.AT8(userSession, obj)) {
                    break;
                }
            } else {
                mq0 = null;
                break;
            }
        }
        return new C43716JVb(mq0);
    }
}
