package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTilePriceLabelOptions extends C17T implements ProductTilePriceLabelOptions {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(60);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductTilePriceLabelOptions
    public final boolean Bw7() {
        return getBooleanValueByHashCode(-1396328189);
    }

    @Override // com.instagram.api.schemas.ProductTilePriceLabelOptions
    public final boolean Bw8() {
        return getBooleanValueByHashCode(1133673074);
    }

    @Override // com.instagram.api.schemas.ProductTilePriceLabelOptions
    public final boolean Bwu() {
        return getBooleanValueByHashCode(-588984648);
    }

    @Override // com.instagram.api.schemas.ProductTilePriceLabelOptions
    public final ProductTilePriceLabelOptionsImpl EyY() {
        return new ProductTilePriceLabelOptionsImpl(getBooleanValueByHashCode(-1396328189), getBooleanValueByHashCode(1133673074), getBooleanValueByHashCode(-588984648));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
