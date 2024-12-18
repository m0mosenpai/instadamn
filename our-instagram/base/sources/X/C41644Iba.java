package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Iba, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41644Iba {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final Map A03 = AbstractC166987dD.A1G();
    public final Map A02 = AbstractC166987dD.A1G();

    public static void A00(C41644Iba c41644Iba, Product product, Integer num) {
        C41040IFj c41040IFj = (C41040IFj) c41644Iba.A02.get(AbstractC41555Ia4.A00(product));
        if (c41040IFj != null) {
            c41040IFj.A00 = num;
        }
    }

    public final ProductItemWithAR A01(String str) {
        C41040IFj c41040IFj = (C41040IFj) this.A02.get(str);
        if (c41040IFj == null) {
            C0w9.A03("ShoppingCameraProductStoreImpl", AnonymousClass001.A0R("Unable to getProductItemWithAR for incorrect masterRetailerProductId ", str));
            return null;
        }
        return c41040IFj.A01;
    }

    public final void A02(ProductItemWithAR productItemWithAR) {
        Product A01 = AbstractC38048Gob.A01(productItemWithAR.A01);
        String A00 = AbstractC41555Ia4.A00(A01);
        this.A03.put(A00, A01);
        this.A02.put(A00, new C41040IFj(productItemWithAR));
    }

    public final void A03(Product product) {
        AbstractC59962oe abstractC59962oe;
        Context context;
        C41040IFj c41040IFj = (C41040IFj) this.A02.get(AbstractC41555Ia4.A00(product));
        if (c41040IFj != null) {
            Integer num = c41040IFj.A00;
            if ((num == C05F.A00 || num == C05F.A0N) && (context = (abstractC59962oe = this.A00).getContext()) != null) {
                User user = product.A0B;
                if (user == null) {
                    C0w9.A03("ShoppingCameraProductStoreImpl", "Unable to fetch product group without merchant");
                } else {
                    A00(this, product, C05F.A01);
                    ISX.A01(context, AbstractC018607g.A00(abstractC59962oe), this.A01, new C42865Ixf(2, product, this), product.A0H, AbstractC76433bn.A00(user));
                }
            }
        }
    }

    public C41644Iba(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
    }
}
