package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC199498rs;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* loaded from: classes4.dex */
public final class WarpTransitionFilter implements TransitionFilter {
    public static final Parcelable.Creator CREATOR = new C63475SlG(64);
    public float A00;
    public boolean A01;
    public final TransformMatrixParams A02;
    public final float[] A03;
    public final float[] A04;

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
        WarpTransitionFilter warpTransitionFilter = new WarpTransitionFilter(new TransformMatrixParams(this.A02), AbstractC166997dE.A1a(this.A04), AbstractC166997dE.A1a(this.A03), 0.0f, true);
        warpTransitionFilter.A00 = warpTransitionFilter.A00;
        warpTransitionFilter.A01 = warpTransitionFilter.A01;
        return warpTransitionFilter;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A03;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return "warp_transition";
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

    public WarpTransitionFilter(TransformMatrixParams transformMatrixParams, float[] fArr, float[] fArr2, float f, boolean z) {
        AbstractC167017dG.A1R(fArr, fArr2);
        C14360o3.A0B(transformMatrixParams, 5);
        this.A00 = f;
        this.A04 = fArr;
        this.A03 = fArr2;
        this.A01 = z;
        this.A02 = transformMatrixParams;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter
    public final void EgD(float f) {
        this.A00 = f;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A01 = z;
    }

    public WarpTransitionFilter() {
        this(AbstractC167027dH.A0E(), AbstractC199498rs.A00(), AbstractC199498rs.A00(), 0.0f, true);
    }
}
