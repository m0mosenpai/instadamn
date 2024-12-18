package com.instagram.model.shopping.reels;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.I4D;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoShoppingDestinationMetadata extends C17T implements ShoppingDestinationMetadataIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(72);

    @Override // com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf
    public final ShoppingIncentiveMetadataIntf BHL() {
        return (ShoppingIncentiveMetadataIntf) A05(759953283, ImmutablePandoShoppingIncentiveMetadata.class);
    }

    @Override // com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf
    public final ProductCollectionLinkMetadata Bt6() {
        return (ProductCollectionLinkMetadata) A05(402064288, ImmutablePandoProductCollectionLinkMetadata.class);
    }

    @Override // com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I4D.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf
    public final ShoppingDestinationMetadata F6T() {
        ShoppingIncentiveMetadata shoppingIncentiveMetadata;
        ShoppingIncentiveMetadataIntf BHL = BHL();
        ProductCollectionLinkMetadataImpl productCollectionLinkMetadataImpl = null;
        if (BHL != null) {
            shoppingIncentiveMetadata = BHL.F6U();
        } else {
            shoppingIncentiveMetadata = null;
        }
        ProductCollectionLinkMetadata Bt6 = Bt6();
        if (Bt6 != null) {
            productCollectionLinkMetadataImpl = Bt6.F6I();
        }
        return new ShoppingDestinationMetadata(productCollectionLinkMetadataImpl, shoppingIncentiveMetadata);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
