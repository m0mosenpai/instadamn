package com.instagram.creation.genai.magicmod.model;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class MagicModPostCaptureTransform implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(72);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
    }

    public MagicModPostCaptureTransform(float f, float f2, float f3, float f4, float f5) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = f4;
        this.A04 = f5;
    }
}
