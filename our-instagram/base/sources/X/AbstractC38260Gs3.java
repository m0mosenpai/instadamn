package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gs3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38260Gs3 {
    public static boolean A04(UserSession userSession, C41551w4 c41551w4) {
        if (c41551w4 == null) {
            return false;
        }
        Reel reel = c41551w4.A0H;
        return (reel.A0i() || A01(userSession, reel) || reel.A0g()) ? false : true;
    }

    public static boolean A02(UserSession userSession, Reel reel) {
        if (!reel.A1a && !A01(userSession, reel)) {
            User A10 = AbstractC166987dD.A10(userSession);
            Iterator it = reel.A0O(userSession).iterator();
            while (it.hasNext()) {
                if (A10.equals(((C41181vS) it.next()).A0i)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(List list, List list2, String str) {
        if (str.isEmpty()) {
            list2.addAll(list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9C8 c9c8 = (C9C8) it.next();
            User user = (User) c9c8.A05;
            if ((!TextUtils.isEmpty(user.getUsername()) && AbstractC13670mt.A0I(user.getUsername(), str, 0)) || (!TextUtils.isEmpty(user.getFullName()) && AbstractC13670mt.A0H(user.getFullName(), str))) {
                list2.add(c9c8);
            }
        }
    }

    public static boolean A01(UserSession userSession, Reel reel) {
        Iterator it = reel.A0O(userSession).iterator();
        while (it.hasNext()) {
            if (((C41181vS) it.next()).A0h()) {
                return true;
            }
        }
        return false;
    }

    public static boolean A03(UserSession userSession, C41181vS c41181vS) {
        if (AbstractC166987dD.A10(userSession).A1J() && c41181vS.A0B() != EnumC76383bi.A04 && c41181vS.A0B() != EnumC76383bi.A0C && c41181vS.A0B() != EnumC76383bi.A05) {
            return true;
        }
        return false;
    }
}
