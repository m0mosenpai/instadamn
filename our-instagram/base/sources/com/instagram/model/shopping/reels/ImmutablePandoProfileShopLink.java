package com.instagram.model.shopping.reels;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.I4A;
import X.JDL;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SellerShoppableFeedType;

/* loaded from: classes7.dex */
public final class ImmutablePandoProfileShopLink extends C17T implements ProfileShopLinkIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(69);

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final SellerShoppableFeedType Bt7() {
        return (SellerShoppableFeedType) A0N(-1692657008, JDL.A00);
    }

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I4A.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final String Bi4() {
        return A0i(520474584);
    }

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final String Bi6() {
        return A0j(-1754614628);
    }

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final String Bi7() {
        return A0i(1441960937);
    }

    @Override // com.instagram.model.shopping.reels.ProfileShopLinkIntf
    public final ProfileShopLink F6P() {
        return new ProfileShopLink(Bt7(), A0i(520474584), A0j(-1754614628), A0i(1441960937));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
