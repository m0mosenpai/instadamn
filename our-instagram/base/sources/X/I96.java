package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I96 {
    public static final boolean A00(C41726Idx c41726Idx) {
        Product product = c41726Idx.A09;
        if (product != null) {
            ProductGroup productGroup = c41726Idx.A00;
            if (product.A04()) {
                boolean z = product.A0P;
                if (productGroup == null) {
                    return !z;
                }
                if (z) {
                    return false;
                }
                HashSet hashSet = new HashSet(productGroup.A00());
                Iterator A13 = AbstractC31174DnI.A13(productGroup.A02);
                while (A13.hasNext()) {
                    ProductVariantDimension productVariantDimension = (ProductVariantDimension) AbstractC166997dE.A0l(A13);
                    C41578IaR c41578IaR = c41726Idx.A07;
                    String str = productVariantDimension.A02;
                    C14360o3.A07(str);
                    String A1A = AbstractC166987dD.A1A(str, c41578IaR.A01);
                    if (A1A != null) {
                        List A01 = productGroup.A01(productVariantDimension, A1A);
                        C14360o3.A07(A01);
                        hashSet.retainAll(AbstractC001800i.A0k(A01));
                    }
                }
                if ((hashSet instanceof Collection) && hashSet.isEmpty()) {
                    return true;
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    if (AbstractC37300Gc1.A0L(it).A0P) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }
}
