package com.instagram.model.shopping.productfeed;

import X.AbstractC166987dD;
import X.AbstractC31177DnL;
import X.AbstractC50102Ry;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class ProductTileMedia implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(49);
    public ImageInfoImpl A00;
    public User A01;
    public String A02;
    public String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTileMedia)) {
            return false;
        }
        ProductTileMedia productTileMedia = (ProductTileMedia) obj;
        return AbstractC50102Ry.A00(this.A02, productTileMedia.A02) && AbstractC50102Ry.A00(this.A00, productTileMedia.A00) && AbstractC50102Ry.A00(this.A03, productTileMedia.A03) && AbstractC50102Ry.A00(this.A01, productTileMedia.A01);
    }

    public final int hashCode() {
        int i;
        int A0J = AbstractC166987dD.A0J(this.A02);
        ImageInfoImpl imageInfoImpl = this.A00;
        int i2 = 0;
        if (imageInfoImpl != null) {
            i = imageInfoImpl.hashCode();
        } else {
            i = 0;
        }
        int A04 = (((A0J + i) * 31) + AbstractC31177DnL.A04(this.A03)) * 31;
        User user = this.A01;
        if (user != null) {
            i2 = user.hashCode();
        }
        return A04 + i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }

    public ProductTileMedia(ImageInfo imageInfo, User user, String str, String str2) {
        ImageInfoImpl imageInfoImpl;
        this.A02 = str;
        if (imageInfo != null) {
            imageInfoImpl = imageInfo.F5B();
        } else {
            imageInfoImpl = null;
        }
        this.A00 = imageInfoImpl;
        this.A03 = str2;
        this.A01 = user;
    }

    public ProductTileMedia() {
    }
}
