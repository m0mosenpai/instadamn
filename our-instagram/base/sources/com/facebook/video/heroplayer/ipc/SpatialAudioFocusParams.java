package com.facebook.video.heroplayer.ipc;

import X.AbstractC43593JPy;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class SpatialAudioFocusParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(78);
    public final double A00;
    public final double A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A00);
    }

    public SpatialAudioFocusParams(Parcel parcel) {
        this.A02 = AbstractC43593JPy.A1Y(parcel.readByte());
        this.A01 = parcel.readDouble();
        this.A00 = parcel.readDouble();
    }
}
