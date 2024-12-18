package com.instagram.user.model;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37302Gc3;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DY;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductWrapper extends C17T implements ProductWrapperIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(94);
    public ProductDetailsProductItemDictIntf A00;

    @Override // com.instagram.user.model.ProductWrapperIntf
    public final ProductDetailsProductItemDictIntf Bgw() {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A00;
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) A05(-296876302, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.user.model.ProductWrapperIntf
    public final ProductWrapperIntf ECF(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0Q(c1dy, Bgw());
        return this;
    }

    @Override // com.instagram.user.model.ProductWrapperIntf
    public final ProductWrapper F7U(C1DY c1dy) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        ProductDetailsProductItemDictIntf Bgw = Bgw();
        if (Bgw != null) {
            productDetailsProductItemDict = Bgw.F7S(c1dy);
        } else {
            productDetailsProductItemDict = null;
        }
        return new ProductWrapper(productDetailsProductItemDict);
    }

    @Override // com.instagram.user.model.ProductWrapperIntf
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (Bgw() != null) {
            A0X.put("product_details", AbstractC37302Gc3.A0B(Bgw()));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
