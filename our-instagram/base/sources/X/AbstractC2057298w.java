package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.store.InboxNetworkSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.98w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2057298w {
    public static final InboxNetworkSource A00(UserSession userSession, AbstractC46972Dl abstractC46972Dl, C2EB c2eb) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c2eb, 2);
        return new InboxNetworkSource(AbstractC25651Mw.A00(userSession), userSession, C4A5.A00(userSession), abstractC46972Dl, c2eb, AbstractC28761aE.A00(userSession));
    }

    public static final ArrayList A01(List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((EnumC46248KdP) it.next()).A00));
            }
        }
        return arrayList;
    }
}
