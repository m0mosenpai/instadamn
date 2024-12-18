package com.facebookpay.otc.models;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AnonymousClass001;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class OtcInput implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(16);
    public final String A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OtcInput) {
                OtcInput otcInput = (OtcInput) obj;
                if (!C14360o3.A0K(this.A00, otcInput.A00) || !C14360o3.A0K(this.A01, otcInput.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("OtcInput(otcSessionId=", this.A00, ", otcType=", this.A01, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public OtcInput(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
