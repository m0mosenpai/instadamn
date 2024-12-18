package X;

import android.graphics.Matrix;

/* renamed from: X.4aC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97744aC {
    public static final float A00(Matrix matrix, float f, float f2, int i, int i2) {
        if (f2 < f) {
            float f3 = f2 / f;
            matrix.setScale(1.0f, f3, i / 2.0f, i2 / 2.0f);
            return f3;
        }
        float f4 = f / f2;
        matrix.setScale(f4, 1.0f, i / 2.0f, i2 / 2.0f);
        return f4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.view.TextureView r13, X.EnumC95184Qe r14, X.InterfaceC57807PkZ r15, float r16, float r17, float r18, int r19, int r20) {
        /*
            int r8 = r13.getWidth()
            int r7 = r13.getHeight()
            r10 = r19
            float r6 = (float) r10
            r9 = r20
            float r5 = (float) r9
            float r4 = r6 / r5
            float r3 = (float) r8
            float r2 = (float) r7
            float r1 = r3 / r2
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r14 == 0) goto L24
            int r12 = r14.ordinal()
            r11 = 1073741824(0x40000000, float:2.0)
            switch(r12) {
                case 0: goto L96;
                case 1: goto L88;
                case 2: goto L65;
                case 3: goto L4f;
                case 4: goto L30;
                case 5: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.String r1 = "Incorrect VideoScaleType state"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L2c:
            A00(r0, r4, r1, r8, r7)
            goto La4
        L30:
            float r1 = A00(r0, r4, r1, r8, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 / r1
            float r1 = r3 / r11
            float r2 = r2 / r11
            r0.postScale(r4, r4, r1, r2)
            float r3 = r3 / r6
            float r3 = r3 * r5
            float r1 = r3 / r11
            float r1 = r1 - r2
            r2 = 0
            r0.postTranslate(r2, r1)
            float r3 = r3 * r18
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r1
            r0.postTranslate(r2, r3)
            goto La4
        L4f:
            float r1 = A00(r0, r4, r1, r8, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 / r1
            float r1 = r3 / r11
            float r2 = r2 / r11
            r0.postScale(r4, r4, r1, r2)
            float r3 = r3 / r6
            float r3 = r3 * r5
            float r3 = r3 / r11
            float r3 = r3 - r2
            r1 = 0
            r0.postTranslate(r1, r3)
            goto La4
        L65:
            A00(r0, r4, r1, r8, r7)
            if (r10 >= r9) goto L78
            int r1 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r1 >= 0) goto L78
            float r1 = r16 / r4
            float r3 = r3 / r11
            float r2 = r2 / r11
            r0.postScale(r1, r1, r3, r2)
            r4 = r16
            goto L99
        L78:
            if (r10 <= r9) goto L99
            int r1 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r1 <= 0) goto L99
            float r4 = r4 / r17
            float r3 = r3 / r11
            float r2 = r2 / r11
            r0.postScale(r4, r4, r3, r2)
            r4 = r17
            goto L99
        L88:
            float r1 = A00(r0, r4, r1, r8, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r4 / r1
            float r3 = r3 / r11
            float r2 = r2 / r11
            r0.postScale(r1, r1, r3, r2)
            goto L99
        L96:
            A00(r0, r4, r1, r8, r7)
        L99:
            if (r15 == 0) goto La4
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r15 = (com.instagram.common.ui.widget.videopreviewview.VideoPreviewView) r15
            X.Pql r1 = r15.A03
            if (r1 == 0) goto La4
            r1.Dac(r15, r4)
        La4:
            r13.setTransform(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97744aC.A01(android.view.TextureView, X.4Qe, X.PkZ, float, float, float, int, int):void");
    }
}
