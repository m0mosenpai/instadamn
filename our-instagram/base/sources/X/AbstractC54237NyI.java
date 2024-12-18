package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.NyI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54237NyI {
    public static final boolean A00(UserSession userSession, Product product, User user) {
        String str;
        String str2;
        AbstractC167017dG.A1N(userSession, product);
        User user2 = product.A0B;
        if (user != null) {
            str = user.getId();
        } else {
            str = userSession.userId;
        }
        if (user2 != null) {
            str2 = AbstractC76433bn.A00(user2);
        } else {
            str2 = null;
        }
        return AbstractC25225BEi.A1a(str2, str);
    }
}
