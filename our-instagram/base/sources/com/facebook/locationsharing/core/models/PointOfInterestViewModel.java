package com.facebook.locationsharing.core.models;

import X.AbstractC25228BEl;
import X.AbstractC25235BEs;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class PointOfInterestViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(41);
    public final double A00;
    public final double A01;
    public final String A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public PointOfInterestViewModel(String str, String str2, String str3, String str4, double d, double d2, long j) {
        this.A03 = j;
        AbstractC63311ShH.A04(str, "fullAddress");
        this.A02 = str;
        this.A00 = d;
        this.A01 = d2;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PointOfInterestViewModel) {
                PointOfInterestViewModel pointOfInterestViewModel = (PointOfInterestViewModel) obj;
                if (this.A03 != pointOfInterestViewModel.A03 || !C14360o3.A0K(this.A02, pointOfInterestViewModel.A02) || this.A00 != pointOfInterestViewModel.A00 || this.A01 != pointOfInterestViewModel.A01 || !C14360o3.A0K(this.A04, pointOfInterestViewModel.A04) || !C14360o3.A0K(this.A05, pointOfInterestViewModel.A05) || !C14360o3.A0K(this.A06, pointOfInterestViewModel.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC63311ShH.A00(this.A01, AbstractC63311ShH.A00(this.A00, ((AbstractC25228BEl.A03(this.A03) + 31) * 31) + AbstractC25235BEs.A06(this.A02))) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A06);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeString(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A05, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
    }

    public PointOfInterestViewModel(Parcel parcel) {
        getClass().getClassLoader();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : null;
    }
}
