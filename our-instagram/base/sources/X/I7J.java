package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class I7J {
    public static final VariantSelectorModel A00(ProductVariantDimension productVariantDimension, C41726Idx c41726Idx) {
        ProductGroup productGroup = c41726Idx.A00;
        if (productGroup != null) {
            C41578IaR c41578IaR = c41726Idx.A07;
            C41226IMr c41226IMr = new C41226IMr(productGroup, productVariantDimension);
            Iterator A13 = AbstractC31174DnI.A13(productGroup.A02);
            while (A13.hasNext()) {
                ProductVariantDimension productVariantDimension2 = (ProductVariantDimension) A13.next();
                String str = productVariantDimension2.A02;
                C14360o3.A07(str);
                String A1A = AbstractC166987dD.A1A(str, c41578IaR.A01);
                if (A1A != null && !productVariantDimension2.equals(productVariantDimension)) {
                    c41226IMr.A01(productVariantDimension2, A1A);
                }
            }
            C41225IMq A00 = c41226IMr.A00();
            ArrayList A01 = A00.A01();
            int indexOf = Collections.unmodifiableList(productGroup.A02).indexOf(productVariantDimension);
            ArrayList A002 = A00.A00();
            String str2 = productVariantDimension.A02;
            C14360o3.A07(str2);
            return new VariantSelectorModel(productVariantDimension, A01, null, A002, indexOf, A01.indexOf(c41578IaR.A01.get(str2)));
        }
        throw AbstractC166997dE.A0g();
    }
}
