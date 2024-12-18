package com.instagram.sponsored.signals.model;

import X.AbstractC40878I9c;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class AdsIAWRatingInfo extends C0T6 implements Parcelable, AdsIAWRatingInfoIntf {
    public static final Parcelable.Creator CREATOR = new C37324GcR(98);
    public final Boolean A00;
    public final Float A01;
    public final Integer A02;
    public final String A03;
    public final List A04;

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final AdsIAWRatingInfo F7I() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdsIAWRatingInfo) {
                AdsIAWRatingInfo adsIAWRatingInfo = (AdsIAWRatingInfo) obj;
                if (!C14360o3.A0K(this.A03, adsIAWRatingInfo.A03) || !C14360o3.A0K(this.A00, adsIAWRatingInfo.A00) || !C14360o3.A0K(this.A04, adsIAWRatingInfo.A04) || !C14360o3.A0K(this.A01, adsIAWRatingInfo.A01) || !C14360o3.A0K(this.A02, adsIAWRatingInfo.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A00;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.A04;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Float f = this.A01;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.A02;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final String AfN() {
        return this.A03;
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final List BkM() {
        return this.A04;
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final Float BkR() {
        return this.A01;
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final Integer BpC() {
        return this.A02;
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final Boolean CSY() {
        return this.A00;
    }

    @Override // com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdsIAWRatingAndReviewInfoDict", AbstractC40878I9c.A00(this));
    }

    public AdsIAWRatingInfo(Boolean bool, Float f, Integer num, String str, List list) {
        this.A03 = str;
        this.A00 = bool;
        this.A04 = list;
        this.A01 = f;
        this.A02 = num;
    }
}
