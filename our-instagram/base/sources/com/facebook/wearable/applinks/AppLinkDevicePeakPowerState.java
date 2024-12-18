package com.facebook.wearable.applinks;

import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public enum AppLinkDevicePeakPowerState implements Parcelable {
    NORMAL(0),
    THROTTLE_LEVEL_1(1),
    THROTTLE_LEVEL_2(2),
    THROTTLE_LEVEL_3(3),
    SHUTDOWN(4),
    UNKNOWN(5);

    public static final Parcelable.Creator CREATOR = C63473SlE.A01(84);
    public final int value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getValue() {
        return this.value;
    }

    AppLinkDevicePeakPowerState(int i) {
        this.value = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
