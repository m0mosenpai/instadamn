package X;

import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.model.shopping.featuredproduct.SurfaceVisibility;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3X {
    public static Map A00(JLH jlh) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlh.BF7() != null) {
            AbstractC37300Gc1.A12(jlh.BF7(), A1I);
        }
        String str2 = null;
        if (jlh.C0K() != null) {
            FeaturedProductPermissionStatus C0K = jlh.C0K();
            if (C0K != null) {
                str = C0K.A00;
            } else {
                str = null;
            }
            A1I.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str);
        }
        if (jlh.C4R() != null) {
            SurfaceVisibility C4R = jlh.C4R();
            if (C4R != null) {
                str2 = C4R.A00;
            }
            A1I.put("surface_visibility", str2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
