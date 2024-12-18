package com.instagram.model.shopping.productcollection;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40728I3i;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductCollectionCover extends C17T implements ProductCollectionCover {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(61);

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionCover
    public final ProductImageContainer BGV() {
        return (ProductImageContainer) A05(100313435, ImmutablePandoProductImageContainer.class);
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionCover
    public final IgShowreelNativeAnimationIntf Bx7() {
        return (IgShowreelNativeAnimationIntf) A05(-824538620, ImmutablePandoIgShowreelNativeAnimation.class);
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionCover
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40728I3i.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.productcollection.ProductCollectionCover
    public final ProductCollectionCoverImpl F6B() {
        ProductImageContainerImpl productImageContainerImpl;
        ProductImageContainer BGV = BGV();
        IgShowreelNativeAnimation igShowreelNativeAnimation = null;
        if (BGV != null) {
            productImageContainerImpl = BGV.F6D();
        } else {
            productImageContainerImpl = null;
        }
        IgShowreelNativeAnimationIntf Bx7 = Bx7();
        if (Bx7 != null) {
            igShowreelNativeAnimation = Bx7.F6Z();
        }
        return new ProductCollectionCoverImpl(productImageContainerImpl, igShowreelNativeAnimation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
