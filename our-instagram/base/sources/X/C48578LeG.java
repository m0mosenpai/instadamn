package X;

import com.instagram.creation.photo.crop.LayoutImageView;

/* renamed from: X.LeG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48578LeG implements XEM {
    public final int A00;
    public final Object A01;

    public C48578LeG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.XEM
    public final void DJE(float f, float f2) {
        if (this.A00 != 0) {
            LayoutImageView layoutImageView = (LayoutImageView) this.A01;
            MQV mqv = layoutImageView.A00;
            if (mqv != null) {
                mqv.DJD();
            }
            layoutImageView.A0J(0.0f, 0.0f);
            return;
        }
        ((MQV) this.A01).DJD();
    }

    @Override // X.XEM
    public final void DJI() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r8 != 0.0f) goto L8;
     */
    @Override // X.XEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DU9(float r5, float r6, float r7, float r8, float r9, float r10) {
        /*
            r4 = this;
            int r0 = r4.A00
            if (r0 == 0) goto L38
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto Le
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto Lf
        Le:
            r1 = 1
        Lf:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L30
            java.lang.Object r2 = r4.A01
            X.JZr r2 = (X.AbstractC43828JZr) r2
            r1 = r1 ^ 1
            android.graphics.PointF r0 = r2.A01
            if (r0 != 0) goto L39
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r5, r6)
            r2.A01 = r0
        L26:
            android.graphics.Matrix r0 = r2.A08
            r0.postScale(r9, r9, r5, r6)
            if (r1 == 0) goto L30
            X.AbstractC43828JZr.A01(r2)
        L30:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L3d
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L3d
        L38:
            return
        L39:
            r0.set(r5, r6)
            goto L26
        L3d:
            java.lang.Object r1 = r4.A01
            X.JZr r1 = (X.AbstractC43828JZr) r1
            android.graphics.Matrix r0 = r1.A08
            r0.postTranslate(r7, r8)
            X.AbstractC43828JZr.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48578LeG.DU9(float, float, float, float, float, float):void");
    }

    @Override // X.XEM
    public final void Du1(boolean z) {
    }

    @Override // X.XEM
    public final void Dma(float f, float f2) {
    }

    @Override // X.XEM
    public final void Dmp(float f, float f2, float f3, float f4) {
    }
}
