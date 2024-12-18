package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductCollection;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;

/* renamed from: X.HXn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39304HXn extends C17T implements JLK {
    public ProductCollection A00;

    @Override // X.JLK
    public final ProductCollection AyL() {
        ProductCollection productCollection = this.A00;
        if (productCollection == null) {
            return (ProductCollection) A05(1118015597, ImmutablePandoProductCollection.class);
        }
        return productCollection;
    }

    @Override // X.JLK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, IA7.A00(this));
    }

    @Override // X.JLK
    public final Long B24() {
        return A0L(1725551537);
    }

    @Override // X.JLK
    public final H88 F7N(C1DY c1dy) {
        ProductCollectionImpl productCollectionImpl;
        ProductCollection AyL = AyL();
        if (AyL != null) {
            productCollectionImpl = AyL.F7Q(c1dy);
        } else {
            productCollectionImpl = null;
        }
        return new H88(productCollectionImpl, A0L(1725551537));
    }

    @Override // X.JLK
    public final H88 F7O(C1DV c1dv) {
        return F7N(AbstractC25235BEs.A0b(c1dv));
    }
}
