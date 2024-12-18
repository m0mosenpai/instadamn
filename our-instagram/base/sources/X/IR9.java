package X;

import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class IR9 {
    public static ProductItemWithAR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ProductArEffectMetadata productArEffectMetadata = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ar_effect_metadata".equals(A0s)) {
                    productArEffectMetadata = I3F.parseFromJson(c16l);
                } else if ("product_item".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (productArEffectMetadata == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("ar_effect_metadata", c16l, "ProductItemWithAR");
            } else if (productDetailsProductItemDict == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("product_item", c16l, "ProductItemWithAR");
            } else {
                return new ProductItemWithAR(productArEffectMetadata, productDetailsProductItemDict);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ProductItemWithAR productItemWithAR) {
        anonymousClass182.A0d();
        ProductArEffectMetadata productArEffectMetadata = productItemWithAR.A00;
        if (productArEffectMetadata != null) {
            anonymousClass182.A0r("ar_effect_metadata");
            anonymousClass182.A0d();
            ContainerEffectEnum containerEffectEnum = productArEffectMetadata.A00;
            if (containerEffectEnum != null) {
                anonymousClass182.A0S("container_effect_type", containerEffectEnum.A00);
            }
            DynamicEffectState dynamicEffectState = productArEffectMetadata.A01;
            if (dynamicEffectState != null) {
                anonymousClass182.A0S("dynamic_effect_state", dynamicEffectState.A00);
            }
            String str = productArEffectMetadata.A03;
            if (str != null) {
                anonymousClass182.A0S("effect_id", str);
            }
            HashMap hashMap = productArEffectMetadata.A05;
            if (hashMap != null) {
                anonymousClass182.A0r("effect_parameters");
                anonymousClass182.A0d();
                Iterator A14 = AbstractC166997dE.A14(hashMap);
                while (A14.hasNext()) {
                    AbstractC37303Gc4.A14(anonymousClass182, A14);
                }
                anonymousClass182.A0a();
            }
            String str2 = productArEffectMetadata.A04;
            if (str2 != null) {
                anonymousClass182.A0S("effect_parameters_data", str2);
            }
            EffectThumbnailImageDict effectThumbnailImageDict = productArEffectMetadata.A02;
            if (effectThumbnailImageDict != null) {
                anonymousClass182.A0r("effect_thumbnail_image");
                anonymousClass182.A0d();
                ImageUrl imageUrl = effectThumbnailImageDict.A00;
                if (imageUrl != null) {
                    anonymousClass182.A0r("uri");
                    AbstractC222616c.A01(anonymousClass182, imageUrl);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        ProductDetailsProductItemDict productDetailsProductItemDict = productItemWithAR.A01;
        if (productDetailsProductItemDict != null) {
            anonymousClass182.A0r("product_item");
            AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
        }
        anonymousClass182.A0a();
    }
}
