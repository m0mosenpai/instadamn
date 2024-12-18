package X;

import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class I7V {
    public static final ProductTileMedia A00(C38321qM c38321qM, Product product, int i) {
        String id;
        User user;
        C14360o3.A0B(product, 3);
        if (c38321qM.A5M() && i != -1) {
            c38321qM = c38321qM.A1e(i);
        }
        boolean z = false;
        if (c38321qM != null) {
            ArrayList A3J = c38321qM.A3J();
            if (!(A3J instanceof Collection) || !A3J.isEmpty()) {
                Iterator it = A3J.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C14360o3.A0K(AbstractC37300Gc1.A0L(it).A0H, product.A0H)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        if (c38321qM == null || c38321qM.A63() || !z || (id = c38321qM.getId()) == null || (user = product.A0B) == null) {
            return null;
        }
        return new ProductTileMedia(c38321qM.A1t(), user, id, null);
    }
}
