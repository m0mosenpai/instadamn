package X;

import com.instagram.api.schemas.ProductCollectionV2Type;

/* renamed from: X.Hrb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40163Hrb {
    public static final ProductCollectionV2Type A00(String str) {
        ProductCollectionV2Type productCollectionV2Type = (ProductCollectionV2Type) ProductCollectionV2Type.A01.get(str);
        if (productCollectionV2Type == null) {
            return ProductCollectionV2Type.A0C;
        }
        return productCollectionV2Type;
    }
}
