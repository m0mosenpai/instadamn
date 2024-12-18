package com.instagram.schools.management.data;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class SchoolAddress extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(53);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SchoolAddress) {
                SchoolAddress schoolAddress = (SchoolAddress) obj;
                if (!C14360o3.A0K(this.A00, schoolAddress.A00) || !C14360o3.A0K(this.A02, schoolAddress.A02) || !C14360o3.A0K(this.A01, schoolAddress.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A00)));
    }

    public SchoolAddress(String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
