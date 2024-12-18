package com.instagram.business.insights.model;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class DataPoint extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(36);
    public final int A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DataPoint) {
                DataPoint dataPoint = (DataPoint) obj;
                if (this.A00 != dataPoint.A00 || !C14360o3.A0K(this.A01, dataPoint.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC167017dG.A0O(this.A01);
    }

    public DataPoint(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
