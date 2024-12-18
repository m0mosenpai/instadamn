package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6xW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC154816xW {
    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C0BQ.A00(userSession).CLL();
    }

    public static final boolean A02(UserSession userSession, User user) {
        C14360o3.A0B(userSession, 0);
        if (user != null && !C2TN.A04(userSession, user) && user.A0M() == C05F.A0C && !C57582kX.A00(userSession).A0Q(user)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, User user) {
        C14360o3.A0B(userSession, 0);
        if (!AbstractC154826xX.A02(userSession, user)) {
            if (C2TN.A04(userSession, user)) {
                return true;
            }
            if (user.A0M() != C05F.A0C || C57582kX.A00(userSession).A0Q(user)) {
                return !user.CQf();
            }
        }
        return false;
    }

    public static final ArrayList A00(User user) {
        ArrayList arrayList = new ArrayList();
        List Amr = user.A03.Amr();
        if (Amr != null) {
            Iterator it = Amr.iterator();
            while (it.hasNext()) {
                arrayList.add(((User) it.next()).getId());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
