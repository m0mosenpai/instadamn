package com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model;

import X.AbstractC203548zF;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class TransformMatrixParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(14);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04;
    public final Integer A05;
    public final Integer A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformMatrixParams(TransformMatrixParams transformMatrixParams) {
        this(transformMatrixParams.A06, transformMatrixParams.A05, 1.0f, 0.0f, 0.0f, 0.0f, transformMatrixParams.A04);
        C14360o3.A0B(transformMatrixParams, 1);
        this.A01 = transformMatrixParams.A01;
        this.A00 = transformMatrixParams.A00;
        this.A02 = transformMatrixParams.A02;
        this.A03 = transformMatrixParams.A03;
    }

    public final synchronized void A00(TransformMatrixParams transformMatrixParams) {
        this.A01 = transformMatrixParams.A01;
        this.A00 = transformMatrixParams.A00;
        this.A02 = transformMatrixParams.A02;
        this.A03 = transformMatrixParams.A03;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeString(AbstractC203548zF.A01(this.A06));
        parcel.writeString(AbstractC203548zF.A01(this.A05));
    }

    public final boolean A01() {
        if (this.A01 == 1.0f && this.A00 == 0.0f && this.A02 == 0.0f && this.A03 == 0.0f) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransformMatrixParams)) {
            return false;
        }
        TransformMatrixParams transformMatrixParams = (TransformMatrixParams) obj;
        if (this.A04 != transformMatrixParams.A04 || this.A01 != transformMatrixParams.A01 || this.A00 != transformMatrixParams.A00 || this.A02 != transformMatrixParams.A02 || this.A03 != transformMatrixParams.A03 || this.A06 != transformMatrixParams.A06 || this.A05 != transformMatrixParams.A05) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int floatToIntBits = ((((((((i * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03)) * 31;
        Integer num = this.A06;
        int hashCode = (floatToIntBits + AbstractC203548zF.A01(num).hashCode() + num.intValue()) * 31;
        Integer num2 = this.A05;
        return hashCode + AbstractC203548zF.A01(num2).hashCode() + num2.intValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("forceCenterCropScale ");
        sb.append(this.A04);
        sb.append("\nscale ");
        sb.append(this.A01);
        sb.append("\nrotation ");
        sb.append(this.A00);
        sb.append("\ntranslationX ");
        sb.append(this.A02);
        sb.append("\ntranslationY ");
        sb.append(this.A03);
        sb.append("\ntextureTransformTarget ");
        sb.append(AbstractC203548zF.A01(this.A06));
        sb.append("\ncontentTransformTarget ");
        sb.append(AbstractC203548zF.A01(this.A05));
        sb.append('\n');
        return sb.toString();
    }

    public TransformMatrixParams(Integer num, Integer num2, float f, float f2, float f3, float f4, boolean z) {
        this.A04 = z;
        this.A01 = f;
        this.A00 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A06 = num;
        this.A05 = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TransformMatrixParams() {
        /*
            r8 = this;
            r7 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            java.lang.Integer r1 = X.C05F.A00
            r0 = r8
            r2 = r1
            r5 = r4
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams.<init>():void");
    }
}
