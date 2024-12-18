package com.instagram.sponsored.signals.model;

import X.AbstractC06930Yk;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class AdsBizBadgeInfoImpl extends C0T6 implements Parcelable, AdsBizBadgeInfo {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(96);
    public final AdsRatingInfo A00;

    @Override // com.instagram.sponsored.signals.model.AdsBizBadgeInfo
    public final AdsBizBadgeInfoImpl F7G() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AdsBizBadgeInfoImpl) && C14360o3.A0K(this.A00, ((AdsBizBadgeInfoImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AdsRatingInfo adsRatingInfo = this.A00;
        if (adsRatingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsRatingInfo.writeToParcel(parcel, i);
        }
    }

    @Override // com.instagram.sponsored.signals.model.AdsBizBadgeInfo
    public final /* bridge */ /* synthetic */ AdsRatingInfoIntf BkO() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public AdsBizBadgeInfoImpl(AdsRatingInfo adsRatingInfo) {
        this.A00 = adsRatingInfo;
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
        return AbstractC37300Gc1.A05("XDTIGAdsBizBadgeInfoDict", AbstractC06930Yk.A0B(A0X));
    }
}
