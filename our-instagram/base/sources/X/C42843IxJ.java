package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;

/* renamed from: X.IxJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42843IxJ implements JGT {
    public final /* synthetic */ HC1 A00;

    public C42843IxJ(HC1 hc1) {
        this.A00 = hc1;
    }

    @Override // X.JGT
    public final void Dyh(ProductVariantDimension productVariantDimension, String str) {
        AbstractC167007dF.A1K(productVariantDimension, str);
        HC1 hc1 = this.A00;
        ProductGroup productGroup = hc1.A02;
        if (productGroup == null) {
            C14360o3.A0F("productGroup");
            throw C00O.createAndThrow();
        }
        Object obj = productGroup.A01(productVariantDimension, str).get(0);
        C14360o3.A07(obj);
        HC1.A01(hc1, (Product) obj);
    }
}
