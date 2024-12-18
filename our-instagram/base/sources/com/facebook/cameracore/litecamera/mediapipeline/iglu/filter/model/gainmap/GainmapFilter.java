package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap;

import X.C14360o3;
import X.C206149Aw;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class GainmapFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C206149Aw(13);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public boolean A0A;
    public boolean A0B;
    public final String A0C;
    public final float[] A0D;
    public final float[] A0E;
    public final float[] A0F;
    public final TransformMatrixParams A0G;
    public final float[] A0H;

    /* JADX WARN: Multi-variable type inference failed */
    public GainmapFilter() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A07);
        parcel.writeString(this.A0C);
        parcel.writeFloatArray(this.A0F);
        parcel.writeFloatArray(this.A0D);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeParcelable(this.A0G, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GainmapFilter(java.lang.String r15, float[] r16, float[] r17, float r18, int r19) {
        /*
            r14 = this;
            r11 = r17
            r10 = r16
            r9 = r15
            r12 = r18
            r1 = 0
            r0 = r19 & 1
            if (r0 == 0) goto Le
            r12 = 1065353216(0x3f800000, float:1.0)
        Le:
            r0 = r19 & 2
            if (r0 == 0) goto L14
            java.lang.String r9 = "gainmap"
        L14:
            r0 = r19 & 4
            if (r0 == 0) goto L1c
            float[] r10 = X.AbstractC199498rs.A00()
        L1c:
            r0 = r19 & 8
            if (r0 == 0) goto L24
            float[] r11 = X.AbstractC199498rs.A00()
        L24:
            r0 = r19 & 16
            r13 = 0
            if (r0 == 0) goto L2a
            r13 = 1
        L2a:
            r0 = r19 & 32
            if (r0 == 0) goto L3c
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            java.lang.Integer r2 = X.C05F.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L3c:
            r7 = r14
            r8 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter.<init>(java.lang.String, float[], float[], float, int):void");
    }

    public final void A00(float f) {
        boolean z;
        float pow;
        double d = f;
        float log = (float) Math.log(d);
        float log2 = (float) Math.log(this.A06);
        this.A08 = Math.max(Math.min((log - log2) / (((float) Math.log(this.A05)) - log2), 1.0f), 0.0f);
        float[] fArr = this.A0H;
        float[] fArr2 = this.A0E;
        float f2 = fArr[0];
        float pow2 = (float) Math.pow(d, 1.0f / f2);
        fArr2[0] = f2;
        fArr2[1] = fArr[1] * pow2;
        fArr2[2] = fArr[2] * pow2;
        fArr2[3] = fArr[3] * f;
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[5] * f;
        fArr2[6] = fArr[6] * f;
        float[] fArr3 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        float f3 = (fArr2[3] * fArr2[4]) + fArr2[6];
        float pow3 = ((float) Math.pow((fArr2[1] * r2) + fArr2[2], fArr2[0])) + fArr2[5];
        if (Math.abs(f3 - pow3) <= 0.001953125f) {
            float f4 = (f3 + pow3) / 2.0f;
            fArr3[4] = f4;
            if (f4 > 0.0f) {
                fArr3[3] = 1.0f / fArr2[3];
                fArr3[6] = (-fArr2[6]) / fArr2[3];
            }
            double d2 = fArr2[1];
            float f5 = fArr2[0];
            float pow4 = (float) Math.pow(d2, -f5);
            fArr3[0] = 1.0f / f5;
            fArr3[1] = pow4;
            float f6 = -pow4;
            float f7 = f6 * fArr2[5];
            fArr3[2] = f7;
            fArr3[5] = (-fArr2[2]) / fArr2[1];
            if (pow4 >= 0.0f) {
                float f8 = fArr3[4];
                if ((pow4 * f8) + f7 < 0.0f) {
                    fArr3[2] = f6 * f8;
                }
                if ((pow4 * f8) + fArr3[2] >= 0.0f) {
                    float f9 = 1.0f * 1.0f;
                    if (f9 < fArr2[4]) {
                        pow = fArr2[3] * f9 * fArr2[6];
                    } else {
                        pow = ((float) Math.pow((fArr2[1] * f9) + fArr2[2], fArr2[0])) + fArr2[5];
                    }
                    float f10 = 1.0f * pow;
                    float f11 = 1.0f;
                    if (f10 < 0.0f) {
                        f11 = -1.0f;
                    }
                    float f12 = f10 * f11;
                    if (f12 < fArr3[4]) {
                        fArr3[6] = 1.0f - ((f11 * fArr3[3]) * f12);
                    } else {
                        fArr3[5] = 1.0f - (f11 * ((float) Math.pow((fArr3[1] * f12) + r12, fArr3[0])));
                    }
                    float f13 = fArr3[0];
                    float f14 = fArr3[1];
                    float f15 = fArr3[2];
                    float f16 = fArr3[3];
                    float f17 = fArr3[4];
                    float f18 = f14 + f15 + f16 + f17 + fArr3[5] + fArr3[6] + f13;
                    if (!Float.isInfinite(f18) && !Float.isNaN(f18) && f14 >= 0.0f && f16 >= 0.0f && f17 >= 0.0f && f13 >= 0.0f && (f14 * f17) + f15 >= 0.0f) {
                        System.arraycopy(fArr3, 0, fArr2, 0, 7);
                        z = true;
                        this.A0B = z;
                    }
                }
            }
        }
        z = false;
        this.A0B = z;
    }

    public final void A01(boolean z) {
        float[] fArr = this.A0D;
        Matrix.setIdentityM(fArr, 0);
        if (z) {
            Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        }
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        float f = this.A07;
        String str = this.A0C;
        float[] fArr = this.A0F;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C14360o3.A07(copyOf);
        float[] fArr2 = this.A0D;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        C14360o3.A07(copyOf2);
        return new GainmapFilter(str, copyOf, copyOf2, f, 48);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A0D;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return this.A0C;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getTextureTransform() {
        return this.A0F;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A0G;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final boolean isEnabled() {
        return this.A0A;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A0A = z;
    }

    public GainmapFilter(TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, float f, boolean z) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(fArr, 3);
        C14360o3.A0B(fArr2, 4);
        C14360o3.A0B(transformMatrixParams, 6);
        this.A07 = f;
        this.A0C = str;
        this.A0F = fArr;
        this.A0D = fArr2;
        this.A0A = z;
        this.A0G = transformMatrixParams;
        this.A08 = 1.0f;
        this.A06 = 1.0f;
        this.A05 = 1.0f;
        this.A04 = 1.0f;
        this.A03 = 1.0f;
        this.A02 = 1.0f;
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A0H = new float[]{2.4f, 0.94786733f, 0.052132703f, 0.07739938f, 0.04045f, 0.0f, 0.0f};
        this.A0E = new float[7];
    }
}
