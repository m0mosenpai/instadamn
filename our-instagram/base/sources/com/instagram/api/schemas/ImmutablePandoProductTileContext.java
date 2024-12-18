package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C1DY;
import X.C39307HXy;
import X.C43255JAa;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTileContext extends C17T implements ProductTileContext {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(53);

    @Override // com.instagram.api.schemas.ProductTileContext
    public final ProductTileContextVariant CEe() {
        return (ProductTileContextVariant) A0M(236785797, C43255JAa.A00);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductTileContext
    public final ProductTileContextImpl EyS(C1DY c1dy) {
        ProductTileContextMetadataImpl productTileContextMetadataImpl;
        ProductTileContextMetadata productTileContextMetadata = (ProductTileContextMetadata) A05(-450004177, ImmutablePandoProductTileContextMetadata.class);
        if (productTileContextMetadata != null) {
            productTileContextMetadataImpl = productTileContextMetadata.EyT(c1dy);
        } else {
            productTileContextMetadataImpl = null;
        }
        return new ProductTileContextImpl(productTileContextMetadataImpl, CEe(), A0P());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
