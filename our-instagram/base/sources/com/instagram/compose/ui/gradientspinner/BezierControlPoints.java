package com.instagram.compose.ui.gradientspinner;

import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AbstractC25235BEs;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class BezierControlPoints extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(22);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BezierControlPoints) {
                BezierControlPoints bezierControlPoints = (BezierControlPoints) obj;
                if (Float.compare(this.A00, bezierControlPoints.A00) != 0 || Float.compare(this.A02, bezierControlPoints.A02) != 0 || Float.compare(this.A01, bezierControlPoints.A01) != 0 || Float.compare(this.A03, bezierControlPoints.A03) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A03);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A00), this.A02), this.A01), this.A03);
    }

    public BezierControlPoints(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A03 = f4;
    }
}
