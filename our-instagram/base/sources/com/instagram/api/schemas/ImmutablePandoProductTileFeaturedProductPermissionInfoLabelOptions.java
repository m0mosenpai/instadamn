package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.C43256JAb;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTileFeaturedProductPermissionInfoLabelOptions extends C17T implements ProductTileFeaturedProductPermissionInfoLabelOptions {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(55);

    @Override // com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptions
    public final ProductTileTextStyleType C3A() {
        return (ProductTileTextStyleType) A0M(140120328, C43256JAb.A00);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptions
    public final String C0O() {
        return A0h(-891202214);
    }

    @Override // com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptions
    public final ProductTileFeaturedProductPermissionInfoLabelOptionsImpl EyU() {
        return new ProductTileFeaturedProductPermissionInfoLabelOptionsImpl(C3A(), A0h(-891202214));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
