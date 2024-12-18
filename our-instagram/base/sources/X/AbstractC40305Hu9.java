package X;

import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import java.io.IOException;

/* renamed from: X.Hu9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40305Hu9 {
    public static StoryProductItemStickerTappableData parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductItemStickerBundleStyle productItemStickerBundleStyle = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC37301Gc2.A1V(c16l, c16l.A0q())) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productItemStickerBundleStyle = (ProductItemStickerBundleStyle) ProductItemStickerBundleStyle.A01.get(A1P);
                    if (productItemStickerBundleStyle == null) {
                        productItemStickerBundleStyle = ProductItemStickerBundleStyle.A0H;
                    }
                }
                c16l.A0z();
            }
            return new StoryProductItemStickerTappableData(productItemStickerBundleStyle);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
