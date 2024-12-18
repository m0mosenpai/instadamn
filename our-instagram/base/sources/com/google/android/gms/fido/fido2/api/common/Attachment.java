package com.google.android.gms.fido.fido2.api.common;

import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public enum Attachment implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator CREATOR = C63474SlF.A01(64);
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

    Attachment(String str) {
        this.A00 = str;
    }

    public static Attachment A00(String str) {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.A00)) {
                return attachment;
            }
        }
        throw new Exception(String.format("Attachment %s not supported", str));
    }
}
