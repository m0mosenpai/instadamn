package com.encryptedbackups.storagemanagers.otc.model;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.C14360o3;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class OneTimeCodeDevice implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Py5(85);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public OneTimeCodeDevice(String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OneTimeCodeDevice) {
                OneTimeCodeDevice oneTimeCodeDevice = (OneTimeCodeDevice) obj;
                if (!C14360o3.A0K(this.A00, oneTimeCodeDevice.A00) || !C14360o3.A0K(this.A04, oneTimeCodeDevice.A04) || !C14360o3.A0K(this.A01, oneTimeCodeDevice.A01) || !C14360o3.A0K(this.A03, oneTimeCodeDevice.A03) || !C14360o3.A0K(this.A02, oneTimeCodeDevice.A02)) {
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
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return ((((((AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OneTimeCodeDevice(deviceId=");
        A1C.append(this.A00);
        A1C.append(", deviceManufacturer=");
        A1C.append(this.A04);
        A1C.append(", deviceModel=");
        A1C.append(this.A01);
        A1C.append(", lastLoginLocation=");
        A1C.append(this.A03);
        A1C.append(", lastLoginDate=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
