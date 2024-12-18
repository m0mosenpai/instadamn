package X;

import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes11.dex */
public abstract class UMM extends AbstractC66312U8l {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public int[] A08;
    public int[] A09;
    public boolean[] A0A;
    public final int A0B;
    public final Drawable[] A0C;

    public static void A00(UMM umm) {
        umm.A03 = 2;
        int[] iArr = umm.A09;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        int[] iArr2 = umm.A08;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        boolean[] zArr = umm.A0A;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    private boolean A01(float f) {
        boolean z = true;
        for (int i = 0; i < this.A0C.length; i++) {
            boolean z2 = this.A0A[i];
            int i2 = -1;
            if (z2) {
                i2 = 1;
            }
            int[] iArr = this.A08;
            int i3 = (int) (this.A09[i] + (i2 * 255 * f));
            iArr[i] = i3;
            if (i3 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            int i4 = iArr[i];
            if (z2) {
                if (i4 >= 255) {
                }
                z = false;
            } else {
                if (i4 <= 0) {
                }
                z = false;
            }
        }
        return z;
    }

    public final void EZQ(boolean z) {
        this.A06 = true;
    }

    public final void A04(int i) {
        this.A0A[i] = true;
        this.A08[i] = 255;
        if (i == this.A0B) {
            this.A07 = true;
        }
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[EDGE_INSN: B:22:0x008f->B:23:0x008f BREAK  A[LOOP:0: B:9:0x0026->B:19:0x005d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            int r0 = r7.A03
            r6 = 2
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L60
            if (r0 != r4) goto L26
            int r4 = r7.A01
            boolean r0 = X.AbstractC167007dF.A1O(r4)
            X.C0Hf.A01(r0)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r0 = r7.A04
            long r2 = r2 - r0
            float r1 = (float) r2
            float r0 = (float) r4
            float r1 = r1 / r0
            boolean r3 = r7.A01(r1)
        L20:
            if (r3 != 0) goto L23
            r6 = 1
        L23:
            r7.A03 = r6
            r4 = r3
        L26:
            android.graphics.drawable.Drawable[] r1 = r7.A0C
            int r0 = r1.length
            if (r5 >= r0) goto L8f
            r6 = r1[r5]
            int[] r0 = r7.A08
            r1 = r0[r5]
            int r0 = r7.A00
            int r1 = r1 * r0
            double r0 = (double) r1
            r2 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 / r2
            double r2 = java.lang.Math.ceil(r0)
            int r1 = (int) r2
            if (r6 == 0) goto L5d
            if (r1 <= 0) goto L5d
            int r0 = r7.A02
            int r0 = r0 + 1
            r7.A02 = r0
            boolean r0 = r7.A06
            if (r0 == 0) goto L51
            r6.mutate()
        L51:
            r6.setAlpha(r1)
            int r0 = r7.A02
            int r0 = r0 + (-1)
            r7.A02 = r0
            r6.draw(r8)
        L5d:
            int r5 = r5 + 1
            goto L26
        L60:
            int[] r2 = r7.A08
            int[] r1 = r7.A09
            android.graphics.drawable.Drawable[] r0 = r7.A0C
            int r0 = r0.length
            java.lang.System.arraycopy(r2, r5, r1, r5, r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            r7.A04 = r0
            int r1 = r7.A01
            r0 = 0
            if (r1 != 0) goto L77
            r0 = 1065353216(0x3f800000, float:1.0)
        L77:
            boolean r3 = r7.A01(r0)
            boolean r0 = r7.A05
            if (r0 != 0) goto L20
            int r2 = r7.A0B
            if (r2 < 0) goto L20
            boolean[] r1 = r7.A0A
            int r0 = r1.length
            if (r2 >= r0) goto L20
            boolean r0 = r1[r2]
            if (r0 == 0) goto L20
            r7.A05 = r4
            goto L20
        L8f:
            if (r4 == 0) goto Lad
            boolean r0 = r7.A05
            if (r0 == 0) goto L98
            r0 = 0
            r7.A05 = r0
        L98:
            boolean r0 = r7.A07
            if (r0 == 0) goto Lac
            int r1 = r7.A03
            r0 = 2
            if (r1 != r0) goto Lac
            boolean[] r1 = r7.A0A
            int r0 = r7.A0B
            boolean r0 = r1[r0]
            if (r0 == 0) goto Lac
            r0 = 0
            r7.A07 = r0
        Lac:
            return
        Lad:
            r7.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UMM.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.A02 == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            invalidateSelf();
        }
    }

    public UMM(Drawable[] drawableArr, int i) {
        super(drawableArr);
        this.A06 = true;
        int length = drawableArr.length;
        this.A0C = drawableArr;
        this.A09 = new int[length];
        this.A08 = new int[length];
        this.A00 = 255;
        this.A0A = new boolean[length];
        this.A02 = 0;
        this.A0B = i;
        A00(this);
    }
}
