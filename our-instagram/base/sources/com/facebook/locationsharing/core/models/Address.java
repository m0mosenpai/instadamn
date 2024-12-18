package com.facebook.locationsharing.core.models;

import X.AbstractC25235BEs;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(34);
    public final Location A00;
    public final String A01;
    public final boolean A02;

    public Address(Location location, String str) {
        this.A02 = false;
        AbstractC63311ShH.A04(str, "localizedAddress");
        this.A01 = str;
        AbstractC63311ShH.A04(location, "location");
        this.A00 = location;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Address) {
                Address address = (Address) obj;
                if (this.A02 != address.A02 || !C14360o3.A0K(this.A01, address.A01) || !C14360o3.A0K(this.A00, address.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC58322PtE.A02(this.A02 ? 1 : 0) + 31) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public Address(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        this.A02 = AbstractC58320PtC.A1T(parcel);
        this.A01 = parcel.readString();
        this.A00 = (Location) parcel.readParcelable(A0g);
    }
}
