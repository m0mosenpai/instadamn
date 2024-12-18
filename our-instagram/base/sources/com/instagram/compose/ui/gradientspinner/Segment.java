package com.instagram.compose.ui.gradientspinner;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class Segment extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(23);
    public float A00;
    public float A01;
    public int A02;
    public final int A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (this.A03 != segment.A03 || Float.compare(this.A00, segment.A00) != 0 || Float.compare(this.A01, segment.A01) != 0 || this.A02 != segment.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A02);
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A00(this.A03 * 31, this.A00), this.A01) + this.A02;
    }

    public Segment(int i, float f, float f2, int i2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Segment(segmentIndex=");
        A1C.append(this.A03);
        A1C.append(", progress=");
        A1C.append(this.A00);
        A1C.append(", startDelay=");
        A1C.append(this.A01);
        A1C.append(", iterations=");
        return AbstractC25236BEt.A0Z(A1C, this.A02);
    }
}
