package X;

import com.instagram.model.mediatype.ProductType;
import java.util.Map;

/* renamed from: X.Hyi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40562Hyi {
    public static final boolean A00(C4GI c4gi) {
        String productType = c4gi.getProductType();
        if (productType == null) {
            return false;
        }
        ProductType productType2 = ProductType.FEED;
        Map map = ProductType.A01;
        if (productType2 != map.get(productType) && ProductType.IGTV != map.get(productType)) {
            return false;
        }
        return true;
    }
}
