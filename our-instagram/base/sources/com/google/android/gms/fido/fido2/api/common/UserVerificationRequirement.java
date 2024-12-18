package com.google.android.gms.fido.fido2.api.common;

import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public enum UserVerificationRequirement implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator CREATOR = C63474SlF.A01(86);
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    UserVerificationRequirement(String str) {
        this.A00 = str;
    }

    public static UserVerificationRequirement A00(String str) {
        for (UserVerificationRequirement userVerificationRequirement : values()) {
            if (str.equals(userVerificationRequirement.A00)) {
                return userVerificationRequirement;
            }
        }
        throw new Exception(String.format("User verification requirement %s not supported", str));
    }
}
