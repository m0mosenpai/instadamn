package com.instagram.creation.capture.gallery;

import X.AbstractC25235BEs;
import X.AbstractC31177DnL;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class GalleryPreviewInfo implements Parcelable {
    public static final LNM CREATOR = LNM.A00(42);
    public float[] A03 = null;
    public String A02 = null;
    public CropInfo A00 = null;
    public ExifImageData A01 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (java.util.Arrays.equals(r1, r0) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L3f
            boolean r0 = r5 instanceof com.instagram.creation.capture.gallery.GalleryPreviewInfo
            if (r0 == 0) goto L3d
            com.instagram.creation.capture.gallery.GalleryPreviewInfo r5 = (com.instagram.creation.capture.gallery.GalleryPreviewInfo) r5
        L9:
            r2 = 0
            if (r5 == 0) goto L1a
            float[] r1 = r4.A03
            float[] r0 = r5.A03
            if (r1 == 0) goto L1b
            if (r0 == 0) goto L1a
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L1e
        L1a:
            return r2
        L1b:
            if (r0 == 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L1a
            com.instagram.creation.base.CropInfo r1 = r4.A00
            com.instagram.creation.base.CropInfo r0 = r5.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L1a
            com.instagram.creation.photo.util.ExifImageData r1 = r4.A01
            com.instagram.creation.photo.util.ExifImageData r0 = r5.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L3f
            return r2
        L3d:
            r5 = 0
            goto L9
        L3f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.gallery.GalleryPreviewInfo.equals(java.lang.Object):boolean");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloatArray(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        int i;
        float[] fArr = this.A03;
        int i2 = 0;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        } else {
            i = 0;
        }
        int A04 = ((((i * 31) + AbstractC31177DnL.A04(this.A02)) * 31) + AbstractC25235BEs.A06(this.A00)) * 31;
        ExifImageData exifImageData = this.A01;
        if (exifImageData != null) {
            i2 = exifImageData.hashCode();
        }
        return A04 + i2;
    }
}
