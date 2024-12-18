package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ProductDetailsSellerBadgeContentImpl extends C0T6 implements Parcelable, ProductDetailsSellerBadgeContent {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(44);
    public final String A00;
    public final String A01;

    @Override // com.instagram.api.schemas.ProductDetailsSellerBadgeContent
    public final ProductDetailsSellerBadgeContentImpl EyL() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetailsSellerBadgeContentImpl) {
                ProductDetailsSellerBadgeContentImpl productDetailsSellerBadgeContentImpl = (ProductDetailsSellerBadgeContentImpl) obj;
                if (!C14360o3.A0K(this.A00, productDetailsSellerBadgeContentImpl.A00) || !C14360o3.A0K(this.A01, productDetailsSellerBadgeContentImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public ProductDetailsSellerBadgeContentImpl(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
