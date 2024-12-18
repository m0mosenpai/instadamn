package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* loaded from: classes7.dex */
public final class HPK extends C17T implements JM4 {
    public ProductDetailsProductItemDictIntf A00;

    @Override // X.JM4
    public final ProductImageContainer Bcl() {
        return (ProductImageContainer) A04(106642994, ImmutablePandoProductImageContainer.class);
    }

    @Override // X.JM4
    public final ProductDetailsProductItemDictIntf Bgl() {
        return AbstractC37303Gc4.A0I(this, this.A00);
    }

    @Override // X.JM4
    public final JM4 E98(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0Q(c1dy, AbstractC37303Gc4.A0I(this, this.A00));
        return this;
    }

    @Override // X.JM4
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39958Hnn.A00(this));
    }

    @Override // X.JM4
    public final String BSZ() {
        return A0k(574223090);
    }

    @Override // X.JM4
    public final String Bh6() {
        return A0k(1777403855);
    }

    @Override // X.JM4
    public final H3V Eu4(C1DY c1dy) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        String A0k = A0k(574223090);
        ProductImageContainerImpl F6D = Bcl().F6D();
        ProductDetailsProductItemDictIntf A0I = AbstractC37303Gc4.A0I(this, this.A00);
        if (A0I != null) {
            productDetailsProductItemDict = A0I.F7S(c1dy);
        } else {
            productDetailsProductItemDict = null;
        }
        return new H3V(F6D, productDetailsProductItemDict, A0k, A0k(1753008747), A0k(1777403855));
    }

    @Override // X.JM4
    public final String getProductId() {
        return A0k(1753008747);
    }
}
