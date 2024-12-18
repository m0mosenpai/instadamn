package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ib6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41616Ib6 {
    public final Product A00;
    public final List A01;
    public final Map A02 = AbstractC166987dD.A1G();
    public final ProductGroup A03;

    public static Product A00(C41616Ib6 c41616Ib6) {
        List list = c41616Ib6.A01;
        Product product = c41616Ib6.A00;
        if (!list.contains(product)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                product = AbstractC37300Gc1.A0L(it);
                if (product.A04() && !product.A0P) {
                }
            }
            return (Product) AbstractC166987dD.A16(list);
        }
        return product;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        A00(r4).A00(r5.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.instagram.model.shopping.ProductVariantDimension r5, java.lang.String r6) {
        /*
            r4 = this;
            com.instagram.model.shopping.ProductGroup r0 = r4.A03
            java.util.List r3 = r0.A01(r5, r6)
            java.util.List r2 = r4.A01
            boolean r0 = java.util.Collections.disjoint(r2, r3)
            if (r0 == 0) goto L45
            com.instagram.user.model.Product r0 = r4.A00
            java.util.List r0 = r0.A0O
            r0.getClass()
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r2 = r3.next()
            com.instagram.api.schemas.ProductVariantPossibleValueDictIntf r2 = (com.instagram.api.schemas.ProductVariantPossibleValueDictIntf) r2
            java.lang.String r1 = r2.getId()
            java.lang.String r0 = r5.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
            boolean r0 = r2.isPreselected()
            if (r0 == 0) goto L4f
        L37:
            com.instagram.user.model.Product r1 = A00(r4)
            java.lang.String r0 = r5.A02
            r1.A00(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L45:
            java.util.Map r1 = r4.A02
            java.lang.String r0 = r5.A02
            r1.put(r0, r6)
            r2.retainAll(r3)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41616Ib6.A01(com.instagram.model.shopping.ProductVariantDimension, java.lang.String):void");
    }

    public C41616Ib6(ProductGroup productGroup, Product product) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A01 = A1E;
        this.A03 = productGroup;
        this.A00 = product;
        A1E.addAll(productGroup.A00());
    }
}
