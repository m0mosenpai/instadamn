package com.instagram.creation.capture.quickcapture.analytics.common;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class MediaTransformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(45);
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03 = 1.0f;
    public float A00 = 0.0f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A00);
    }
}
