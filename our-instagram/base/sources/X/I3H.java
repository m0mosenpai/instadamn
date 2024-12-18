package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I3H {
    /* JADX WARN: Type inference failed for: r4v0, types: [com.instagram.model.shopping.ProductGroup, java.lang.Object] */
    public static ProductGroup parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("product_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1L(c16l, arrayList);
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("variant_dimensions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductVariantDimension parseFromJson = I3N.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                }
                c16l.A0z();
            }
            for (int i = 0; i < obj.A02.size(); i++) {
                ProductVariantDimension productVariantDimension = (ProductVariantDimension) obj.A02.get(i);
                if (productVariantDimension.A00 == ProductVariantVisualStyle.A05) {
                    if (i != 0) {
                        obj.A02.remove(productVariantDimension);
                        obj.A02.add(0, productVariantDimension);
                        return obj;
                    }
                    return obj;
                }
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
