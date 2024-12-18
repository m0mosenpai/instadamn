package com.facebook.locationsharing.core.models;

import X.AbstractC25235BEs;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class PointOfInterest implements Parcelable, PointOfInterestSpec {
    public static final Parcelable.Creator CREATOR = new C63473SlE(40);
    public final Location A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PointOfInterest) {
                PointOfInterest pointOfInterest = (PointOfInterest) obj;
                if (!C14360o3.A0K(this.A01, pointOfInterest.A01) || !C14360o3.A0K(this.A00, pointOfInterest.A00) || !C14360o3.A0K(this.A02, pointOfInterest.A02) || !C14360o3.A0K(this.A03, pointOfInterest.A03) || !C14360o3.A0K(this.A04, pointOfInterest.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC25235BEs.A06(this.A01) + 31) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        AbstractC58322PtE.A1E(parcel, this.A02, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A03, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
    }

    public PointOfInterest(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A01 = parcel.readString();
        this.A00 = (Location) parcel.readParcelable(classLoader);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : null;
    }

    public PointOfInterest(Location location, String str, String str2, String str3, String str4) {
        AbstractC63311ShH.A04(str, "fullAddress");
        this.A01 = str;
        this.A00 = location;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }
}
