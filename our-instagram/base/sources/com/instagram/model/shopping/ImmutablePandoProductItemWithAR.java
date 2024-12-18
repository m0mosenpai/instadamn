package com.instagram.model.shopping;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.I3I;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductItemWithAR extends C17T implements ProductItemWithARIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(50);
    public ProductDetailsProductItemDictIntf A00;

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final ProductArEffectMetadataIntf AcV() {
        return (ProductArEffectMetadataIntf) A04(-812513777, ImmutablePandoProductArEffectMetadata.class);
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final ProductDetailsProductItemDictIntf BhA() {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A00;
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) A04(1014244451, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I3I.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final ProductItemWithARIntf EBl(C1DY c1dy) {
        ProductDetailsProductItemDictIntf BhA = BhA();
        BhA.ECE(c1dy);
        this.A00 = BhA;
        return this;
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final ProductItemWithAR F5v(C1DY c1dy) {
        return new ProductItemWithAR(AcV().F5u(), BhA().F7S(c1dy));
    }

    @Override // com.instagram.model.shopping.ProductItemWithARIntf
    public final ProductItemWithAR F5w(C1DV c1dv) {
        return F5v(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
