package com.meta.foa.fallbacklogin;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AbstractC25236BEt;
import X.C14360o3;
import X.C55344OhA;
import X.JQ0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class UserLoginCredential implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(61);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserLoginCredential) {
                UserLoginCredential userLoginCredential = (UserLoginCredential) obj;
                if (!C14360o3.A0K(this.A04, userLoginCredential.A04) || !C14360o3.A0K(this.A03, userLoginCredential.A03) || !C14360o3.A0K(this.A00, userLoginCredential.A00) || !C14360o3.A0K(this.A01, userLoginCredential.A01) || !C14360o3.A0K(this.A02, userLoginCredential.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A04)))));
    }

    public UserLoginCredential(String str, String str2, String str3, String str4, String str5) {
        JQ0.A1O(str, str2, str3, str4, str5);
        this.A04 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A01 = str4;
        this.A02 = str5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserLoginCredential(userId=");
        A1C.append(this.A04);
        A1C.append(", token=");
        A1C.append(this.A03);
        A1C.append(", credentialType=");
        A1C.append(this.A00);
        A1C.append(", displayName=");
        A1C.append(this.A01);
        A1C.append(", profilePictureUrl=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
