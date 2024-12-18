package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.C43257JAc;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTileLabel extends C17T implements ProductTileLabel {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(56);

    @Override // com.instagram.api.schemas.ProductTileLabel
    public final ProductTileLabelType BL0() {
        return (ProductTileLabelType) A0M(-1649475163, C43257JAc.A00);
    }

    @Override // com.instagram.api.schemas.ProductTileLabel
    public final ProductTileLayoutContent BMR() {
        return (ProductTileLayoutContent) A05(1966148708, ImmutablePandoProductTileLayoutContent.class);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductTileLabel
    public final ProductTileLabelImpl EyV() {
        ProductTileLayoutContentImpl productTileLayoutContentImpl;
        ProductTileLabelType BL0 = BL0();
        ProductTileLayoutContent BMR = BMR();
        if (BMR != null) {
            productTileLayoutContentImpl = BMR.EyW();
        } else {
            productTileLayoutContentImpl = null;
        }
        return new ProductTileLabelImpl(BL0, productTileLayoutContentImpl);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
