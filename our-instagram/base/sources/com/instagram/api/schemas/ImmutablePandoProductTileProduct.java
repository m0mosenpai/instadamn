package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.IEB;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTileProduct extends C17T implements ProductTileProduct {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(61);

    @Override // com.instagram.api.schemas.ProductTileProduct
    public final /* synthetic */ IEB AKU() {
        return new IEB(this);
    }

    @Override // com.instagram.api.schemas.ProductTileProduct
    public final FBProductItemDetailsDict B4x() {
        return (FBProductItemDetailsDict) A05(-1852636052, ImmutablePandoFBProductItemDetailsDict.class);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
