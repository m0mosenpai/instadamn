package com.google.android.gms.fido.u2f.api.common;

import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes10.dex */
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    V1("U2F_V1"),
    /* JADX INFO: Fake field, exist only in values array */
    V2("U2F_V2");

    public static final Parcelable.Creator CREATOR = C63471SlC.A00(12);
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public static ProtocolVersion A00(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.A00)) {
                return protocolVersion;
            }
        }
        throw new Exception(String.format("Protocol version %s not supported", str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    ProtocolVersion(String str) {
        this.A00 = str;
    }
}
