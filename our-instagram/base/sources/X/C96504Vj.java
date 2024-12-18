package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96504Vj {
    public final UserSession A00;

    public static final List A00(Collection collection) {
        C14360o3.A0B(collection, 0);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String A38 = ((C38321qM) it.next()).A38();
            if (A38 != null) {
                arrayList.add(A38);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return arrayList;
    }

    public C96504Vj(UserSession userSession) {
        this.A00 = userSession;
    }
}
