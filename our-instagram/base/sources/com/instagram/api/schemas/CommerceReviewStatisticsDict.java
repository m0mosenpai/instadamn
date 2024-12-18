package com.instagram.api.schemas;

import X.AbstractC39847Hlv;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class CommerceReviewStatisticsDict extends C0T6 implements Parcelable, CommerceReviewStatisticsDictIntf {
    public static final Parcelable.Creator CREATOR = new C206149Aw(76);
    public final Float A00;
    public final Integer A01;
    public final List A02;

    @Override // com.instagram.api.schemas.CommerceReviewStatisticsDictIntf
    public final CommerceReviewStatisticsDict EsV() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommerceReviewStatisticsDict) {
                CommerceReviewStatisticsDict commerceReviewStatisticsDict = (CommerceReviewStatisticsDict) obj;
                if (!C14360o3.A0K(this.A00, commerceReviewStatisticsDict.A00) || !C14360o3.A0K(this.A02, commerceReviewStatisticsDict.A02) || !C14360o3.A0K(this.A01, commerceReviewStatisticsDict.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A00;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        List list = this.A02;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.A01;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Float f = this.A00;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        List list = this.A02;
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
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    @Override // com.instagram.api.schemas.CommerceReviewStatisticsDictIntf
    public final Float Aen() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CommerceReviewStatisticsDictIntf
    public final List BkS() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.CommerceReviewStatisticsDictIntf
    public final Integer BpC() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CommerceReviewStatisticsDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCommerceReviewStatisticsDict", AbstractC39847Hlv.A00(this));
    }

    public CommerceReviewStatisticsDict(Float f, Integer num, List list) {
        this.A00 = f;
        this.A02 = list;
        this.A01 = num;
    }
}
