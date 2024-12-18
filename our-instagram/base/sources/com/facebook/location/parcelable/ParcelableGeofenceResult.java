package com.facebook.location.parcelable;

import X.AbstractC37304Gc5;
import X.C103804lz;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableGeofenceResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(28);
    public final float A00;
    public final long A01;
    public final long A02;
    public final C103804lz A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableGeofenceResult(Parcel parcel) {
        C103804lz c103804lz = (C103804lz) AbstractC37304Gc5.A04(parcel, ParcelableImmutableLocation.class);
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        float readFloat = parcel.readFloat();
        this.A03 = c103804lz;
        this.A02 = readLong;
        this.A01 = readLong2;
        this.A00 = readFloat;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((ParcelableImmutableLocation) this.A03, i);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeFloat(this.A00);
    }
}
