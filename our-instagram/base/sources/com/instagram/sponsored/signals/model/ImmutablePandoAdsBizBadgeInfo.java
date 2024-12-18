package com.instagram.sponsored.signals.model;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoAdsBizBadgeInfo extends C17T implements AdsBizBadgeInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(86);

    @Override // com.instagram.sponsored.signals.model.AdsBizBadgeInfo
    public final AdsRatingInfoIntf BkO() {
        return (AdsRatingInfoIntf) A05(405136912, ImmutablePandoAdsRatingInfo.class);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.sponsored.signals.model.AdsBizBadgeInfo
    public final AdsBizBadgeInfoImpl F7G() {
        AdsRatingInfo adsRatingInfo;
        AdsRatingInfoIntf BkO = BkO();
        if (BkO != null) {
            adsRatingInfo = BkO.F7J();
        } else {
            adsRatingInfo = null;
        }
        return new AdsBizBadgeInfoImpl(adsRatingInfo);
    }

    @Override // com.instagram.sponsored.signals.model.AdsBizBadgeInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (BkO() != null) {
            AdsRatingInfoIntf BkO = BkO();
            if (BkO != null) {
                treeUpdaterJNI = BkO.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("rating_info", treeUpdaterJNI);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
