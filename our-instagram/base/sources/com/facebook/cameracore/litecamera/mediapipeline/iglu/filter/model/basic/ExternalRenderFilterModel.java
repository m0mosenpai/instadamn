package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* loaded from: classes4.dex */
public final class ExternalRenderFilterModel implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C63475SlG(42);
    public boolean A00;
    public final TransformMatrixParams A01;
    public final String A02;
    public final String A03;
    public final float[] A04;
    public final float[] A05;

    public ExternalRenderFilterModel(TransformMatrixParams transformMatrixParams, String str, String str2, float[] fArr, float[] fArr2, boolean z) {
        AbstractC167027dH.A0a(1, str, str2, fArr, fArr2);
        C14360o3.A0B(transformMatrixParams, 6);
        this.A02 = str;
        this.A03 = str2;
        this.A05 = fArr;
        this.A04 = fArr2;
        this.A00 = z;
        this.A01 = transformMatrixParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeFloatArray(this.A05);
        parcel.writeFloatArray(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        return new ExternalRenderFilterModel(new TransformMatrixParams(this.A01), this.A02, this.A03, AbstractC166997dE.A1a(this.A05), AbstractC166997dE.A1a(this.A04), this.A00);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A04;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return this.A03;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getTextureTransform() {
        return this.A05;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A01;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final boolean isEnabled() {
        return this.A00;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A00 = z;
    }
}
