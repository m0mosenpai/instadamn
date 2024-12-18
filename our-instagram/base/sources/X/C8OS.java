package X;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: X.8OS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OS extends C0T6 {
    public final Bitmap A00;
    public final Bitmap A01;
    public final Bitmap A02;
    public final C45112Jxh A03;
    public final C8OT A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final float[] A08;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (java.util.Arrays.equals(r1, r0) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L69
            java.lang.Class r1 = r4.getClass()
            if (r5 == 0) goto L67
            java.lang.Class r0 = r5.getClass()
        Ld:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r2 = 0
            if (r0 == 0) goto L3c
            boolean r0 = r5 instanceof X.C8OS
            if (r0 == 0) goto L3c
            android.graphics.Bitmap r1 = r4.A02
            X.8OS r5 = (X.C8OS) r5
            android.graphics.Bitmap r0 = r5.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L3c
            android.graphics.Bitmap r1 = r4.A00
            android.graphics.Bitmap r0 = r5.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L3c
            float[] r1 = r4.A08
            float[] r0 = r5.A08
            if (r1 == 0) goto L3d
            if (r0 == 0) goto L3c
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L40
        L3c:
            return r2
        L3d:
            if (r0 == 0) goto L40
            return r2
        L40:
            android.graphics.Bitmap r1 = r4.A01
            android.graphics.Bitmap r0 = r5.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L3c
            java.lang.Integer r1 = r4.A05
            java.lang.Integer r0 = r5.A05
            if (r1 != r0) goto L3c
            boolean r1 = r4.A07
            boolean r0 = r5.A07
            if (r1 != r0) goto L3c
            boolean r1 = r4.A06
            boolean r0 = r5.A06
            if (r1 != r0) goto L3c
            X.Jxh r1 = r4.A03
            X.Jxh r0 = r5.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L69
            return r2
        L67:
            r0 = 0
            goto Ld
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8OS.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        Bitmap bitmap = this.A02;
        int i6 = 0;
        if (bitmap != null) {
            i = bitmap.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        Bitmap bitmap2 = this.A00;
        if (bitmap2 != null) {
            i2 = bitmap2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        float[] fArr = this.A08;
        if (fArr != null) {
            i3 = Arrays.hashCode(fArr);
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        Bitmap bitmap3 = this.A01;
        if (bitmap3 != null) {
            i4 = bitmap3.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        Integer num = this.A05;
        if (num != null) {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "AUTO_SEGMENTATION_SUCCEED";
                    break;
                case 2:
                    str = "AUTO_SEGMENTATION_FAILED";
                    break;
                case 3:
                    str = "MANUAL_REFINEMENT_INITIAL";
                    break;
                case 4:
                    str = "MANUAL_REFINEMENT_LOADING";
                    break;
                case 5:
                    str = "MANUAL_REFINEMENT_FINISHED";
                    break;
                case 6:
                    str = "VIDEO_FIRST_FRAME_EXTRACTION_FAILED";
                    break;
                case 7:
                    str = "VIDEO_STICKER_CREATING";
                    break;
                case 8:
                    str = "VIDEO_STICKER_CREATION_FAILED";
                    break;
                case 9:
                    str = "VIDEO_STICKER_CREATION_SUCCEED";
                    break;
                default:
                    str = "AUTO_SEGMENTATION_LOADING";
                    break;
            }
            i5 = str.hashCode() + intValue;
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        int i12 = 1237;
        if (this.A07) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A06) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        C45112Jxh c45112Jxh = this.A03;
        if (c45112Jxh != null) {
            i6 = c45112Jxh.hashCode();
        }
        return i15 + i6;
    }

    public C8OS(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, C45112Jxh c45112Jxh, C8OT c8ot, Integer num, float[] fArr, boolean z, boolean z2) {
        this.A02 = bitmap;
        this.A00 = bitmap2;
        this.A08 = fArr;
        this.A01 = bitmap3;
        this.A05 = num;
        this.A07 = z;
        this.A06 = z2;
        this.A03 = c45112Jxh;
        this.A04 = c8ot;
    }
}
