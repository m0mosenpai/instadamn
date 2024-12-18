package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.AnonymousClass001;
import X.C0K8;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class SplitScreenFilter implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C206149Aw(12);
    public float A00;
    public FilterModel A01;
    public FilterModel A02;
    public FilterModel A03;
    public FilterModel A04;
    public boolean A05;
    public final TransformMatrixParams A06;
    public final String A07;
    public final float[] A08;
    public final float[] A09;

    public SplitScreenFilter(FilterModel filterModel, FilterModel filterModel2, TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, float f, boolean z) {
        C14360o3.A0B(str, 4);
        C14360o3.A0B(fArr, 5);
        C14360o3.A0B(fArr2, 6);
        C14360o3.A0B(transformMatrixParams, 8);
        this.A00 = f;
        this.A02 = filterModel;
        this.A04 = filterModel2;
        this.A07 = str;
        this.A09 = fArr;
        this.A08 = fArr2;
        this.A05 = z;
        this.A06 = transformMatrixParams;
        this.A01 = filterModel;
        this.A03 = filterModel2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A07);
        parcel.writeFloatArray(this.A09);
        parcel.writeFloatArray(this.A08);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeParcelable(this.A06, i);
    }

    public final FilterModel A00() {
        FilterModel filterModel;
        float f = this.A00;
        boolean z = false;
        if (f > 0.0f) {
            z = true;
        }
        boolean z2 = false;
        if (f < 1.0f) {
            z2 = true;
        }
        if (z != z2) {
            C0K8.A0C("SplitScreenFilter", AnonymousClass001.A0N("One and only one filter must be visible, split=", f));
        }
        if (this.A00 > 0.5f) {
            filterModel = this.A01;
        } else {
            filterModel = this.A03;
        }
        C14360o3.A0A(filterModel);
        return filterModel;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        FilterModel filterModel;
        float f = this.A00;
        FilterModel filterModel2 = this.A01;
        FilterModel filterModel3 = null;
        if (filterModel2 != null) {
            filterModel = filterModel2.deepCopy();
        } else {
            filterModel = null;
        }
        FilterModel filterModel4 = this.A03;
        if (filterModel4 != null) {
            filterModel3 = filterModel4.deepCopy();
        }
        String str = this.A07;
        float[] fArr = this.A09;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C14360o3.A07(copyOf);
        float[] fArr2 = this.A08;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        C14360o3.A07(copyOf2);
        return new SplitScreenFilter(filterModel, filterModel3, new TransformMatrixParams(this.A06), str, copyOf, copyOf2, f, this.A05);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A08;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return this.A07;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getTextureTransform() {
        return this.A09;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A06;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final boolean isEnabled() {
        return this.A05;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final void setEnabled(boolean z) {
        this.A05 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SplitScreenFilter() {
        /*
            r17 = this;
            r1 = 0
            r7 = 0
            java.lang.String r4 = "split_screen"
            float[] r5 = X.AbstractC199498rs.A00()
            float[] r6 = X.AbstractC199498rs.A00()
            r8 = 1
            r16 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r10 = X.C05F.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r3 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r9 = r3
            r11 = r10
            r13 = r7
            r14 = r7
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0 = r17
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter.<init>():void");
    }
}
