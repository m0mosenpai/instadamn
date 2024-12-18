package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.LinkedHashMap;

/* renamed from: X.H7n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38821H7n extends C0T6 implements JLI {
    public final ProductDetailsProductItemDict A00;

    @Override // X.JLI
    public final C38821H7n F6L(C1DY c1dy) {
        return this;
    }

    @Override // X.JLI
    public final C38821H7n F6M(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38821H7n) && C14360o3.A0K(this.A00, ((C38821H7n) obj).A00));
    }

    @Override // X.JLI
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bgl() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C38821H7n(ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A00 = productDetailsProductItemDict;
    }

    @Override // X.JLI
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (Bgl() != null) {
            A0X.put("product", AbstractC37302Gc3.A0B(Bgl()));
        }
        return AbstractC37300Gc1.A05("XDTStoryProductShareTappableData", AbstractC06930Yk.A0B(A0X));
    }

    @Override // X.JLI
    public final JLI EBs(C1DY c1dy) {
        return this;
    }
}
