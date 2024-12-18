package com.instagram.model.shopping.reels;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.I43;
import X.JDJ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductCollectionLinkMetadata extends C17T implements ProductCollectionLinkMetadata {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(67);

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final ProductCollectionReviewStatus BpG() {
        return (ProductCollectionReviewStatus) A0N(1206018745, JDJ.A00);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I43.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final String ApG() {
        return A0i(1060506683);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final String BSZ() {
        return A0j(574223090);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final String Bgr() {
        return A0k(262907660);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkMetadata
    public final ProductCollectionLinkMetadataImpl F6I() {
        return new ProductCollectionLinkMetadataImpl(BpG(), A0i(1060506683), A0j(574223090), A0k(262907660));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
