package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductTileLayoutContentImpl extends C0T6 implements Parcelable, ProductTileLayoutContent {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(61);
    public final ProductTileFeaturedProductPermissionInfoLabelOptions A00;
    public final ProductTilePriceLabelOptions A01;
    public final ProductTileProductNameLabelOptions A02;

    @Override // com.instagram.api.schemas.ProductTileLayoutContent
    public final ProductTileLayoutContentImpl EyW() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileLayoutContentImpl) {
                ProductTileLayoutContentImpl productTileLayoutContentImpl = (ProductTileLayoutContentImpl) obj;
                if (!C14360o3.A0K(this.A00, productTileLayoutContentImpl.A00) || !C14360o3.A0K(this.A01, productTileLayoutContentImpl.A01) || !C14360o3.A0K(this.A02, productTileLayoutContentImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    @Override // com.instagram.api.schemas.ProductTileLayoutContent
    public final ProductTileFeaturedProductPermissionInfoLabelOptions B5O() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductTileLayoutContent
    public final ProductTilePriceLabelOptions Bg8() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ProductTileLayoutContent
    public final ProductTileProductNameLabelOptions BhD() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public ProductTileLayoutContentImpl(ProductTileFeaturedProductPermissionInfoLabelOptions productTileFeaturedProductPermissionInfoLabelOptions, ProductTilePriceLabelOptions productTilePriceLabelOptions, ProductTileProductNameLabelOptions productTileProductNameLabelOptions) {
        this.A00 = productTileFeaturedProductPermissionInfoLabelOptions;
        this.A01 = productTilePriceLabelOptions;
        this.A02 = productTileProductNameLabelOptions;
    }
}
