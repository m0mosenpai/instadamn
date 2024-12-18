package com.instagram.sponsored.signals.model;

import X.AbstractC40880I9e;
import X.C0T6;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class AdsTextTrustInfo extends C0T6 implements Parcelable, AdsTextTrustInfoIntf {
    public static final Parcelable.Creator CREATOR = new C55344OhA(0);
    public final AdsBizBadgeInfo A00;
    public final List A01;

    @Override // com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf
    public final AdsTextTrustInfo F7K() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdsTextTrustInfo) {
                AdsTextTrustInfo adsTextTrustInfo = (AdsTextTrustInfo) obj;
                if (!C14360o3.A0K(this.A00, adsTextTrustInfo.A00) || !C14360o3.A0K(this.A01, adsTextTrustInfo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AdsBizBadgeInfo adsBizBadgeInfo = this.A00;
        int hashCode = (adsBizBadgeInfo == null ? 0 : adsBizBadgeInfo.hashCode()) * 31;
        List list = this.A01;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }

    @Override // com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf
    public final AdsBizBadgeInfo BHX() {
        return this.A00;
    }

    @Override // com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf
    public final List BHa() {
        return this.A01;
    }

    @Override // com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsTextTrustInfoDataDict", AbstractC40880I9e.A00(this));
    }

    public AdsTextTrustInfo(AdsBizBadgeInfo adsBizBadgeInfo, List list) {
        this.A00 = adsBizBadgeInfo;
        this.A01 = list;
    }
}
