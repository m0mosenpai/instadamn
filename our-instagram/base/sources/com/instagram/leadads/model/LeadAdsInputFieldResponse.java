package com.instagram.leadads.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import X.VG1;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class LeadAdsInputFieldResponse extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(10);
    public VG1 A00 = null;
    public String A03 = null;
    public String A02 = null;
    public String A01 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadAdsInputFieldResponse) {
                LeadAdsInputFieldResponse leadAdsInputFieldResponse = (LeadAdsInputFieldResponse) obj;
                if (this.A00 != leadAdsInputFieldResponse.A00 || !C14360o3.A0K(this.A03, leadAdsInputFieldResponse.A03) || !C14360o3.A0K(this.A02, leadAdsInputFieldResponse.A02) || !C14360o3.A0K(this.A01, leadAdsInputFieldResponse.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        VG1 vg1 = this.A00;
        if (vg1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, vg1);
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A01);
    }
}
