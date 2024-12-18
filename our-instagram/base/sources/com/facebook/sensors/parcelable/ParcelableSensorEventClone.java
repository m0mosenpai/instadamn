package com.facebook.sensors.parcelable;

import X.AbstractC25236BEt;
import X.C14360o3;
import X.C63473SlE;
import X.SHZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ParcelableSensorEventClone extends SHZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(56);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SHZ)) {
            return false;
        }
        SHZ shz = (SHZ) obj;
        if (this.A00 != shz.A00 || this.A01 != shz.A01 || this.A02 != shz.A02) {
            return false;
        }
        return Arrays.equals(this.A03, shz.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A02);
        float[] fArr = this.A03;
        parcel.writeInt(fArr.length);
        parcel.writeFloatArray(fArr);
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A02, ((this.A00 * 31) + this.A01) * 31) + Arrays.hashCode(this.A03);
    }
}
