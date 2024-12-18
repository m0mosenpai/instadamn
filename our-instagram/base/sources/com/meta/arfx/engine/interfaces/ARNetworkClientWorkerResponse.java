package com.meta.arfx.engine.interfaces;

import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ARNetworkClientWorkerResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(48);
    public int A00 = 0;
    public long A01 = 0;
    public String A02;
    public byte[] A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A03);
        parcel.writeLong(this.A01);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
