package com.facebook.exoplayer.ipc;

import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class RendererContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(87);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A02);
    }

    public RendererContext(Parcel parcel) {
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString2 = parcel.readString();
        this.A03 = readString;
        this.A00 = readInt;
        this.A01 = readInt2;
        this.A02 = readString2;
    }
}
