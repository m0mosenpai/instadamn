package com.instagram.business.insights.model;

import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class FollowersGrowthData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(38);
    public final int A00;
    public final String A01;
    public final List A02;

    public FollowersGrowthData(List list, int i, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FollowersGrowthData) {
                FollowersGrowthData followersGrowthData = (FollowersGrowthData) obj;
                if (!C14360o3.A0K(this.A01, followersGrowthData.A01) || this.A00 != followersGrowthData.A00 || !C14360o3.A0K(this.A02, followersGrowthData.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A00) * 31) + this.A02.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u.hasNext()) {
            ((GrowthDataPoint) A0u.next()).writeToParcel(parcel, i);
        }
    }
}
