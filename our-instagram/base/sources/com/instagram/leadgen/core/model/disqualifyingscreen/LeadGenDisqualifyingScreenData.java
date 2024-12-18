package com.instagram.leadgen.core.model.disqualifyingscreen;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class LeadGenDisqualifyingScreenData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(25);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenDisqualifyingScreenData) {
                LeadGenDisqualifyingScreenData leadGenDisqualifyingScreenData = (LeadGenDisqualifyingScreenData) obj;
                if (!C14360o3.A0K(this.A01, leadGenDisqualifyingScreenData.A01) || !C14360o3.A0K(this.A00, leadGenDisqualifyingScreenData.A00) || !C14360o3.A0K(this.A02, leadGenDisqualifyingScreenData.A02) || !C14360o3.A0K(this.A03, leadGenDisqualifyingScreenData.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public LeadGenDisqualifyingScreenData(String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
