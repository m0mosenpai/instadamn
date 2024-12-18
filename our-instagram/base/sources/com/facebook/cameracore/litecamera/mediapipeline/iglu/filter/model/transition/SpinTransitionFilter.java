package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition;

import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class SpinTransitionFilter implements TransitionFilter {
    public static final Parcelable.Creator CREATOR = new C63475SlG(61);
    public float A00;
    public boolean A01;
    public final TransformMatrixParams A02;
    public final float[] A03;
    public final float[] A04;

    public SpinTransitionFilter(TransformMatrixParams transformMatrixParams, float[] fArr, float[] fArr2, float f, boolean z) {
        C14360o3.A0B(fArr, 2);
        C14360o3.A0B(fArr2, 3);
        C14360o3.A0B(transformMatrixParams, 5);
        this.A00 = f;
        this.A04 = fArr;
        this.A03 = fArr2;
        this.A01 = z;
        this.A02 = transformMatrixParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A00);
        parcel.writeFloatArray(this.A04);
        parcel.writeFloatArray(this.A03);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter
    public final float CAb() {
        return this.A00;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        float[] fArr = this.A04;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C14360o3.A07(copyOf);
        float[] fArr2 = this.A03;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        C14360o3.A07(copyOf2);
        SpinTransitionFilter spinTransitionFilter = new SpinTransitionFilter(new TransformMatrixParams(this.A02), copyOf, copyOf2, 0.0f, true);
        spinTransitionFilter.A00 = spinTransitionFilter.A00;
        spinTransitionFilter.A01 = spinTransitionFilter.A01;
        return spinTransitionFilter;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A03;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return "spin_transition";
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getTextureTransform() {
        return this.A04;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A02;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final boolean isEnabled() {
        return this.A01;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter
    public final void EgD(float f) {
        this.A00 = f;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A01 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SpinTransitionFilter() {
        /*
            r12 = this;
            r4 = 0
            float[] r8 = X.AbstractC199498rs.A00()
            float[] r9 = X.AbstractC199498rs.A00()
            r11 = 1
            r7 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r1 = X.C05F.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r2 = r1
            r5 = r4
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r6 = r12
            r7 = r0
            r10 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter.<init>():void");
    }
}
