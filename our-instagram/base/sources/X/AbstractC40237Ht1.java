package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ProductDetailsSellerBadgeContentImpl;
import com.instagram.api.schemas.ProductWithMediaImageImpl;
import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import com.instagram.api.schemas.ShoppingBrandWithProductsSubtitle;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ht1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40237Ht1 {
    public static ShoppingBrandWithProductsImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ProductDetailsSellerBadgeContentImpl productDetailsSellerBadgeContentImpl = null;
            ShoppingBrandWithProductsSubtitle shoppingBrandWithProductsSubtitle = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("context_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("product_thumbnails".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductWithMediaImageImpl parseFromJson = AbstractC40189Hs4.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("products".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1L(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("seller_badge".equals(A0s)) {
                    productDetailsSellerBadgeContentImpl = AbstractC40166Hre.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    shoppingBrandWithProductsSubtitle = AbstractC40238Ht2.parseFromJson(c16l);
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("context_info", c16l, "ShoppingBrandWithProductsImpl");
            } else if (arrayList != null || !(c16l instanceof C07950bF)) {
                if (user == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c16l, "ShoppingBrandWithProductsImpl");
                } else {
                    return new ShoppingBrandWithProductsImpl(productDetailsSellerBadgeContentImpl, shoppingBrandWithProductsSubtitle, user, str, arrayList, arrayList2);
                }
            } else {
                AbstractC166997dE.A1V("product_thumbnails", c16l, "ShoppingBrandWithProductsImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
