package com.facebook.wearable.applinks;

import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public enum AppLinkDeviceHardwareState implements Parcelable {
    HINGE_OPEN(0),
    HINGE_CLOSED(1),
    IN_DEEP_SLEEP(2),
    OUT_OF_DEEP_SLEEP(3),
    STREAMING_ACTIVE(4),
    STREAMING_INACTIVE(5);

    public static final Parcelable.Creator CREATOR = C63473SlE.A01(82);
    public final int value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getValue() {
        return this.value;
    }

    AppLinkDeviceHardwareState(int i) {
        this.value = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
