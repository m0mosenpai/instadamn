package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductTileLayoutContent extends C17T implements ProductTileLayoutContent {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(57);

    @Override // com.instagram.api.schemas.ProductTileLayoutContent
    public final ProductTileFeaturedProductPermissionInfoLabelOptions B5O() {
        return (ProductTileFeaturedProductPermissionInfoLabelOptions) A05(671401149, ImmutablePandoProductTileFeaturedProductPermissionInfoLabelOptions.class);
    }

    @Override // com.instagram.api.schemas.ProductTileLayoutContent
    public final ProductTilePriceLabelOptions Bg8() {
        return (ProductTilePriceLabelOptions) A05(106934601, ImmutablePandoProductTilePriceLabelOptions.class);
    }

    @Override // com.instagram.api.schemas.ProductTileLayoutContent
    public final ProductTileProductNameLabelOptions BhD() {
        return (ProductTileProductNameLabelOptions) A05(1014375387, ImmutablePandoProductTileProductNameLabelOptions.class);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductTileLayoutContent
    public final ProductTileLayoutContentImpl EyW() {
        ProductTileFeaturedProductPermissionInfoLabelOptionsImpl productTileFeaturedProductPermissionInfoLabelOptionsImpl;
        ProductTilePriceLabelOptionsImpl productTilePriceLabelOptionsImpl;
        ProductTileFeaturedProductPermissionInfoLabelOptions B5O = B5O();
        ProductTileProductNameLabelOptionsImpl productTileProductNameLabelOptionsImpl = null;
        if (B5O != null) {
            productTileFeaturedProductPermissionInfoLabelOptionsImpl = B5O.EyU();
        } else {
            productTileFeaturedProductPermissionInfoLabelOptionsImpl = null;
        }
        ProductTilePriceLabelOptions Bg8 = Bg8();
        if (Bg8 != null) {
            productTilePriceLabelOptionsImpl = Bg8.EyY();
        } else {
            productTilePriceLabelOptionsImpl = null;
        }
        ProductTileProductNameLabelOptions BhD = BhD();
        if (BhD != null) {
            productTileProductNameLabelOptionsImpl = BhD.EyZ();
        }
        return new ProductTileLayoutContentImpl(productTileFeaturedProductPermissionInfoLabelOptionsImpl, productTilePriceLabelOptionsImpl, productTileProductNameLabelOptionsImpl);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
