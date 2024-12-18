package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hs2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40188Hs2 {
    public static Map A00(ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productVariantPossibleValueDictIntf.getId() != null) {
            AbstractC37300Gc1.A12(productVariantPossibleValueDictIntf.getId(), A1I);
        }
        productVariantPossibleValueDictIntf.isPreselected();
        A1I.put("is_preselected", Boolean.valueOf(productVariantPossibleValueDictIntf.isPreselected()));
        if (productVariantPossibleValueDictIntf.getName() != null) {
            AbstractC37300Gc1.A14(productVariantPossibleValueDictIntf.getName(), A1I);
        }
        if (productVariantPossibleValueDictIntf.getNormalizedValue() != null) {
            A1I.put(AbstractC111324zv.A00(1129), productVariantPossibleValueDictIntf.getNormalizedValue());
        }
        if (productVariantPossibleValueDictIntf.getValue() != null) {
            A1I.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, productVariantPossibleValueDictIntf.getValue());
        }
        if (productVariantPossibleValueDictIntf.CGx() != null) {
            ProductVariantVisualStyle CGx = productVariantPossibleValueDictIntf.CGx();
            C14360o3.A0B(CGx, 0);
            A1I.put("visual_style", CGx.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
