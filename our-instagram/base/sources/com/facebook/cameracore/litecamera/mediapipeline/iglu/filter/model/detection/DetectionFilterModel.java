package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection;

import X.AbstractC167017dG;
import X.AbstractC199788sU;
import X.C14360o3;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.nio.FloatBuffer;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class DetectionFilterModel implements FilterModel, Parcelable {
    public final float[] contentTransform;
    public boolean isEnabled;
    public final float[] textureTransform;
    public final TransformMatrixParams transformMatrixParams;

    /* JADX WARN: Multi-variable type inference failed */
    public DetectionFilterModel() {
        this(null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public /* synthetic */ void copyContentTransform(float[] fArr) {
        AbstractC199788sU.A00(this, fArr);
    }

    public /* synthetic */ void copyTextureTransform(float[] fArr) {
        AbstractC199788sU.A01(this, fArr);
    }

    public /* synthetic */ void copyTransformMatrixParams(TransformMatrixParams transformMatrixParams) {
        C14360o3.A0B(transformMatrixParams, 1);
        this.transformMatrixParams.A00(transformMatrixParams);
    }

    public abstract Map getDetectionStatistics();

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public float[] getContentTransform() {
        return this.contentTransform;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public float[] getTextureTransform() {
        return this.textureTransform;
    }

    public /* synthetic */ FloatBuffer getTextureTransformBuffer() {
        FloatBuffer wrap = FloatBuffer.wrap(this.textureTransform);
        C14360o3.A07(wrap);
        return wrap;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public TransformMatrixParams getTransformMatrixParams() {
        return this.transformMatrixParams;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public boolean isEnabled() {
        return this.isEnabled;
    }

    public DetectionFilterModel(float[] fArr, float[] fArr2, boolean z, TransformMatrixParams transformMatrixParams) {
        AbstractC167017dG.A1P(fArr, fArr2);
        C14360o3.A0B(transformMatrixParams, 4);
        this.textureTransform = fArr;
        this.contentTransform = fArr2;
        this.isEnabled = z;
        this.transformMatrixParams = transformMatrixParams;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DetectionFilterModel(float[] r10, float[] r11, boolean r12, com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r9 = this;
            r1 = r13
            r0 = r14 & 1
            if (r0 == 0) goto L9
            float[] r10 = X.AbstractC199498rs.A00()
        L9:
            r0 = r14 & 2
            if (r0 == 0) goto L11
            float[] r11 = X.AbstractC199498rs.A00()
        L11:
            r0 = r14 & 4
            if (r0 == 0) goto L16
            r12 = 1
        L16:
            r0 = r14 & 8
            if (r0 == 0) goto L28
            java.lang.Integer r2 = X.C05F.A00
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L28:
            r9.<init>(r10, r11, r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection.DetectionFilterModel.<init>(float[], float[], boolean, com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
