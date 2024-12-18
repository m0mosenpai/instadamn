package com.facebook.dsp.core;

import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class OpacityData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(86);
    public final float A00;
    public final float A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public OpacityData(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
