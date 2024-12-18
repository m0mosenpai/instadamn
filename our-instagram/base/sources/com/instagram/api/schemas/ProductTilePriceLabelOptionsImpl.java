package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductTilePriceLabelOptionsImpl extends C0T6 implements Parcelable, ProductTilePriceLabelOptions {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(65);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    @Override // com.instagram.api.schemas.ProductTilePriceLabelOptions
    public final ProductTilePriceLabelOptionsImpl EyY() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTilePriceLabelOptionsImpl) {
                ProductTilePriceLabelOptionsImpl productTilePriceLabelOptionsImpl = (ProductTilePriceLabelOptionsImpl) obj;
                if (this.A00 != productTilePriceLabelOptionsImpl.A00 || this.A01 != productTilePriceLabelOptionsImpl.A01 || this.A02 != productTilePriceLabelOptionsImpl.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    @Override // com.instagram.api.schemas.ProductTilePriceLabelOptions
    public final boolean Bw7() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductTilePriceLabelOptions
    public final boolean Bw8() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ProductTilePriceLabelOptions
    public final boolean Bwu() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A08(this.A00)));
    }

    public ProductTilePriceLabelOptionsImpl(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }
}
