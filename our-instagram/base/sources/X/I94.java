package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class I94 {
    public static final boolean A00(UserSession userSession, C38321qM c38321qM, String str) {
        boolean z;
        String str2;
        ArrayList A3I;
        C14360o3.A0B(userSession, 0);
        if (str != null && (A3I = c38321qM.A3I()) != null) {
            Iterator it = A3I.iterator();
            while (it.hasNext()) {
                ProductTag productTag = (ProductTag) it.next();
                if (C14360o3.A0K(AbstractC38048Gob.A00(productTag).A0H, str) && productTag.A04) {
                    return true;
                }
            }
        }
        ArrayList A3S = c38321qM.A3S(true);
        String str3 = null;
        if (A3S != null) {
            Iterator it2 = A3S.iterator();
            while (it2.hasNext()) {
                User user = AbstractC37300Gc1.A0L(it2).A0B;
                if (user == null || (str2 = AbstractC76433bn.A00(user)) == null) {
                    str2 = "";
                }
                if (str2.equals(userSession.userId)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!AbstractC37301Gc2.A1Z(userSession, c38321qM) && c38321qM.A2E(userSession) != null) {
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                str3 = A2E.getId();
            }
            if (!C14360o3.A0K(str3, userSession.userId) && z && c38321qM.A0C.AaN() == null) {
                return true;
            }
        }
        return false;
    }
}
