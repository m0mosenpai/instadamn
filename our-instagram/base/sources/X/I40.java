package X;

import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import com.instagram.model.shopping.reels.MultiProductSticker;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I40 {
    public static final String A00(MultiProductSticker multiProductSticker) {
        String str;
        C14360o3.A0B(multiProductSticker, 0);
        List list = multiProductSticker.A0A;
        if (list != null && !list.isEmpty()) {
            ProductItemStickerBundleStyle productItemStickerBundleStyle = ((StoryProductItemStickerTappableData) list.get(0)).A00;
            if (productItemStickerBundleStyle == null || (str = productItemStickerBundleStyle.A00) == null) {
                return ProductItemStickerBundleStyle.A0H.toString();
            }
            return str;
        }
        throw AbstractC166987dD.A14("stickers should be non empty");
    }
}
