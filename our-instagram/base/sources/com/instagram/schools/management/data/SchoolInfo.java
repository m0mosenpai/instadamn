package com.instagram.schools.management.data;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class SchoolInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(54);
    public final SchoolAddress A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SchoolInfo) {
                SchoolInfo schoolInfo = (SchoolInfo) obj;
                if (!C14360o3.A0K(this.A02, schoolInfo.A02) || !C14360o3.A0K(this.A01, schoolInfo.A01) || !C14360o3.A0K(this.A00, schoolInfo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        this.A00.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A02)));
    }

    public SchoolInfo(SchoolAddress schoolAddress, String str, String str2) {
        AbstractC167027dH.A13(str, str2, schoolAddress);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = schoolAddress;
    }
}
