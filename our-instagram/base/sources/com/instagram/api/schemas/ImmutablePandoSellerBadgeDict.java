package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40232Hsv;
import X.C17T;
import X.C39307HXy;
import X.C43271JAq;
import X.C43272JAr;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoSellerBadgeDict extends C17T implements SellerBadgeDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(77);

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final List C4T() {
        return A0p(-1615615642, C43271JAq.A00);
    }

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final SellerBadgeType CBZ() {
        return (SellerBadgeType) A0N(3575610, C43272JAr.A00);
    }

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40232Hsv.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final SellerBadgeDict EzO() {
        return new SellerBadgeDict(CBZ(), A0T(), A0W(), C4T());
    }

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final String getDescription() {
        return A0T();
    }

    @Override // com.instagram.api.schemas.SellerBadgeDictIntf
    public final String getName() {
        return A0W();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
