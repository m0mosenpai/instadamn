package com.facebookpay.expresscheckout.models;

import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class ECPPreselectedFBPayData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(49);
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
            if (obj instanceof ECPPreselectedFBPayData) {
                ECPPreselectedFBPayData eCPPreselectedFBPayData = (ECPPreselectedFBPayData) obj;
                if (!C14360o3.A0K(this.A00, eCPPreselectedFBPayData.A00) || !C14360o3.A0K(this.A03, eCPPreselectedFBPayData.A03) || !C14360o3.A0K(this.A01, eCPPreselectedFBPayData.A01) || !C14360o3.A0K(this.A02, eCPPreselectedFBPayData.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A17("ECPPreselectedFBPayData(selectedCredentialId=", this.A00, ", selectedShippingAddressId=", this.A03, ", selectedEmailId=", this.A01, ", selectedPhoneId=", this.A02, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public ECPPreselectedFBPayData(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public ECPPreselectedFBPayData() {
        this(null, null, null, null);
    }
}
