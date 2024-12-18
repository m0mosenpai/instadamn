package com.facebook.location.parcelable;

import X.AbstractC58321PtD;
import X.C103804lz;
import X.C63473SlE;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableImmutableLocation extends C103804lz implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C103804lz)) {
            return false;
        }
        Location location = this.A00;
        double latitude = location.getLatitude();
        Location location2 = ((C103804lz) obj).A00;
        return Double.compare(latitude, location2.getLatitude()) == 0 && Double.compare(location.getLongitude(), location2.getLongitude()) == 0 && Float.compare(location.getAccuracy(), location2.getAccuracy()) == 0 && location.getTime() == location2.getTime();
    }

    public final int hashCode() {
        Location location = this.A00;
        long doubleToLongBits = Double.doubleToLongBits(location.getLatitude());
        int A08 = AbstractC58321PtD.A08(Float.floatToIntBits(location.getAccuracy()), AbstractC58321PtD.A08(Double.doubleToLongBits(location.getLongitude()), (527 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) * 31);
        long time = location.getTime();
        return (A08 * 31) + ((int) ((time >>> 32) ^ time));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte b;
        parcel.writeParcelable(new Location(this.A00), i);
        Boolean bool = this.A01;
        if (bool == null) {
            b = 2;
        } else {
            b = bool.booleanValue();
        }
        parcel.writeByte(b);
    }
}
