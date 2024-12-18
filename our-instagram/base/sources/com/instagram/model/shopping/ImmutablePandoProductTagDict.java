package com.instagram.model.shopping;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DY;
import X.C39305HXw;
import X.I3L;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTagDict extends C17T implements ProductTagDictIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(51);
    public ProductDetailsProductItemDictIntf A00;

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final ProductDetailsProductItemDictIntf Bgl() {
        return AbstractC37303Gc4.A0I(this, this.A00);
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final ProductTagDictIntf EBm(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0Q(c1dy, AbstractC37303Gc4.A0I(this, this.A00));
        return this;
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I3L.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final Integer Awz() {
        return getOptionalIntValueByHashCode(-1429847026);
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final Integer BDq() {
        return getOptionalIntValueByHashCode(-1773577443);
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final List Bec() {
        return A0l(747804969);
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final Boolean Cbq() {
        return getOptionalBooleanValueByHashCode(-28848122);
    }

    @Override // com.instagram.model.shopping.ProductTagDictIntf
    public final ProductTagDict F5x(C1DY c1dy) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1429847026);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1773577443);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-28848122);
        List A0l = A0l(747804969);
        ProductDetailsProductItemDictIntf A0I = AbstractC37303Gc4.A0I(this, this.A00);
        if (A0I != null) {
            productDetailsProductItemDict = A0I.F7S(c1dy);
        } else {
            productDetailsProductItemDict = null;
        }
        return new ProductTagDict(productDetailsProductItemDict, optionalBooleanValueByHashCode, optionalIntValueByHashCode, optionalIntValueByHashCode2, A0l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
