package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic;

import X.C14360o3;
import X.C206149Aw;
import X.C9M3;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class FilterChain implements FilterModel {
    public static final Parcelable.Creator CREATOR = new C206149Aw(9);
    public boolean A00;
    public final SparseArray A01;
    public final SparseArray A02;
    public final TransformMatrixParams A03;
    public final String A04;
    public final float[] A05;
    public final float[] A06;

    public FilterChain(SparseArray sparseArray, SparseArray sparseArray2, TransformMatrixParams transformMatrixParams, String str, float[] fArr, float[] fArr2, boolean z) {
        C14360o3.A0B(sparseArray2, 2);
        C14360o3.A0B(str, 3);
        C14360o3.A0B(fArr, 5);
        C14360o3.A0B(fArr2, 6);
        C14360o3.A0B(transformMatrixParams, 7);
        this.A01 = sparseArray;
        this.A02 = sparseArray2;
        this.A04 = str;
        this.A00 = z;
        this.A06 = fArr;
        this.A05 = fArr2;
        this.A03 = transformMatrixParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        String str;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain");
                FilterChain filterChain = (FilterChain) obj;
                SparseArray sparseArray = this.A01;
                int size = sparseArray.size();
                SparseArray sparseArray2 = filterChain.A01;
                if (size == sparseArray2.size() && C14360o3.A0K(this.A02, filterChain.A02) && C14360o3.A0K(this.A04, filterChain.A04) && this.A00 == filterChain.A00) {
                    int size2 = sparseArray.size();
                    for (int i = 0; i < size2; i++) {
                        int keyAt = sparseArray.keyAt(i);
                        String filterName = ((FilterModel) sparseArray.valueAt(i)).getFilterName();
                        FilterModel filterModel = (FilterModel) sparseArray2.get(keyAt);
                        if (filterModel != null) {
                            str = filterModel.getFilterName();
                        } else {
                            str = null;
                        }
                        if (C14360o3.A0K(filterName, str)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        SparseArray sparseArray = this.A01;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 != size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeParcelable((Parcelable) sparseArray.valueAt(i2), i);
        }
        SparseArray sparseArray2 = this.A02;
        int size2 = sparseArray2.size();
        parcel.writeInt(size2);
        for (int i3 = 0; i3 != size2; i3++) {
            parcel.writeInt(sparseArray2.keyAt(i3));
            parcel.writeParcelable((Parcelable) sparseArray2.valueAt(i3), i);
        }
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeFloatArray(this.A06);
        parcel.writeFloatArray(this.A05);
        parcel.writeParcelable(this.A03, i);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FilterChain deepCopy() {
        SparseArray A00 = C9M3.A00(this.A01);
        SparseArray sparseArray = this.A02;
        C14360o3.A0B(sparseArray, 0);
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        String str = this.A04;
        boolean z = this.A00;
        float[] fArr = this.A06;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C14360o3.A07(copyOf);
        float[] fArr2 = this.A05;
        float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
        C14360o3.A07(copyOf2);
        return new FilterChain(A00, sparseArray2, new TransformMatrixParams(this.A03), str, copyOf, copyOf2, z);
    }

    public final void A01(FilterModel filterModel, int i) {
        SparseArray sparseArray = this.A01;
        if (filterModel == null) {
            sparseArray.remove(i);
            this.A02.remove(i);
        } else {
            sparseArray.put(i, filterModel);
        }
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getContentTransform() {
        return this.A05;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final String getFilterName() {
        return this.A04;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final float[] getTextureTransform() {
        return this.A06;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A03;
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
    public FilterChain() {
        /*
            r15 = this;
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
            android.util.SparseArray r9 = new android.util.SparseArray
            r9.<init>()
            java.lang.String r11 = "filter_chain"
            r14 = 1
            float[] r12 = X.AbstractC199498rs.A00()
            float[] r13 = X.AbstractC199498rs.A00()
            r7 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            java.lang.Integer r1 = X.C05F.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r2 = r1
            r5 = r4
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r7 = r15
            r10 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain.<init>():void");
    }
}
