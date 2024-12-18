package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40188Hs2;
import X.C17T;
import X.C39307HXy;
import X.C43259JAe;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductVariantPossibleValueDict extends C17T implements ProductVariantPossibleValueDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(64);

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final ProductVariantVisualStyle CGx() {
        return (ProductVariantVisualStyle) A0M(1947113458, C43259JAe.A00);
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40188Hs2.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final ProductVariantPossibleValueDict Eya() {
        String A0g = A0g();
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1451773609);
        return new ProductVariantPossibleValueDict(CGx(), A0g, A0Q(), A0i(-378265047), A0h(111972721), booleanValueByHashCode);
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final String getId() {
        return A0g();
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final String getName() {
        return A0Q();
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final String getNormalizedValue() {
        return A0i(-378265047);
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final String getValue() {
        return A0h(111972721);
    }

    @Override // com.instagram.api.schemas.ProductVariantPossibleValueDictIntf
    public final boolean isPreselected() {
        return getBooleanValueByHashCode(1451773609);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
