package com.instagram.business.insights.model;

import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class GrowthDataPoint extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(39);
    public final int A00;
    public final int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthDataPoint) {
                GrowthDataPoint growthDataPoint = (GrowthDataPoint) obj;
                if (this.A00 != growthDataPoint.A00 || this.A01 != growthDataPoint.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public GrowthDataPoint(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
