package com.google.android.gms.fido.fido2.api.common;

import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public enum ResidentKeyRequirement implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator CREATOR = C63474SlF.A01(80);
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

    ResidentKeyRequirement(String str) {
        this.A00 = str;
    }

    public static ResidentKeyRequirement A00(String str) {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.A00)) {
                return residentKeyRequirement;
            }
        }
        throw new Exception(String.format("Resident key requirement %s not supported", str));
    }
}
