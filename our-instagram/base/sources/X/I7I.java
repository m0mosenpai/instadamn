package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I7I {
    public static final C1ON A00(UserSession userSession, Integer num, Integer num2, List list) {
        String str;
        String str2;
        boolean A1Y = AbstractC25229BEm.A1Y(list);
        C14360o3.A0B(num2, 3);
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A0B("commerce/product_feed/metadata/");
        A0q.A06();
        ArrayList A0q2 = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product A0L = AbstractC37300Gc1.A0L(it);
            String str3 = A0L.A0C;
            if (str3 == null) {
                str3 = String.format("%s_%s", Arrays.copyOf(new Object[]{A0L.A0H, AbstractC37301Gc2.A0o(A0L.A0B)}, 2));
                C14360o3.A07(str3);
            }
            A0q2.add(str3);
        }
        A0q.A9s(AbstractC111324zv.A00(2173), AbstractC31175DnJ.A0b(A0q2));
        switch (num.intValue()) {
            case 0:
                str = "shopping_bag";
                break;
            case 1:
                str = "wishlist";
                break;
            default:
                str = "recently_viewed";
                break;
        }
        A0q.A9s("primary_endpoint", str);
        switch (num2.intValue()) {
            case 1:
                str2 = "multi_merchant_reconsideration";
                break;
            case 2:
                str2 = "single_merchant_reconsideration";
                break;
            default:
                str2 = "wishlist";
                break;
        }
        A0q.A9s("surface_type", str2);
        return AbstractC31172DnG.A0R(null, A0q, ProductFeedResponse.class, IRD.class, A1Y);
    }
}
