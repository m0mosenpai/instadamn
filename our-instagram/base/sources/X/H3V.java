package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* loaded from: classes7.dex */
public final class H3V extends C0T6 implements JM4 {
    public final ProductImageContainer A00;
    public final ProductDetailsProductItemDict A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.JM4
    public final H3V Eu4(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3V) {
                H3V h3v = (H3V) obj;
                if (!C14360o3.A0K(this.A02, h3v.A02) || !C14360o3.A0K(this.A00, h3v.A00) || !C14360o3.A0K(this.A01, h3v.A01) || !C14360o3.A0K(this.A03, h3v.A03) || !C14360o3.A0K(this.A04, h3v.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JM4
    public final String BSZ() {
        return this.A02;
    }

    @Override // X.JM4
    public final ProductImageContainer Bcl() {
        return this.A00;
    }

    @Override // X.JM4
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bgl() {
        return this.A01;
    }

    @Override // X.JM4
    public final String Bh6() {
        return this.A04;
    }

    @Override // X.JM4
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGuideProductImageContent", AbstractC39958Hnn.A00(this));
    }

    @Override // X.JM4
    public final String getProductId() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A04, AbstractC166997dE.A0K(this.A03, (AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0M(this.A01)) * 31));
    }

    public H3V(ProductImageContainer productImageContainer, ProductDetailsProductItemDict productDetailsProductItemDict, String str, String str2, String str3) {
        AbstractC25234BEr.A1P(str, productImageContainer, str2);
        C14360o3.A0B(str3, 5);
        this.A02 = str;
        this.A00 = productImageContainer;
        this.A01 = productDetailsProductItemDict;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // X.JM4
    public final JM4 E98(C1DY c1dy) {
        return this;
    }
}
