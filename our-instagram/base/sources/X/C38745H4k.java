package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.LinkedHashMap;

/* renamed from: X.H4k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38745H4k extends C0T6 implements JL5 {
    public final ProductDetailsProductItemDict A00;

    @Override // X.JL5
    public final C38745H4k EyP(C1DY c1dy) {
        return this;
    }

    @Override // X.JL5
    public final C38745H4k EyQ(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38745H4k) && C14360o3.A0K(this.A00, ((C38745H4k) obj).A00));
    }

    @Override // X.JL5
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf BhA() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C38745H4k(ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A00 = productDetailsProductItemDict;
    }

    @Override // X.JL5
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (BhA() != null) {
            A0X.put("product_item", AbstractC37302Gc3.A0B(BhA()));
        }
        return AbstractC37300Gc1.A05("XDTProductSuggestionDict", AbstractC06930Yk.A0B(A0X));
    }

    @Override // X.JL5
    public final JL5 E9g(C1DY c1dy) {
        return this;
    }
}
