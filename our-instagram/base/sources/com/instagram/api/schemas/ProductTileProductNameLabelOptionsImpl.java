package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductTileProductNameLabelOptionsImpl extends C0T6 implements Parcelable, ProductTileProductNameLabelOptions {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(67);
    public final int A00;
    public final boolean A01;

    @Override // com.instagram.api.schemas.ProductTileProductNameLabelOptions
    public final ProductTileProductNameLabelOptionsImpl EyZ() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileProductNameLabelOptionsImpl) {
                ProductTileProductNameLabelOptionsImpl productTileProductNameLabelOptionsImpl = (ProductTileProductNameLabelOptionsImpl) obj;
                if (this.A00 != productTileProductNameLabelOptionsImpl.A00 || this.A01 != productTileProductNameLabelOptionsImpl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    @Override // com.instagram.api.schemas.ProductTileProductNameLabelOptions
    public final int BXi() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ProductTileProductNameLabelOptions
    public final boolean Bw7() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, this.A00 * 31);
    }

    public ProductTileProductNameLabelOptionsImpl(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
