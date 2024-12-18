package com.facebook.wearable.applinks;

import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public enum AppLinkDeviceMountState implements Parcelable {
    MOUNTED(0),
    UNMOUNTED(1);

    public static final Parcelable.Creator CREATOR = C63473SlE.A01(83);
    public final int value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getValue() {
        return this.value;
    }

    AppLinkDeviceMountState(int i) {
        this.value = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
