package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HS4 extends C17T implements JL5 {
    public ProductDetailsProductItemDictIntf A00;

    @Override // X.JL5
    public final ProductDetailsProductItemDictIntf BhA() {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A00;
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) A05(1014244451, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    @Override // X.JL5
    public final JL5 E9g(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0Q(c1dy, BhA());
        return this;
    }

    @Override // X.JL5
    public final C38745H4k EyP(C1DY c1dy) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        ProductDetailsProductItemDictIntf BhA = BhA();
        if (BhA != null) {
            productDetailsProductItemDict = BhA.F7S(c1dy);
        } else {
            productDetailsProductItemDict = null;
        }
        return new C38745H4k(productDetailsProductItemDict);
    }

    @Override // X.JL5
    public final C38745H4k EyQ(C1DV c1dv) {
        return EyP(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // X.JL5
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (BhA() != null) {
            A0X.put("product_item", AbstractC37302Gc3.A0B(BhA()));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
