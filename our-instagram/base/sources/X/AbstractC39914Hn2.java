package X;

import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.io.IOException;

/* renamed from: X.Hn2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39914Hn2 {
    public static FBProductItemDetailsDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductCheckoutProperties productCheckoutProperties = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            ProductImageContainerImpl productImageContainerImpl = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            ProductImageContainerImpl productImageContainerImpl2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("checkout_properties".equals(A0s)) {
                    productCheckoutProperties = IRC.parseFromJson(c16l);
                } else if ("has_viewer_saved".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("listing_price".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("listing_price_stripped".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("main_image".equals(A0s)) {
                    productImageContainerImpl = AbstractC111144zV.parseFromJson(c16l);
                } else if ("page_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("page_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("page_profile_pic".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("product_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("product_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("strikethrough_price".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("strikethrough_price_stripped".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("thumbnail_image".equals(A0s)) {
                    productImageContainerImpl2 = AbstractC111144zV.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new FBProductItemDetailsDictImpl(productCheckoutProperties, productImageContainerImpl, productImageContainerImpl2, bool, str, str2, str3, str4, str5, str6, str7, str8, str9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
