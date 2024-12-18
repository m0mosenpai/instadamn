package com.instagram.sponsored.signals.model;

import X.AbstractC40879I9d;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class AdsRatingInfo extends C0T6 implements AdsRatingInfoIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(99);
    public final AdsRatingAndReviewDisplayFormat A00;
    public final Boolean A01;
    public final Float A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final AdsRatingInfo F7J() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdsRatingInfo) {
                AdsRatingInfo adsRatingInfo = (AdsRatingInfo) obj;
                if (!C14360o3.A0K(this.A04, adsRatingInfo.A04) || !C14360o3.A0K(this.A01, adsRatingInfo.A01) || this.A00 != adsRatingInfo.A00 || !C14360o3.A0K(this.A05, adsRatingInfo.A05) || !C14360o3.A0K(this.A02, adsRatingInfo.A02) || !C14360o3.A0K(this.A03, adsRatingInfo.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A01;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat = this.A00;
        int hashCode3 = (hashCode2 + (adsRatingAndReviewDisplayFormat == null ? 0 : adsRatingAndReviewDisplayFormat.hashCode())) * 31;
        List list = this.A05;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Float f = this.A02;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.A03;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        List list = this.A05;
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
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final String Ayb() {
        return this.A04;
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final AdsRatingAndReviewDisplayFormat BkK() {
        return this.A00;
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final List BkM() {
        return this.A05;
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final Float BkR() {
        return this.A02;
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final Integer BpC() {
        return this.A03;
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final Boolean CW2() {
        return this.A01;
    }

    @Override // com.instagram.sponsored.signals.model.AdsRatingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsRatingAndReviewInfoDict", AbstractC40879I9d.A00(this));
    }

    public AdsRatingInfo(AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat, Boolean bool, Float f, Integer num, String str, List list) {
        this.A04 = str;
        this.A01 = bool;
        this.A00 = adsRatingAndReviewDisplayFormat;
        this.A05 = list;
        this.A02 = f;
        this.A03 = num;
    }
}
