package com.instagram.sponsored.signals.model;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40876I9a;
import X.C17T;
import X.C39305HXw;
import X.JE2;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoAdsCTATrustInfo extends C17T implements AdsCTATrustInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(87);

    @Override // com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf
    public final AdsBizBadgeInfo BHX() {
        return (AdsBizBadgeInfo) A05(1231159451, ImmutablePandoAdsBizBadgeInfo.class);
    }

    @Override // com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf
    public final List BHa() {
        return A0p(-2039993294, JE2.A00);
    }

    @Override // com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40876I9a.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf
    public final AdsCTATrustInfo F7H() {
        AdsBizBadgeInfoImpl adsBizBadgeInfoImpl;
        AdsBizBadgeInfo BHX = BHX();
        if (BHX != null) {
            adsBizBadgeInfoImpl = BHX.F7G();
        } else {
            adsBizBadgeInfoImpl = null;
        }
        return new AdsCTATrustInfo(adsBizBadgeInfoImpl, BHa());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
