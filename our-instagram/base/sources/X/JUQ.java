package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class JUQ {
    public static final List A00(UserSession userSession, String str, List list) {
        AbstractC167017dG.A1O(userSession, str);
        C2DS A00 = AbstractC28761aE.A00(userSession);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C83403nh) it.next()).A1m(C05F.A0j);
        }
        return A00.FAw(list, str);
    }
}
