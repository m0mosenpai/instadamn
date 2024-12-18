package X;

import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I3w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40742I3w {
    public static Map A00(ProductImageContainer productImageContainer) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productImageContainer.BGx() != null) {
            A1I.put("image_versions2", productImageContainer.BGx().F7o());
        }
        if (productImageContainer.getPreview() != null) {
            A1I.put("preview", productImageContainer.getPreview());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
