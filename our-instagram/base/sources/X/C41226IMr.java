package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IMr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41226IMr {
    public final ProductVariantDimension A00;
    public final List A01;
    public final ProductGroup A02;

    public final C41225IMq A00() {
        C41225IMq c41225IMq = new C41225IMq(this);
        Iterator it = this.A01.iterator();
        if (it.hasNext()) {
            AbstractC37300Gc1.A0L(it).A00(this.A00.A02);
            throw C00O.createAndThrow();
        }
        return c41225IMq;
    }

    public final void A01(ProductVariantDimension productVariantDimension, String str) {
        C18C.A0E(!this.A00.equals(productVariantDimension));
        this.A01.retainAll(this.A02.A01(productVariantDimension, str));
    }

    public C41226IMr(ProductGroup productGroup, ProductVariantDimension productVariantDimension) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A01 = A1E;
        this.A00 = productVariantDimension;
        this.A02 = productGroup;
        A1E.addAll(productGroup.A00());
    }
}
