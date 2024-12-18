package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.Arrays;

/* renamed from: X.Jx2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45073Jx2 extends C0T6 {
    public float A00;
    public Bitmap A01;
    public Bitmap A02;
    public Medium A03;
    public ExifImageData A04;
    public Boolean A05;
    public Float A06;
    public Float A07;
    public boolean A08;
    public float[] A09;
    public C5L6 A0A;
    public final GalleryItem A0B;

    public C45073Jx2(Bitmap bitmap, Bitmap bitmap2, Medium medium, GalleryItem galleryItem, C5L6 c5l6, ExifImageData exifImageData, Boolean bool, Float f, Float f2, float[] fArr, float f3, boolean z) {
        C14360o3.A0B(galleryItem, 1);
        this.A0B = galleryItem;
        this.A03 = medium;
        this.A08 = z;
        this.A00 = f3;
        this.A07 = f;
        this.A06 = f2;
        this.A05 = bool;
        this.A04 = exifImageData;
        this.A01 = bitmap;
        this.A02 = bitmap2;
        this.A09 = fArr;
        this.A0A = c5l6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r1.sameAs(r0) == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (java.util.Arrays.equals(r1, r0) != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r2 = 1
            if (r4 == r5) goto L8d
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = X.AbstractC43593JPy.A0o(r5)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r3 = 0
            if (r0 == 0) goto L7f
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewItemModel"
            X.C14360o3.A0C(r5, r0)
            X.Jx2 r5 = (X.C45073Jx2) r5
            com.instagram.common.gallery.model.GalleryItem r1 = r4.A0B
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A0B
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L7f
            boolean r1 = r4.A08
            boolean r0 = r5.A08
            if (r1 != r0) goto L7f
            float r1 = r4.A00
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L7f
            java.lang.Float r1 = r4.A07
            java.lang.Float r0 = r5.A07
            boolean r0 = X.C14360o3.A0J(r1, r0)
            if (r0 == 0) goto L7f
            java.lang.Float r1 = r4.A06
            java.lang.Float r0 = r5.A06
            boolean r0 = X.C14360o3.A0J(r1, r0)
            if (r0 == 0) goto L7f
            java.lang.Boolean r1 = r4.A05
            java.lang.Boolean r0 = r5.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L7f
            com.instagram.creation.photo.util.ExifImageData r1 = r4.A04
            com.instagram.creation.photo.util.ExifImageData r0 = r5.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L7f
            android.graphics.Bitmap r1 = r4.A01
            android.graphics.Bitmap r0 = r5.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L7f
            android.graphics.Bitmap r1 = r4.A02
            android.graphics.Bitmap r0 = r5.A02
            if (r1 == 0) goto L80
            if (r0 == 0) goto L7f
            boolean r0 = r1.sameAs(r0)
            if (r0 != r2) goto L7f
        L71:
            float[] r1 = r4.A09
            float[] r0 = r5.A09
            if (r1 == 0) goto L83
            if (r0 == 0) goto L7f
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L86
        L7f:
            return r3
        L80:
            if (r0 == 0) goto L71
            return r3
        L83:
            if (r0 == 0) goto L86
            return r3
        L86:
            X.5L6 r1 = r4.A0A
            X.5L6 r0 = r5.A0A
            if (r1 == r0) goto L8d
            return r3
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45073Jx2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int A00 = (((((((((((AbstractC166997dE.A00(AbstractC167007dF.A0D(this.A08, AbstractC166987dD.A0G(this.A0B)), this.A00) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31;
        float[] fArr = this.A09;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        } else {
            i = 0;
        }
        int i3 = (A00 + i) * 31;
        C5L6 c5l6 = this.A0A;
        if (c5l6 != null) {
            i2 = c5l6.hashCode();
        }
        return i3 + i2;
    }
}
