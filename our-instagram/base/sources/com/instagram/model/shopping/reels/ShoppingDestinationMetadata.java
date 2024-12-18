package com.instagram.model.shopping.reels;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.I4D;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ShoppingDestinationMetadata extends C0T6 implements Parcelable, ShoppingDestinationMetadataIntf {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(63);
    public final ProductCollectionLinkMetadata A00;
    public final ShoppingIncentiveMetadata A01;

    @Override // com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf
    public final ShoppingDestinationMetadata F6T() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingDestinationMetadata) {
                ShoppingDestinationMetadata shoppingDestinationMetadata = (ShoppingDestinationMetadata) obj;
                if (!C14360o3.A0K(this.A01, shoppingDestinationMetadata.A01) || !C14360o3.A0K(this.A00, shoppingDestinationMetadata.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        ShoppingIncentiveMetadata shoppingIncentiveMetadata = this.A01;
        if (shoppingIncentiveMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shoppingIncentiveMetadata.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf
    public final /* bridge */ /* synthetic */ ShoppingIncentiveMetadataIntf BHL() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf
    public final ProductCollectionLinkMetadata Bt6() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTDestinationMetadata", I4D.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public ShoppingDestinationMetadata(ProductCollectionLinkMetadata productCollectionLinkMetadata, ShoppingIncentiveMetadata shoppingIncentiveMetadata) {
        this.A01 = shoppingIncentiveMetadata;
        this.A00 = productCollectionLinkMetadata;
    }
}
