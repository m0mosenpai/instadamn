package com.facebook.location.logging;

import X.AbstractC25228BEl;
import X.AbstractC58321PtD;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class MaxImpressionsPerInterval implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(24);
    public final int A00;
    public final long A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MaxImpressionsPerInterval) {
                MaxImpressionsPerInterval maxImpressionsPerInterval = (MaxImpressionsPerInterval) obj;
                if (this.A01 != maxImpressionsPerInterval.A01 || this.A00 != maxImpressionsPerInterval.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC25228BEl.A03(this.A01) + 31) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
    }

    public MaxImpressionsPerInterval(Parcel parcel) {
        AbstractC58321PtD.A1O(this);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
    }
}
