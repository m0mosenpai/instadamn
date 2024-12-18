package X;

import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I4A {
    public static Map A00(ProfileShopLinkIntf profileShopLinkIntf) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (profileShopLinkIntf.Bi4() != null) {
            A1I.put("profile_shop_image_url", profileShopLinkIntf.Bi4());
        }
        if (profileShopLinkIntf.Bi6() != null) {
            A1I.put(AbstractC111324zv.A00(132), profileShopLinkIntf.Bi6());
        }
        if (profileShopLinkIntf.Bi7() != null) {
            A1I.put("profile_shop_username", profileShopLinkIntf.Bi7());
        }
        if (profileShopLinkIntf.Bt7() != null) {
            SellerShoppableFeedType Bt7 = profileShopLinkIntf.Bt7();
            if (Bt7 != null) {
                str = Bt7.A00;
            } else {
                str = null;
            }
            A1I.put("seller_shoppable_feed_type", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
