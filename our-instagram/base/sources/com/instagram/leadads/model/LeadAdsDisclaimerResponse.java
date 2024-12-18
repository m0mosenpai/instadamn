package com.instagram.leadads.model;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class LeadAdsDisclaimerResponse extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(9);
    public String A00 = null;
    public boolean A01 = false;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadAdsDisclaimerResponse) {
                LeadAdsDisclaimerResponse leadAdsDisclaimerResponse = (LeadAdsDisclaimerResponse) obj;
                if (!C14360o3.A0K(this.A00, leadAdsDisclaimerResponse.A00) || this.A01 != leadAdsDisclaimerResponse.A01) {
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
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }
}
