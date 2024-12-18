package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductTileContextImpl extends C0T6 implements Parcelable, ProductTileContext {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(55);
    public final ProductTileContextMetadata A00;
    public final ProductTileContextVariant A01;
    public final String A02;

    @Override // com.instagram.api.schemas.ProductTileContext
    public final ProductTileContextImpl EyS(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileContextImpl) {
                ProductTileContextImpl productTileContextImpl = (ProductTileContextImpl) obj;
                if (!C14360o3.A0K(this.A00, productTileContextImpl.A00) || !C14360o3.A0K(this.A02, productTileContextImpl.A02) || this.A01 != productTileContextImpl.A01) {
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
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.api.schemas.ProductTileContext
    public final ProductTileContextVariant CEe() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0M(this.A00) * 31));
    }

    public ProductTileContextImpl(ProductTileContextMetadata productTileContextMetadata, ProductTileContextVariant productTileContextVariant, String str) {
        AbstractC167017dG.A1R(str, productTileContextVariant);
        this.A00 = productTileContextMetadata;
        this.A02 = str;
        this.A01 = productTileContextVariant;
    }
}
