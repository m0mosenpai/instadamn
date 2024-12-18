package com.instagram.barcelona.location.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class LocationModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(16);
    public final long A00;
    public final Double A01;
    public final Double A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public LocationModel(Double d, Double d2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j) {
        C14360o3.A0B(str, 2);
        this.A00 = j;
        this.A06 = str;
        this.A01 = d;
        this.A02 = d2;
        this.A05 = str2;
        this.A04 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A07 = str6;
        this.A09 = str7;
        this.A08 = str8;
        this.A0C = str9;
        this.A03 = str10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationModel) {
                LocationModel locationModel = (LocationModel) obj;
                if (this.A00 != locationModel.A00 || !C14360o3.A0K(this.A06, locationModel.A06) || !C14360o3.A0K(this.A01, locationModel.A01) || !C14360o3.A0K(this.A02, locationModel.A02) || !C14360o3.A0K(this.A05, locationModel.A05) || !C14360o3.A0K(this.A04, locationModel.A04) || !C14360o3.A0K(this.A0A, locationModel.A0A) || !C14360o3.A0K(this.A0B, locationModel.A0B) || !C14360o3.A0K(this.A07, locationModel.A07) || !C14360o3.A0K(this.A09, locationModel.A09) || !C14360o3.A0K(this.A08, locationModel.A08) || !C14360o3.A0K(this.A0C, locationModel.A0C) || !C14360o3.A0K(this.A03, locationModel.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A06);
        Double d = this.A01;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.A02;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        int i = 0;
        int A0K = (((((((((((((((((((AbstractC166997dE.A0K(this.A06, AbstractC25228BEl.A03(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0K + i;
    }
}
