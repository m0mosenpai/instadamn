package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.JAZ;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTileBannerMetadataDecoration extends C17T implements ProductTileBannerMetadataDecoration {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(52);

    @Override // com.instagram.api.schemas.ProductTileBannerMetadataDecoration
    public final ProductTileBannerType AfU() {
        return (ProductTileBannerType) A0M(-1906809747, JAZ.A00);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductTileBannerMetadataDecoration
    public final String AfT() {
        return A0h(-1906828704);
    }

    @Override // com.instagram.api.schemas.ProductTileBannerMetadataDecoration
    public final ProductTileBannerMetadataDecorationImpl EyR() {
        return new ProductTileBannerMetadataDecorationImpl(AfU(), A0h(-1906828704));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
