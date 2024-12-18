package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift;

import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.C14360o3;
import X.C17s;
import X.C63475SlG;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class TiltShiftFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C63475SlG(48);
    public float A00;
    public float A01;
    public float A02;
    public PointF A03;
    public PointF A04;
    public Integer A05;
    public boolean A06;
    public final TransformMatrixParams A07;
    public final String A08;
    public final float[] A09;
    public final float[] A0A;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        switch (this.A05.intValue()) {
            case 1:
                str = "RADIAL";
                break;
            case 2:
                str = "LINEAR";
                break;
            default:
                str = "OFF";
                break;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeFloatArray(this.A0A);
        parcel.writeFloatArray(this.A09);
        parcel.writeParcelable(this.A07, i);
    }

    public final PointF A00() {
        int intValue = this.A05.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return null;
            }
            return this.A03;
        }
        return this.A04;
    }

    public final void A01(float f, float f2) {
        PointF pointF;
        int intValue = this.A05.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                pointF = this.A03;
            } else {
                return;
            }
        } else {
            pointF = this.A04;
        }
        pointF.x = C17s.A01(f);
        pointF.y = C17s.A01(f2);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        Integer num = this.A05;
        PointF pointF = this.A04;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        PointF pointF3 = this.A03;
        PointF pointF4 = new PointF(pointF3.x, pointF3.y);
        float f = this.A00;
        float f2 = this.A02;
        float f3 = this.A01;
        boolean z = this.A06;
        String str = this.A08;
        float[] fArr = this.A0A;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C14360o3.A07(copyOf);
        float[] fArr2 = this.A09;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        C14360o3.A07(copyOf2);
        return new TiltShiftFilter(pointF2, pointF4, new TransformMatrixParams(this.A07), num, str, copyOf, copyOf2, f, f2, f3, z);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A09;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return this.A08;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getTextureTransform() {
        return this.A0A;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A07;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final boolean isEnabled() {
        return this.A06;
    }

    public TiltShiftFilter(PointF pointF, PointF pointF2, TransformMatrixParams transformMatrixParams, Integer num, String str, float[] fArr, float[] fArr2, float f, float f2, float f3, boolean z) {
        AbstractC167017dG.A1R(pointF, pointF2);
        AbstractC25234BEr.A0l(8, str, fArr, fArr2, transformMatrixParams);
        this.A05 = num;
        this.A04 = pointF;
        this.A03 = pointF2;
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A06 = z;
        this.A08 = str;
        this.A0A = fArr;
        this.A09 = fArr2;
        this.A07 = transformMatrixParams;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A06 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TiltShiftFilter() {
        /*
            r20 = this;
            java.lang.Integer r4 = X.C05F.A00
            r8 = 1056964608(0x3f000000, float:0.5)
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r8, r8)
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>(r8, r8)
            r10 = 0
            r11 = 1
            java.lang.String r5 = "tilt_shift"
            float[] r6 = X.AbstractC199498rs.A00()
            float[] r7 = X.AbstractC199498rs.A00()
            r19 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r3 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r12 = r3
            r13 = r4
            r14 = r4
            r16 = r10
            r17 = r10
            r18 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0 = r20
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter.<init>():void");
    }
}
