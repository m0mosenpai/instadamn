package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import X.IEB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductTileProductImpl extends C0T6 implements Parcelable, ProductTileProduct {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(66);
    public final FBProductItemDetailsDict A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductTileProductImpl) && C14360o3.A0K(this.A00, ((ProductTileProductImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.ProductTileProduct
    public final /* bridge */ /* synthetic */ IEB AKU() {
        return new IEB(this);
    }

    @Override // com.instagram.api.schemas.ProductTileProduct
    public final FBProductItemDetailsDict B4x() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public ProductTileProductImpl(FBProductItemDetailsDict fBProductItemDetailsDict) {
        this.A00 = fBProductItemDetailsDict;
    }
}
