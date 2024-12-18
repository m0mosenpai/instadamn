package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTileProductNameLabelOptions extends C17T implements ProductTileProductNameLabelOptions {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(62);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductTileProductNameLabelOptions
    public final int BXi() {
        return getIntValueByHashCode(1570251014);
    }

    @Override // com.instagram.api.schemas.ProductTileProductNameLabelOptions
    public final boolean Bw7() {
        return getBooleanValueByHashCode(-1396328189);
    }

    @Override // com.instagram.api.schemas.ProductTileProductNameLabelOptions
    public final ProductTileProductNameLabelOptionsImpl EyZ() {
        return new ProductTileProductNameLabelOptionsImpl(getIntValueByHashCode(1570251014), getBooleanValueByHashCode(-1396328189));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
