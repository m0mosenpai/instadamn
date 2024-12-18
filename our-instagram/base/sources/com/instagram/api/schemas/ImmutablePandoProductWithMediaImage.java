package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C1DY;
import X.C39307HXy;
import android.os.Parcel;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductWithMediaImage extends C17T implements ProductWithMediaImage {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(65);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductWithMediaImage
    public final ProductDetailsProductItemDictIntf BTe() {
        return (ProductDetailsProductItemDictIntf) A04(-694833548, ImmutablePandoProductDetailsProductItemDict.class);
    }

    @Override // com.instagram.api.schemas.ProductWithMediaImage
    public final ProductWithMediaImageImpl Eyb(C1DY c1dy) {
        return new ProductWithMediaImageImpl(BTe().F7S(c1dy));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
