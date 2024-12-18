package X;

import com.instagram.creation.photo.crop.CropImageView;

/* renamed from: X.Ja8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43844Ja8 implements XEM {
    public boolean A00;
    public final /* synthetic */ CropImageView A01;

    @Override // X.XEM
    public final void Dma(float f, float f2) {
    }

    public C43844Ja8(CropImageView cropImageView) {
        this.A01 = cropImageView;
    }

    @Override // X.XEM
    public final void DJE(float f, float f2) {
        CropImageView cropImageView = this.A01;
        if (cropImageView.A05) {
            cropImageView.A0J(f, f2);
            this.A00 = false;
            MQU mqu = cropImageView.A03;
            if (mqu != null) {
                mqu.DJF(cropImageView);
            }
        }
    }

    @Override // X.XEM
    public final void DJI() {
        CropImageView cropImageView = this.A01;
        if (cropImageView.A05) {
            ((AbstractC43828JZr) cropImageView).A0E.A04.clear();
            cropImageView.A0M(false);
            MQU mqu = cropImageView.A03;
            if (mqu != null) {
                mqu.DJJ(cropImageView);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
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
            com.instagram.creation.photo.crop.CropImageView r2 = r4.A01
            boolean r0 = r2.A05
            if (r0 == 0) goto L36
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L10
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L11
        L10:
            r1 = 1
        L11:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L2e
            r1 = r1 ^ 1
            android.graphics.PointF r0 = r2.A01
            if (r0 != 0) goto L37
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r5, r6)
            r2.A01 = r0
        L24:
            android.graphics.Matrix r0 = r2.A08
            r0.postScale(r9, r9, r5, r6)
            if (r1 == 0) goto L2e
            X.AbstractC43828JZr.A01(r2)
        L2e:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L3b
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L3b
        L36:
            return
        L37:
            r0.set(r5, r6)
            goto L24
        L3b:
            android.graphics.Matrix r0 = r2.A08
            r0.postTranslate(r7, r8)
            X.AbstractC43828JZr.A01(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43844Ja8.DU9(float, float, float, float, float, float):void");
    }

    @Override // X.XEM
    public final void Dmp(float f, float f2, float f3, float f4) {
        CropImageView cropImageView = this.A01;
        if (cropImageView.A05) {
            if (f3 == 0.0f && f4 == 0.0f) {
                return;
            }
            ((AbstractC43828JZr) cropImageView).A08.postTranslate(f3, f4);
            AbstractC43828JZr.A01(cropImageView);
        }
    }

    @Override // X.XEM
    public final void Du1(boolean z) {
        CropImageView cropImageView = this.A01;
        if (cropImageView.A05) {
            if (z) {
                cropImageView.A0P(true, true);
                this.A00 = true;
            } else {
                if (!this.A00) {
                    return;
                }
                cropImageView.A0P(false, true);
            }
        }
    }
}
