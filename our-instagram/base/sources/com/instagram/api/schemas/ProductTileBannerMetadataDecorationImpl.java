package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductTileBannerMetadataDecorationImpl extends C0T6 implements Parcelable, ProductTileBannerMetadataDecoration {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(53);
    public final ProductTileBannerType A00;
    public final String A01;

    @Override // com.instagram.api.schemas.ProductTileBannerMetadataDecoration
    public final ProductTileBannerMetadataDecorationImpl EyR() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileBannerMetadataDecorationImpl) {
                ProductTileBannerMetadataDecorationImpl productTileBannerMetadataDecorationImpl = (ProductTileBannerMetadataDecorationImpl) obj;
                if (!C14360o3.A0K(this.A01, productTileBannerMetadataDecorationImpl.A01) || this.A00 != productTileBannerMetadataDecorationImpl.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.ProductTileBannerMetadataDecoration
    public final String AfT() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ProductTileBannerMetadataDecoration
    public final ProductTileBannerType AfU() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public ProductTileBannerMetadataDecorationImpl(ProductTileBannerType productTileBannerType, String str) {
        AbstractC167017dG.A1P(str, productTileBannerType);
        this.A01 = str;
        this.A00 = productTileBannerType;
    }
}
