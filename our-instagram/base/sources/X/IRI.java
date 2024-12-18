package X;

import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.model.shopping.reels.ProfileShopLink;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IRI {
    public static ProfileShopLink parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            SellerShoppableFeedType sellerShoppableFeedType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("profile_shop_image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(132).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("profile_shop_username".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("seller_shoppable_feed_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    sellerShoppableFeedType = AbstractC223416o.A00(A1P);
                }
                c16l.A0z();
            }
            return new ProfileShopLink(sellerShoppableFeedType, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ProfileShopLink profileShopLink) {
        anonymousClass182.A0d();
        String str = profileShopLink.A01;
        if (str != null) {
            anonymousClass182.A0S("profile_shop_image_url", str);
        }
        String str2 = profileShopLink.A02;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(132), str2);
        }
        String str3 = profileShopLink.A03;
        if (str3 != null) {
            anonymousClass182.A0S("profile_shop_username", str3);
        }
        SellerShoppableFeedType sellerShoppableFeedType = profileShopLink.A00;
        if (sellerShoppableFeedType != null) {
            anonymousClass182.A0S("seller_shoppable_feed_type", sellerShoppableFeedType.A00);
        }
        anonymousClass182.A0a();
    }
}
