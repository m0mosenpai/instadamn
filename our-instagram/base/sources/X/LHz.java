package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class LHz {
    public final UserSession A00;
    public final Map A02 = new ConcurrentHashMap();
    public final Map A01 = new ConcurrentHashMap();

    public static final void A00(LHz lHz, C47621L1g c47621L1g, long j) {
        List list = (List) lHz.A01.remove(Long.valueOf(j));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((MQ3) it.next()).DGm(c47621L1g);
            }
        }
    }

    public static final void A01(LHz lHz, C47621L1g c47621L1g, List list) {
        List list2 = (List) lHz.A02.remove(list);
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((MQ3) it.next()).DGm(c47621L1g);
            }
        }
    }

    public LHz(UserSession userSession) {
        this.A00 = userSession;
    }
}
