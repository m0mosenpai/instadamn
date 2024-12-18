package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model;

import X.AHK;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* loaded from: classes4.dex */
public final class ValueMapFilterModel implements FilterModel {
    public static final AHK A06 = new Object();
    public static final Parcelable.Creator CREATOR = new C63475SlG(39);
    public boolean A00;
    public final TypedParameterMap A01;
    public final TransformMatrixParams A02;
    public final String A03;
    public final float[] A04;
    public final float[] A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeFloatArray(this.A05);
        parcel.writeFloatArray(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        this.A01.writeToParcel(parcel, i);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        String str = this.A03;
        float[] A1a = AbstractC166997dE.A1a(this.A05);
        float[] A1a2 = AbstractC166997dE.A1a(this.A04);
        boolean z = this.A00;
        return new ValueMapFilterModel(this.A01.A00(), new TransformMatrixParams(this.A02), str, A1a, A1a2, z);
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
        return this.A02;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final boolean isEnabled() {
        return this.A00;
    }

    public ValueMapFilterModel(TypedParameterMap typedParameterMap, TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, boolean z) {
        this.A03 = str;
        this.A05 = fArr;
        this.A04 = fArr2;
        this.A00 = z;
        this.A02 = transformMatrixParams;
        this.A01 = typedParameterMap;
    }

    public final void A00(String str, float f) {
        this.A01.A02.put(str, Float.valueOf(f));
    }

    public final void A01(String str, int i) {
        this.A01.A03.put(str, Integer.valueOf(i));
    }

    public final void A02(String str, boolean z) {
        this.A01.A00.put(str, Boolean.valueOf(z));
    }

    public final void A03(String str, float[] fArr) {
        AbstractC167017dG.A1N(str, fArr);
        this.A01.A01.put(str, AbstractC166997dE.A1a(fArr));
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A00 = z;
    }
}
