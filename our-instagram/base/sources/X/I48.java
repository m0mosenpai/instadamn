package X;

import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import com.instagram.model.shopping.reels.ProductSticker;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I48 {
    public static final String A00(ProductSticker productSticker) {
        String str;
        C14360o3.A0B(productSticker, 0);
        List list = productSticker.A0E;
        if (list != null && !list.isEmpty() && ((StoryProductItemStickerTappableData) list.get(0)).A00 != null) {
            ProductItemStickerBundleStyle productItemStickerBundleStyle = ((StoryProductItemStickerTappableData) list.get(0)).A00;
            if (productItemStickerBundleStyle == null || (str = productItemStickerBundleStyle.A00) == null) {
                return ProductItemStickerBundleStyle.A0H.toString();
            }
            return str;
        }
        throw AbstractC166987dD.A14("sticker ID expected");
    }
}
