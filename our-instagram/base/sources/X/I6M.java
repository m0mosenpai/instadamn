package X;

import com.instagram.api.schemas.RankingInfo;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class I6M {
    public static final void A00(InterfaceC02550Ad interfaceC02550Ad, ProductTile productTile, String str, String str2) {
        String str3;
        User user;
        String A00;
        C14360o3.A0B(interfaceC02550Ad, 0);
        Product product = productTile.A07;
        if (product != null && (str3 = product.A0H) != null && (user = product.A0B) != null && (A00 = AbstractC76433bn.A00(user)) != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) interfaceC02550Ad, "instagram_shopping_product_see_less");
            C38537Gwy c38537Gwy = null;
            if (A0f.isSampled()) {
                AbstractC37300Gc1.A0i(A0f, AbstractC25228BEl.A13(str3));
                AbstractC37301Gc2.A17(A0f, A00);
                A0f.AAP("displayed_m_pk", AbstractC37301Gc2.A0h(productTile.A05));
                RankingInfo rankingInfo = productTile.A04;
                if (rankingInfo != null) {
                    c38537Gwy = AbstractC40745I3z.A00(rankingInfo);
                }
                A0f.AAQ(c38537Gwy, "ranking_logging_info");
                AbstractC37300Gc1.A0t(A0f, str);
                AbstractC37300Gc1.A0n(A0f, str2);
                A0f.Cht();
            }
        }
    }
}
