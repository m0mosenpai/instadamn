package com.instagram.model.shopping.reels;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.I4E;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoShoppingIncentiveMetadata extends C17T implements ShoppingIncentiveMetadataIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(73);

    @Override // com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I4E.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf
    public final String BHK() {
        return A0k(1853315183);
    }

    @Override // com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf
    public final String BSZ() {
        return A0k(574223090);
    }

    @Override // com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf
    public final ShoppingIncentiveMetadata F6U() {
        return new ShoppingIncentiveMetadata(A0k(1853315183), A0k(574223090));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
