package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152576tk {
    public static final C152576tk A00 = new Object();

    public static final ArrayList A00(UserSession userSession, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            FollowStatus A0N = C57582kX.A00(userSession).A0N(user);
            if (A0N == FollowStatus.A08) {
                A0N = FollowStatus.A06;
                user.A0k(A0N);
            }
            if (A0N == FollowStatus.A06) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }
}
