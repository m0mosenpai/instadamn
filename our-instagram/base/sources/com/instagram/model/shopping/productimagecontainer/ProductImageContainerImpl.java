package com.instagram.model.shopping.productimagecontainer;

import X.AbstractC40742I3w;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;

/* loaded from: classes2.dex */
public final class ProductImageContainerImpl extends C0T6 implements ProductImageContainer, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(36);
    public final ImageInfo A00;
    public final String A01;

    public ProductImageContainerImpl(ImageInfo imageInfo, String str) {
        C14360o3.A0B(imageInfo, 1);
        this.A00 = imageInfo;
        this.A01 = str;
    }

    @Override // com.instagram.model.shopping.productimagecontainer.ProductImageContainer
    public final ProductImageContainerImpl F6D() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductImageContainerImpl) {
                ProductImageContainerImpl productImageContainerImpl = (ProductImageContainerImpl) obj;
                if (!C14360o3.A0K(this.A00, productImageContainerImpl.A00) || !C14360o3.A0K(this.A01, productImageContainerImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A01;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.model.shopping.productimagecontainer.ProductImageContainer
    public final ImageInfo BGx() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.productimagecontainer.ProductImageContainer
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProductImageVersionsDict", AbstractC40742I3w.A00(this));
    }

    @Override // com.instagram.model.shopping.productimagecontainer.ProductImageContainer
    public final String getPreview() {
        return this.A01;
    }
}
