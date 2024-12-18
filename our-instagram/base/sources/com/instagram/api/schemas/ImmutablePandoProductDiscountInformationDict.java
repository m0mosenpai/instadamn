package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.AbstractC40167Hrf;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductDiscountInformationDict extends C17T implements ProductDiscountInformationDict {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(49);

    @Override // com.instagram.api.schemas.ProductDiscountInformationDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40167Hrf.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductDiscountInformationDict
    public final ProductDiscountInformationDictImpl EyM() {
        return new ProductDiscountInformationDictImpl(AbstractC37304Gc5.A0h(this), A0T(), A0g(), A0W(), A0i(-1137266314));
    }

    @Override // com.instagram.api.schemas.ProductDiscountInformationDict
    public final String getCtaText() {
        return AbstractC37304Gc5.A0h(this);
    }

    @Override // com.instagram.api.schemas.ProductDiscountInformationDict
    public final String getDescription() {
        return A0T();
    }

    @Override // com.instagram.api.schemas.ProductDiscountInformationDict
    public final String getId() {
        return A0g();
    }

    @Override // com.instagram.api.schemas.ProductDiscountInformationDict
    public final String getName() {
        return A0W();
    }

    @Override // com.instagram.api.schemas.ProductDiscountInformationDict
    public final String getSeeDetailsText() {
        return A0i(-1137266314);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
