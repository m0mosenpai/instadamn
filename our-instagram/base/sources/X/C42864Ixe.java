package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.Ixe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42864Ixe implements JHP {
    public final /* synthetic */ IM5 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    @Override // X.JHP
    public final void Dq0(ProductGroup productGroup) {
        ProductVariantDimension productVariantDimension;
        if (productGroup != null) {
            for (ProductVariantDimension productVariantDimension2 : productGroup.A02) {
                if ("size".equals(productVariantDimension2.A02)) {
                    IM5 im5 = this.A00;
                    Product A02 = C41746IeK.A02(this.A03);
                    String str = this.A02;
                    String str2 = this.A01;
                    J0U j0u = new J0U(im5.A00, im5.A04, null);
                    Iterator it = productGroup.A02.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            productVariantDimension = (ProductVariantDimension) it.next();
                            if ("color".equals(productVariantDimension.A02)) {
                                break;
                            }
                        } else {
                            productVariantDimension = null;
                            break;
                        }
                    }
                    C41226IMr c41226IMr = new C41226IMr(productGroup, productVariantDimension2);
                    C41616Ib6 c41616Ib6 = new C41616Ib6(productGroup, A02);
                    if (str2 != null && productVariantDimension != null) {
                        c41226IMr.A01(productVariantDimension, str2);
                        c41616Ib6.A01(productVariantDimension, str2);
                    }
                    j0u.A01(new C42848IxO(im5, j0u, c41616Ib6, str), new VariantSelectorModel(productVariantDimension2, c41226IMr.A00().A01(), null, c41226IMr.A00().A00(), Collections.unmodifiableList(productGroup.A02).indexOf(productVariantDimension2), -1), null, false);
                    return;
                }
            }
        }
        this.A00.A00(C41746IeK.A02(this.A03), this.A02);
    }

    public C42864Ixe(IM5 im5, String str, String str2, String str3) {
        this.A00 = im5;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
    }

    @Override // X.JHP
    public final void DFf() {
        AbstractC41666Iby.A01(this.A00.A00);
    }
}
