package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap;

import X.C05F;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class GainmapAlphaFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C63475SlG(47);
    public boolean A00;
    public final String A01;
    public final float[] A02;
    public final float[] A03;
    public final TransformMatrixParams A04;

    public GainmapAlphaFilter(TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(fArr, 2);
        C14360o3.A0B(fArr2, 3);
        C14360o3.A0B(transformMatrixParams, 5);
        this.A01 = str;
        this.A03 = fArr;
        this.A02 = fArr2;
        this.A00 = z;
        this.A04 = transformMatrixParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeFloatArray(this.A03);
        parcel.writeFloatArray(this.A02);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        String str = this.A01;
        float[] fArr = this.A03;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C14360o3.A07(copyOf);
        float[] fArr2 = this.A02;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        C14360o3.A07(copyOf2);
        Integer num = C05F.A00;
        return new GainmapAlphaFilter(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), str, copyOf, copyOf2, true);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A02;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return this.A01;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getTextureTransform() {
        return this.A03;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A04;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final boolean isEnabled() {
        return this.A00;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GainmapAlphaFilter() {
        /*
            r12 = this;
            java.lang.String r8 = "gainmap_alpha"
            float[] r9 = X.AbstractC199498rs.A00()
            float[] r10 = X.AbstractC199498rs.A00()
            r11 = 1
            r7 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            java.lang.Integer r1 = X.C05F.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r2 = r1
            r5 = r4
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r6 = r12
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter.<init>():void");
    }
}
