package com.instagram.model.shopping.reels;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39305HXw;
import X.I42;
import X.JDI;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiProductComponentDestinationType;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductCollectionLink extends C17T implements ProductCollectionLinkIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(66);

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final ShoppingDestinationMetadataIntf Ax3() {
        return (ShoppingDestinationMetadataIntf) A05(-593684416, ImmutablePandoShoppingDestinationMetadata.class);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final MultiProductComponentDestinationType Ax6() {
        return (MultiProductComponentDestinationType) A0M(1205427403, JDI.A00);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I42.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final String Aj7() {
        return AbstractC37304Gc5.A0g(this);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final String Ax2() {
        return A0j(912984812);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final String Ax4() {
        return A0i(2090789161);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final String Ax5() {
        return A0i(-1286928665);
    }

    @Override // com.instagram.model.shopping.reels.ProductCollectionLinkIntf
    public final ProductCollectionLink F6H() {
        ShoppingDestinationMetadata shoppingDestinationMetadata;
        String A0g = AbstractC37304Gc5.A0g(this);
        String A0j = A0j(912984812);
        ShoppingDestinationMetadataIntf Ax3 = Ax3();
        if (Ax3 != null) {
            shoppingDestinationMetadata = Ax3.F6T();
        } else {
            shoppingDestinationMetadata = null;
        }
        return new ProductCollectionLink(Ax6(), shoppingDestinationMetadata, A0g, A0j, A0i(2090789161), A0i(-1286928665));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
