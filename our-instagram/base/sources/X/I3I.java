package X;

import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3I {
    public static Map A00(ProductItemWithARIntf productItemWithARIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productItemWithARIntf.AcV() != null) {
            A1I.put("ar_effect_metadata", productItemWithARIntf.AcV().F7o());
        }
        if (productItemWithARIntf.BhA() != null) {
            A1I.put("product_item", productItemWithARIntf.BhA().F7o());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
