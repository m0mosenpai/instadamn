package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class DataDrivenFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C63475SlG(40);
    public String A00;
    public boolean A01;
    public final TransformMatrixParams A02;
    public final String A03;
    public final HashMap A04;
    public final float[] A05;
    public final float[] A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        HashMap hashMap = this.A04;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                parcel.writeValue(AbstractC167027dH.A0O(parcel, A14));
            }
        }
        parcel.writeFloatArray(this.A06);
        parcel.writeFloatArray(this.A05);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        return new DataDrivenFilter(new TransformMatrixParams(this.A02), this.A03, this.A00, this.A04, AbstractC166997dE.A1a(this.A06), AbstractC166997dE.A1a(this.A05), this.A01);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A05;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return this.A03;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getTextureTransform() {
        return this.A06;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A02;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final boolean isEnabled() {
        return this.A01;
    }

    public DataDrivenFilter(TransformMatrixParams transformMatrixParams, String str, String str2, HashMap hashMap, float[] fArr, float[] fArr2, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        AbstractC167017dG.A1S(fArr, fArr2);
        C14360o3.A0B(transformMatrixParams, 7);
        this.A03 = str;
        this.A00 = str2;
        this.A04 = hashMap;
        this.A06 = fArr;
        this.A05 = fArr2;
        this.A01 = z;
        this.A02 = transformMatrixParams;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A01 = z;
    }
}
