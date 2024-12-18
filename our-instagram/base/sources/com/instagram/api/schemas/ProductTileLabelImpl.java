package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductTileLabelImpl extends C0T6 implements Parcelable, ProductTileLabel {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(59);
    public final ProductTileLabelType A00;
    public final ProductTileLayoutContent A01;

    public ProductTileLabelImpl(ProductTileLabelType productTileLabelType, ProductTileLayoutContent productTileLayoutContent) {
        C14360o3.A0B(productTileLabelType, 1);
        this.A00 = productTileLabelType;
        this.A01 = productTileLayoutContent;
    }

    @Override // com.instagram.api.schemas.ProductTileLabel
    public final ProductTileLabelImpl EyV() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileLabelImpl) {
                ProductTileLabelImpl productTileLabelImpl = (ProductTileLabelImpl) obj;
                if (this.A00 != productTileLabelImpl.A00 || !C14360o3.A0K(this.A01, productTileLabelImpl.A01)) {
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
    }

    @Override // com.instagram.api.schemas.ProductTileLabel
    public final ProductTileLabelType BL0() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductTileLabel
    public final ProductTileLayoutContent BMR() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01);
    }
}
