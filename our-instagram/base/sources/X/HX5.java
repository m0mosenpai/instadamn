package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HX5 extends C17T implements JLI {
    public ProductDetailsProductItemDictIntf A00;

    @Override // X.JLI
    public final ProductDetailsProductItemDictIntf Bgl() {
        return AbstractC37303Gc4.A0I(this, this.A00);
    }

    @Override // X.JLI
    public final JLI EBs(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0Q(c1dy, AbstractC37303Gc4.A0I(this, this.A00));
        return this;
    }

    @Override // X.JLI
    public final C38821H7n F6L(C1DY c1dy) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        ProductDetailsProductItemDictIntf A0I = AbstractC37303Gc4.A0I(this, this.A00);
        if (A0I != null) {
            productDetailsProductItemDict = A0I.F7S(c1dy);
        } else {
            productDetailsProductItemDict = null;
        }
        return new C38821H7n(productDetailsProductItemDict);
    }

    @Override // X.JLI
    public final C38821H7n F6M(C1DV c1dv) {
        return F6L(AbstractC25235BEs.A0b(AbstractC37301Gc2.A08()));
    }

    @Override // X.JLI
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (Bgl() != null) {
            A0X.put("product", AbstractC37302Gc3.A0B(Bgl()));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
