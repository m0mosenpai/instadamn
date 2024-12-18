package com.facebook.location.signalpackage.parcelable;

import X.AbstractC62475SDc;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableDetectedActivity extends AbstractC62475SDc implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(32);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AbstractC62475SDc)) {
            AbstractC62475SDc abstractC62475SDc = (AbstractC62475SDc) obj;
            return this.A01 == abstractC62475SDc.A01 && this.A00 == abstractC62475SDc.A00;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
