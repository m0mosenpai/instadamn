package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82743mc {
    public static final ArrayList A00(UserSession userSession, C38321qM c38321qM, String str) {
        List A3j;
        int i;
        Long A0k;
        List A0d;
        C14360o3.A0B(str, 2);
        ArrayList arrayList = null;
        if (A02(userSession, str) && ((A3j = c38321qM.A3j()) == null || A3j.isEmpty())) {
            boolean A0h = AbstractC002300n.A0h(str, "clips_viewer", false);
            SocialContextType socialContextType = SocialContextType.A05;
            if (AbstractC002300n.A0h(str, "clips_viewer", false)) {
                C14360o3.A0B(socialContextType, 0);
                i = 1;
            } else {
                i = 2;
            }
            if (A0h) {
                List A01 = C77403dQ.A01(socialContextType, userSession, c38321qM, true);
                if (A01 != null && (A0d = AbstractC001800i.A0d(A01, i)) != null) {
                    arrayList = new ArrayList();
                    Iterator it = A0d.iterator();
                    while (it.hasNext()) {
                        Long A0k2 = AbstractC003100w.A0k(10, ((User) it.next()).getId());
                        if (A0k2 != null) {
                            arrayList.add(A0k2);
                        }
                    }
                }
            } else {
                List list = c38321qM.A1Z().A00;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    C84923qg c84923qg = (C84923qg) obj;
                    if (c84923qg.A08 != null && !c84923qg.A02() && (c84923qg.A0k || C3HM.A01(userSession))) {
                        arrayList2.add(obj);
                    }
                }
                List A0d2 = AbstractC001800i.A0d(arrayList2, i);
                if (A0d2 != null) {
                    arrayList = new ArrayList();
                    Iterator it2 = A0d2.iterator();
                    while (it2.hasNext()) {
                        User user = ((C84923qg) it2.next()).A08;
                        if (user != null && (A0k = AbstractC003100w.A0k(10, user.getId())) != null) {
                            arrayList.add(A0k);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final ArrayList A01(UserSession userSession, C38321qM c38321qM, String str) {
        List A3j;
        List A0d;
        C14360o3.A0B(str, 2);
        ArrayList arrayList = null;
        if (A02(userSession, str) && ((A3j = c38321qM.A3j()) == null || A3j.isEmpty())) {
            SocialContextType socialContextType = SocialContextType.A0C;
            if (AbstractC002300n.A0h(str, "clips_viewer", false)) {
                C14360o3.A0B(socialContextType, 0);
            }
            List A01 = C77403dQ.A01(socialContextType, userSession, c38321qM, AbstractC002300n.A0h(str, "clips_viewer", false));
            if (A01 != null && (A0d = AbstractC001800i.A0d(A01, 3)) != null) {
                arrayList = new ArrayList();
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    Long A0k = AbstractC003100w.A0k(10, ((User) it.next()).getId());
                    if (A0k != null) {
                        arrayList.add(A0k);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean A02(UserSession userSession, String str) {
        if (AbstractC002300n.A0h(str, "clips_viewer", false)) {
            if (!BLH.A03(userSession) && !C18U.A06(C06090Tz.A05, userSession, 36329586463687072L)) {
                return false;
            }
            return true;
        }
        return C3HM.A00.A07(userSession, str);
    }
}
