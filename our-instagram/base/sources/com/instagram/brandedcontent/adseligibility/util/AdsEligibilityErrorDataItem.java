package com.instagram.brandedcontent.adseligibility.util;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class AdsEligibilityErrorDataItem extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(23);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdsEligibilityErrorDataItem) {
                AdsEligibilityErrorDataItem adsEligibilityErrorDataItem = (AdsEligibilityErrorDataItem) obj;
                if (!C14360o3.A0K(this.A01, adsEligibilityErrorDataItem.A01) || !C14360o3.A0K(this.A02, adsEligibilityErrorDataItem.A02) || !C14360o3.A0K(this.A00, adsEligibilityErrorDataItem.A00)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)));
    }

    public AdsEligibilityErrorDataItem(String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
