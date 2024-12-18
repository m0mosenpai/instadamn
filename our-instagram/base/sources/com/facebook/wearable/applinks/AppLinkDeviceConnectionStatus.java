package com.facebook.wearable.applinks;

import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public enum AppLinkDeviceConnectionStatus implements Parcelable {
    CONNECTED(0),
    CONNECTING(1),
    DISCONNECTED(2),
    UNPAIRED(3);

    public static final Parcelable.Creator CREATOR = C63473SlE.A01(81);
    public final int value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getValue() {
        return this.value;
    }

    AppLinkDeviceConnectionStatus(int i) {
        this.value = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
