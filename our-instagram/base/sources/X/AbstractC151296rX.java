package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6rX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151296rX {
    public static final List A00(UserSession userSession, C38321qM c38321qM, User user, int i) {
        List AmB;
        C38321qM c38321qM2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        if (c38321qM.A5M() && c38321qM.A0C.AmB() != null && (AmB = c38321qM.A0C.AmB()) != null && (c38321qM2 = (C38321qM) AbstractC001800i.A0O(AmB, i)) != null) {
            c38321qM = c38321qM2;
        }
        if (user != null) {
            if (A03(userSession, c38321qM, user, i)) {
                List A01 = A01(user, c38321qM.A3v(userSession));
                ArrayList arrayList = new ArrayList();
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    ProductDetailsProductItemDict productDetailsProductItemDict = ((C38745H4k) it.next()).A00;
                    if (productDetailsProductItemDict != null) {
                        arrayList.add(new Product(null, productDetailsProductItemDict));
                    }
                }
                return arrayList;
            }
            return A02(user, c38321qM.A3J());
        }
        return C16930sl.A00;
    }

    public static final boolean A03(UserSession userSession, C38321qM c38321qM, User user, int i) {
        List AmB;
        C38321qM c38321qM2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        if (c38321qM.A5M() && c38321qM.A0C.AmB() != null && (AmB = c38321qM.A0C.AmB()) != null && (c38321qM2 = (C38321qM) AbstractC001800i.A0O(AmB, i)) != null) {
            c38321qM = c38321qM2;
        }
        if (!c38321qM.CdW()) {
            if ((c38321qM.A5b() || c38321qM.A5N()) && A02(user, c38321qM.A3J()).isEmpty() && (!A01(user, c38321qM.A3v(userSession)).isEmpty())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final List A01(User user, List list) {
        String str;
        User user2;
        if (user != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ProductDetailsProductItemDict productDetailsProductItemDict = ((C38745H4k) obj).A00;
                if (productDetailsProductItemDict != null && (user2 = productDetailsProductItemDict.A0G) != null) {
                    str = AbstractC76433bn.A00(user2);
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, user.getId())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    public static final List A02(User user, List list) {
        String str;
        if (user != null && list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                User user2 = ((Product) obj).A0B;
                if (user2 != null) {
                    str = AbstractC76433bn.A00(user2);
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, user.getId())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }
}
