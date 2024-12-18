package com.instagram.model.shopping.productcollection;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC40728I3i;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;

/* loaded from: classes7.dex */
public final class ProductCollectionCoverImpl extends C0T6 implements Parcelable, ProductCollectionCover {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(38);
    public final ProductImageContainer A00;
    public final IgShowreelNativeAnimation A01;

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionCover
    public final ProductCollectionCoverImpl F6B() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionCoverImpl) {
                ProductCollectionCoverImpl productCollectionCoverImpl = (ProductCollectionCoverImpl) obj;
                if (!C14360o3.A0K(this.A00, productCollectionCoverImpl.A00) || !C14360o3.A0K(this.A01, productCollectionCoverImpl.A01)) {
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
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionCover
    public final ProductImageContainer BGV() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionCover
    public final /* bridge */ /* synthetic */ IgShowreelNativeAnimationIntf Bx7() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionCover
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMicroProductCollectionTileCoverMediaDict", AbstractC40728I3i.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public ProductCollectionCoverImpl(ProductImageContainer productImageContainer, IgShowreelNativeAnimation igShowreelNativeAnimation) {
        this.A00 = productImageContainer;
        this.A01 = igShowreelNativeAnimation;
    }
}
