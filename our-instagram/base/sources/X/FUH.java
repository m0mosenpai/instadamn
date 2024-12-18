package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FUH {
    public static final int A00(UserSession userSession, Collection collection) {
        C14360o3.A0B(collection, 0);
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            C81663kb A0M = AbstractC31175DnJ.A0M(AbstractC28761aE.A00(userSession), AbstractC166987dD.A1B(it));
            if (A0M != null && A0M.CX1()) {
                i++;
            }
        }
        return i;
    }

    public static final int A01(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C31228DoB) it.next()).A0A) {
                i++;
            }
        }
        return i;
    }
}
