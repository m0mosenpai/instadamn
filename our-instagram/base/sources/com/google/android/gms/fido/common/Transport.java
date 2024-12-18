package com.google.android.gms.fido.common;

import X.C00O;
import X.C63474SlF;
import X.C73284XzU;
import X.T62;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes10.dex */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_CLASSIC("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_LOW_ENERGY("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    NFC("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    USB("usb"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("internal"),
    HYBRID("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator CREATOR = C63474SlF.A01(63);
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public static Transport A00(String str) {
        if (str.equals("hybrid")) {
            T62.A01.A00.FFc();
            C73284XzU.A02.FFc();
            throw C00O.createAndThrow();
        }
        for (Transport transport : values()) {
            if (str.equals(transport.A00)) {
                return transport;
            }
        }
        throw new Exception(String.format("Transport %s not supported", str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    Transport(String str) {
        this.A00 = str;
    }
}
