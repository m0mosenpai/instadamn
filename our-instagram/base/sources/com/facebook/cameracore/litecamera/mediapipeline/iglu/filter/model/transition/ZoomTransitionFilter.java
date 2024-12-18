package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* loaded from: classes4.dex */
public final class ZoomTransitionFilter implements TransitionFilter {
    public static final Parcelable.Creator CREATOR = new C63475SlG(65);
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public final TransformMatrixParams A04;
    public final float[] A05;
    public final float[] A06;

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
        parcel.writeFloatArray(this.A06);
        parcel.writeFloatArray(this.A05);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter
    public final float CAb() {
        return this.A02;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        ZoomTransitionFilter zoomTransitionFilter = new ZoomTransitionFilter(new TransformMatrixParams(this.A04), AbstractC166997dE.A1a(this.A06), AbstractC166997dE.A1a(this.A05), 0.0f, 16.0f, 1.0f, true);
        zoomTransitionFilter.A02 = zoomTransitionFilter.A02;
        zoomTransitionFilter.A00 = zoomTransitionFilter.A00;
        zoomTransitionFilter.A01 = zoomTransitionFilter.A01;
        zoomTransitionFilter.A03 = zoomTransitionFilter.A03;
        return zoomTransitionFilter;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A05;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return "zoom_transition";
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getTextureTransform() {
        return this.A06;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A04;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final boolean isEnabled() {
        return this.A03;
    }

    public ZoomTransitionFilter(TransformMatrixParams transformMatrixParams, float[] fArr, float[] fArr2, float f, float f2, float f3, boolean z) {
        AbstractC167017dG.A1S(fArr, fArr2);
        C14360o3.A0B(transformMatrixParams, 7);
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A06 = fArr;
        this.A05 = fArr2;
        this.A03 = z;
        this.A04 = transformMatrixParams;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter
    public final void EgD(float f) {
        this.A02 = f;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A03 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ZoomTransitionFilter() {
        /*
            r14 = this;
            r4 = 0
            r11 = 1098907648(0x41800000, float:16.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            float[] r8 = X.AbstractC199498rs.A00()
            float[] r9 = X.AbstractC199498rs.A00()
            r13 = 1
            r7 = 0
            java.lang.Integer r1 = X.C05F.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r2 = r1
            r5 = r4
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r6 = r14
            r7 = r0
            r10 = r4
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter.<init>():void");
    }
}
