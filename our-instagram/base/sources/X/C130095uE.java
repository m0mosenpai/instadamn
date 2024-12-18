package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5uE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130095uE {
    public static final C130095uE A00 = new Object();

    public final ArrayList A00(UserSession userSession, C38321qM c38321qM) {
        List list;
        C14360o3.A0B(userSession, 0);
        ArrayList arrayList = null;
        if (c38321qM != null) {
            arrayList = c38321qM.A3M();
            list = c38321qM.A0C.getCoauthorProducers();
        } else {
            list = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && list != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PeopleTag peopleTag = (PeopleTag) it.next();
                if (list.contains(peopleTag.A07())) {
                    arrayList2.add(peopleTag);
                }
            }
        }
        if (c38321qM != null) {
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                arrayList2.add(0, new PeopleTag(A2E));
            }
            if (c38321qM.A2C() != null) {
                arrayList2.add(new PeopleTag(c38321qM.A2C()));
            }
        }
        return arrayList2;
    }
}
