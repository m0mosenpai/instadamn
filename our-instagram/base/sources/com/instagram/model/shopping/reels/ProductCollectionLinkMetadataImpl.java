package com.instagram.model.shopping.reels;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.I43;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;

/* loaded from: classes7.dex */
public final class ProductCollectionLinkMetadataImpl extends C0T6 implements Parcelable, ProductCollectionLinkMetadata {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(57);
    public final ProductCollectionReviewStatus A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ProductCollectionLinkMetadataImpl(ProductCollectionReviewStatus productCollectionReviewStatus, String str, String str2, String str3) {
        C14360o3.A0B(str3, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = productCollectionReviewStatus;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final ProductCollectionLinkMetadataImpl F6I() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionLinkMetadataImpl) {
                ProductCollectionLinkMetadataImpl productCollectionLinkMetadataImpl = (ProductCollectionLinkMetadataImpl) obj;
                if (!C14360o3.A0K(this.A01, productCollectionLinkMetadataImpl.A01) || !C14360o3.A0K(this.A02, productCollectionLinkMetadataImpl.A02) || !C14360o3.A0K(this.A03, productCollectionLinkMetadataImpl.A03) || this.A00 != productCollectionLinkMetadataImpl.A00) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final String ApG() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final String BSZ() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final String Bgr() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final ProductCollectionReviewStatus BpG() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSellerProductCollectionMetadata", I43.A00(this));
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
