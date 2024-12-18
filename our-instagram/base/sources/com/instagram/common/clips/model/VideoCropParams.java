package com.instagram.common.clips.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC28006CWd;
import X.C14360o3;
import X.LNM;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class VideoCropParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(15);
    public final double A00;
    public final float A01;
    public final float A02;
    public final float A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoCropParams) {
                VideoCropParams videoCropParams = (VideoCropParams) obj;
                if (Double.compare(this.A00, videoCropParams.A00) != 0 || Float.compare(this.A01, videoCropParams.A01) != 0 || Float.compare(this.A03, videoCropParams.A03) != 0 || Float.compare(this.A02, videoCropParams.A02) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A02);
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC28006CWd.A00(this.A00) * 31, this.A01), this.A03) + Float.floatToIntBits(this.A02);
    }

    public VideoCropParams(double d, float f, float f2, float f3) {
        this.A00 = d;
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoCropParams(timestampUs=");
        A1C.append(this.A00);
        A1C.append(", leftPercent=");
        A1C.append(this.A01);
        A1C.append(", topPercent=");
        A1C.append(this.A03);
        A1C.append(MSV.A00(70));
        A1C.append(this.A02);
        return AbstractC167017dG.A0p(A1C);
    }
}
