package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* loaded from: classes7.dex */
public final class ProductWithMediaImageImpl extends C0T6 implements Parcelable, ProductWithMediaImage {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(72);
    public final ProductDetailsProductItemDict A00;

    public ProductWithMediaImageImpl(ProductDetailsProductItemDict productDetailsProductItemDict) {
        C14360o3.A0B(productDetailsProductItemDict, 1);
        this.A00 = productDetailsProductItemDict;
    }

    @Override // com.instagram.api.schemas.ProductWithMediaImage
    public final ProductWithMediaImageImpl Eyb(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductWithMediaImageImpl) && C14360o3.A0K(this.A00, ((ProductWithMediaImageImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.ProductWithMediaImage
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf BTe() {
        return this.A00;
    }
}
