package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;

/* loaded from: classes7.dex */
public final class H88 extends C0T6 implements JLK {
    public final ProductCollectionImpl A00;
    public final Long A01;

    @Override // X.JLK
    public final H88 F7N(C1DY c1dy) {
        return this;
    }

    @Override // X.JLK
    public final H88 F7O(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H88) {
                H88 h88 = (H88) obj;
                if (!C14360o3.A0K(this.A00, h88.A00) || !C14360o3.A0K(this.A01, h88.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLK
    public final ProductCollection AyL() {
        return this.A00;
    }

    @Override // X.JLK
    public final Long B24() {
        return this.A01;
    }

    @Override // X.JLK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTExpiringDiscountDict", IA7.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H88(ProductCollectionImpl productCollectionImpl, Long l) {
        this.A00 = productCollectionImpl;
        this.A01 = l;
    }
}
