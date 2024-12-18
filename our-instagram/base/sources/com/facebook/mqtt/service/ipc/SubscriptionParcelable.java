package com.facebook.mqtt.service.ipc;

import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class SubscriptionParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(45);
    public int A00;
    public String A01 = "";

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
