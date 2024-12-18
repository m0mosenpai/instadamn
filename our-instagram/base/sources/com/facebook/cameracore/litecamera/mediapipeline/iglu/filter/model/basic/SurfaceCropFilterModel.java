package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C63475SlG;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.common.math.matrix.Matrix4;

/* loaded from: classes4.dex */
public final class SurfaceCropFilterModel implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C63475SlG(43);
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public FullTransform A06;
    public Matrix4 A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final PointF A0H;
    public final FitTransformParams A0I;
    public final FullTransform A0J;
    public final TransformSteps A0K;
    public final TransformMatrixParams A0L;
    public final Matrix4 A0M;
    public final Matrix4 A0N;
    public final float[] A0O;
    public final float[] A0P;

    /* loaded from: classes9.dex */
    public final class FitTransformParams implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C63475SlG(44);
        public float A02 = 0.0f;
        public float A00 = 0.0f;
        public float A01 = 0.0f;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeFloat(this.A02);
            parcel.writeFloat(this.A00);
            parcel.writeFloat(this.A01);
        }
    }

    /* loaded from: classes4.dex */
    public final class FullTransform implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C63475SlG(45);
        public float A06 = 1.0f;
        public float A00 = 1.0f;
        public float A01 = 0.0f;
        public float A02 = 0.0f;
        public float A03 = 0.0f;
        public float A04 = 0.0f;
        public float A05 = 0.0f;
        public int A07 = 0;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeFloat(this.A06);
            parcel.writeFloat(this.A00);
            parcel.writeFloat(this.A01);
            parcel.writeFloat(this.A02);
            parcel.writeFloat(this.A03);
            parcel.writeFloat(this.A04);
            parcel.writeFloat(this.A05);
            parcel.writeInt(this.A07);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform, java.lang.Object] */
        public final FullTransform A00() {
            float f = this.A06;
            float f2 = this.A00;
            float f3 = this.A01;
            float f4 = this.A02;
            float f5 = this.A03;
            float f6 = this.A04;
            float f7 = this.A05;
            int i = this.A07;
            ?? obj = new Object();
            obj.A06 = f;
            obj.A00 = f2;
            obj.A01 = f3;
            obj.A02 = f4;
            obj.A03 = f5;
            obj.A04 = f6;
            obj.A05 = f7;
            obj.A07 = i;
            return obj;
        }

        public final void A01(FullTransform fullTransform) {
            this.A06 = fullTransform.A06;
            this.A00 = fullTransform.A00;
            this.A01 = fullTransform.A01;
            this.A02 = fullTransform.A02;
            this.A03 = fullTransform.A03;
            this.A04 = fullTransform.A04;
            this.A05 = fullTransform.A05;
            this.A07 = fullTransform.A07;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A06.writeToParcel(parcel, i);
        parcel.writeInt(this.A0G ? 1 : 0);
        this.A0J.writeToParcel(parcel, i);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A03);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A0M, i);
        parcel.writeParcelable(this.A0N, i);
        this.A0K.writeToParcel(parcel, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeParcelable(this.A0H, i);
        this.A0I.writeToParcel(parcel, i);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeFloatArray(this.A0P);
        parcel.writeFloatArray(this.A0O);
        parcel.writeParcelable(this.A0L, i);
        parcel.writeInt(this.A0B ? 1 : 0);
    }

    /* loaded from: classes4.dex */
    public final class TransformSteps implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C63475SlG(46);
        public boolean A00;
        public boolean A01;
        public boolean A02;
        public boolean A03;
        public boolean A04;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeInt(this.A03 ? 1 : 0);
            parcel.writeInt(this.A00 ? 1 : 0);
            parcel.writeInt(this.A01 ? 1 : 0);
            parcel.writeInt(this.A02 ? 1 : 0);
            parcel.writeInt(this.A04 ? 1 : 0);
        }

        public TransformSteps(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.A03 = z;
            this.A00 = z2;
            this.A01 = z3;
            this.A02 = z4;
            this.A04 = z5;
        }

        public TransformSteps() {
            this(false, false, false, false, false);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams, java.lang.Object] */
    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        FullTransform A00 = this.A06.A00();
        boolean z = this.A0G;
        FullTransform A002 = this.A0J.A00();
        boolean z2 = this.A0E;
        boolean z3 = this.A0F;
        boolean z4 = this.A0A;
        int i = this.A03;
        Matrix4 matrix4 = new Matrix4(this.A07);
        Matrix4 matrix42 = new Matrix4(this.A0M);
        Matrix4 matrix43 = new Matrix4(this.A0N);
        TransformSteps transformSteps = this.A0K;
        TransformSteps transformSteps2 = new TransformSteps(transformSteps.A03, transformSteps.A00, transformSteps.A01, transformSteps.A02, transformSteps.A04);
        float f = this.A02;
        float f2 = this.A00;
        float f3 = this.A01;
        int i2 = this.A05;
        int i3 = this.A04;
        PointF pointF = this.A0H;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        FitTransformParams fitTransformParams = this.A0I;
        float f4 = fitTransformParams.A02;
        float f5 = fitTransformParams.A00;
        float f6 = fitTransformParams.A01;
        ?? obj = new Object();
        obj.A02 = f4;
        obj.A00 = f5;
        obj.A01 = f6;
        boolean z5 = this.A0D;
        boolean z6 = this.A0C;
        boolean z7 = this.A09;
        return new SurfaceCropFilterModel(pointF2, obj, A00, A002, transformSteps2, new TransformMatrixParams(this.A0L), matrix4, matrix42, matrix43, this.A08, AbstractC166997dE.A1a(this.A0P), AbstractC166997dE.A1a(this.A0O), f, f2, f3, i, i2, i3, z, z2, z3, z4, z5, z6, z7, this.A0B);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A0O;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return this.A08;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getTextureTransform() {
        return this.A0P;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A0L;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final boolean isEnabled() {
        return this.A0B;
    }

    public SurfaceCropFilterModel(PointF pointF, FitTransformParams fitTransformParams, FullTransform fullTransform, FullTransform fullTransform2, TransformSteps transformSteps, TransformMatrixParams transformMatrixParams, Matrix4 matrix4, Matrix4 matrix42, Matrix4 matrix43, String str, float[] fArr, float[] fArr2, float f, float f2, float f3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        AbstractC167017dG.A1Q(fullTransform, fullTransform2);
        AbstractC167007dF.A1J(matrix4, 8, matrix42);
        C14360o3.A0B(matrix43, 10);
        C14360o3.A0B(transformSteps, 11);
        C14360o3.A0B(pointF, 17);
        C14360o3.A0B(fitTransformParams, 18);
        C14360o3.A0B(str, 22);
        C14360o3.A0B(fArr, 23);
        C14360o3.A0B(fArr2, 24);
        C14360o3.A0B(transformMatrixParams, 25);
        this.A06 = fullTransform;
        this.A0G = z;
        this.A0J = fullTransform2;
        this.A0E = z2;
        this.A0F = z3;
        this.A0A = z4;
        this.A03 = i;
        this.A07 = matrix4;
        this.A0M = matrix42;
        this.A0N = matrix43;
        this.A0K = transformSteps;
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A05 = i2;
        this.A04 = i3;
        this.A0H = pointF;
        this.A0I = fitTransformParams;
        this.A0D = z5;
        this.A0C = z6;
        this.A09 = z7;
        this.A08 = str;
        this.A0P = fArr;
        this.A0O = fArr2;
        this.A0L = transformMatrixParams;
        this.A0B = z8;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A0B = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SurfaceCropFilterModel() {
        /*
            r31 = this;
            r15 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r0 = 0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform
            r4.<init>()
            r4.A06 = r15
            r4.A00 = r15
            r4.A01 = r14
            r4.A02 = r14
            r4.A03 = r14
            r4.A04 = r14
            r4.A05 = r14
            r4.A07 = r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r5 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform
            r5.<init>()
            r5.A06 = r15
            r5.A00 = r15
            r5.A01 = r14
            r5.A02 = r14
            r5.A03 = r14
            r5.A04 = r14
            r5.A05 = r14
            r5.A07 = r0
            r22 = 1
            com.facebook.common.math.matrix.Matrix4 r8 = new com.facebook.common.math.matrix.Matrix4
            r8.<init>()
            com.facebook.common.math.matrix.Matrix4 r9 = new com.facebook.common.math.matrix.Matrix4
            r9.<init>()
            com.facebook.common.math.matrix.Matrix4 r10 = new com.facebook.common.math.matrix.Matrix4
            r10.<init>()
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$TransformSteps r6 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$TransformSteps
            r16 = r6
            r17 = r0
            r18 = r0
            r19 = r0
            r20 = r0
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams r3 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams
            r3.<init>()
            r3.A02 = r14
            r3.A00 = r14
            r3.A01 = r14
            java.lang.String r11 = "surface_crop"
            float[] r12 = X.AbstractC199498rs.A00()
            float[] r13 = X.AbstractC199498rs.A00()
            java.lang.Integer r24 = X.C05F.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r7 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r23 = r7
            r25 = r24
            r26 = r15
            r27 = r14
            r28 = r14
            r29 = r14
            r30 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r1 = r31
            r16 = r15
            r23 = r0
            r24 = r0
            r25 = r0
            r26 = r0
            r27 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel.<init>():void");
    }
}
