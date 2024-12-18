package com.instagram.genai.imageutils;

import X.AbstractC001800i;
import X.AbstractC167007dF;
import X.AbstractC43592JPx;
import X.AnonymousClass194;
import X.C0eB;
import X.C12L;
import X.C14360o3;
import X.C17s;
import X.C17u;
import X.C1JX;
import X.C57561PgZ;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.MCB;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import com.facebook.systrace.Systrace;

/* loaded from: classes9.dex */
public abstract class MaskUtilsKt {
    public static final int A01 = Color.argb(255, 0, 0, 0);
    public static final int A00 = Color.argb(0, 0, 0, 0);

    public static final int A00(Bitmap bitmap, PointF pointF) {
        AbstractC167007dF.A1K(bitmap, pointF);
        return bitmap.getPixel(C17s.A03((int) (pointF.x * bitmap.getWidth()), 0, bitmap.getWidth() - 1), C17s.A03((int) (pointF.y * bitmap.getHeight()), 0, bitmap.getHeight() - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 != 1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Ds] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(android.graphics.Bitmap r14, android.graphics.Bitmap r15, android.graphics.PointF r16, X.InterfaceC23621Ds r17) {
        /*
            r6 = 1
            r3 = r17
            boolean r0 = r3 instanceof X.PWU
            if (r0 == 0) goto Lf
            r0 = r3
            X.PWU r0 = (X.PWU) r0
            int r1 = r0.A08
            r0 = 1
            if (r1 == r6) goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L3b
            r5 = r3
            X.PWU r5 = (X.PWU) r5
            int r2 = r5.A03
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r5.A03 = r2
        L20:
            java.lang.Object r7 = r5.A06
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A03
            if (r0 == 0) goto L46
            if (r0 != r6) goto L41
            int r11 = r5.A02
            int r12 = r5.A01
            int r1 = r5.A00
            boolean r2 = r5.A07
            java.lang.Object r10 = r5.A05
            int[] r10 = (int[]) r10
            java.lang.Object r3 = r5.A04
            java.lang.String r3 = (java.lang.String) r3
            goto L9b
        L3b:
            X.PWU r5 = new X.PWU
            r5.<init>(r6, r3)
            goto L20
        L41:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L46:
            X.AbstractC09560e7.A00(r7)
            java.lang.String r3 = "updatePixelsAfterEverythingMaskToggle"
            boolean r2 = A0E()
            int r1 = X.MSW.A01()
            if (r2 == 0) goto L58
            X.AbstractC13090lv.A03(r3, r1)
        L58:
            int r12 = r14.getWidth()     // Catch: java.lang.Throwable -> La8
            int r11 = r14.getHeight()     // Catch: java.lang.Throwable -> La8
            int[] r10 = A0F(r14)     // Catch: java.lang.Throwable -> La8
            int[] r9 = A0F(r15)     // Catch: java.lang.Throwable -> La8
            r0 = r16
            int r13 = A00(r15, r0)     // Catch: java.lang.Throwable -> La8
            int r8 = A00(r14, r0)     // Catch: java.lang.Throwable -> La8
            int r7 = com.instagram.genai.imageutils.MaskUtilsKt.A00     // Catch: java.lang.Throwable -> La8
            r0 = 0
            boolean r7 = X.MSY.A1S(r8, r7)
            X.17u r0 = X.C17s.A0C(r0, r12)     // Catch: java.lang.Throwable -> La8
            r14 = 0
            if (r7 == 0) goto L81
            r14 = 1
        L81:
            X.Pgi r8 = new X.Pgi     // Catch: java.lang.Throwable -> La8
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> La8
            r5.A04 = r3     // Catch: java.lang.Throwable -> La8
            r5.A05 = r10     // Catch: java.lang.Throwable -> La8
            r5.A07 = r2     // Catch: java.lang.Throwable -> La8
            r5.A00 = r1     // Catch: java.lang.Throwable -> La8
            r5.A01 = r12     // Catch: java.lang.Throwable -> La8
            r5.A02 = r11     // Catch: java.lang.Throwable -> La8
            r5.A03 = r6     // Catch: java.lang.Throwable -> La8
            java.lang.Object r0 = A0A(r5, r8, r0)     // Catch: java.lang.Throwable -> La8
            if (r0 != r4) goto L9e
            return r4
        L9b:
            X.AbstractC09560e7.A00(r7)     // Catch: java.lang.Throwable -> La8
        L9e:
            android.graphics.Bitmap r4 = A01(r10, r12, r11)     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto La7
            X.AbstractC13090lv.A04(r3, r1)
        La7:
            return r4
        La8:
            r0 = move-exception
            if (r2 == 0) goto Lae
            X.AbstractC13090lv.A04(r3, r1)
        Lae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A02(android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.PointF, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 != 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(android.graphics.Bitmap r11, java.util.List r12, X.InterfaceC23621Ds r13) {
        /*
            r10 = 0
            boolean r0 = r13 instanceof X.PWU
            if (r0 == 0) goto Ld
            r0 = r13
            X.PWU r0 = (X.PWU) r0
            int r1 = r0.A08
            r0 = 1
            if (r1 == r10) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L3a
            r6 = r13
            X.PWU r6 = (X.PWU) r6
            int r2 = r6.A03
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r6.A03 = r2
        L1e:
            java.lang.Object r7 = r6.A06
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A03
            r4 = 1
            if (r0 == 0) goto L45
            if (r0 != r4) goto L40
            int r8 = r6.A02
            int r9 = r6.A01
            int r1 = r6.A00
            boolean r2 = r6.A07
            java.lang.Object r13 = r6.A05
            int[] r13 = (int[]) r13
            java.lang.Object r3 = r6.A04
            java.lang.String r3 = (java.lang.String) r3
            goto L89
        L3a:
            X.PWU r6 = new X.PWU
            r6.<init>(r10, r13)
            goto L1e
        L40:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L45:
            X.AbstractC09560e7.A00(r7)
            java.lang.String r3 = "createSelectedMaskWithObjectsFromSelectEverythingMask"
            boolean r2 = A0E()
            int r1 = X.MSW.A01()
            if (r2 == 0) goto L57
            X.AbstractC13090lv.A03(r3, r1)
        L57:
            int[] r12 = X.AbstractC001800i.A0x(r12)     // Catch: java.lang.Throwable -> L96
            int r9 = r11.getWidth()     // Catch: java.lang.Throwable -> L96
            int r8 = r11.getHeight()     // Catch: java.lang.Throwable -> L96
            int r0 = r9 * r8
            int[] r13 = new int[r0]     // Catch: java.lang.Throwable -> L96
            int[] r11 = A0F(r11)     // Catch: java.lang.Throwable -> L96
            X.17u r0 = X.C17s.A0C(r10, r9)     // Catch: java.lang.Throwable -> L96
            X.DHy r7 = new X.DHy     // Catch: java.lang.Throwable -> L96
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L96
            r6.A04 = r3     // Catch: java.lang.Throwable -> L96
            r6.A05 = r13     // Catch: java.lang.Throwable -> L96
            r6.A07 = r2     // Catch: java.lang.Throwable -> L96
            r6.A00 = r1     // Catch: java.lang.Throwable -> L96
            r6.A01 = r9     // Catch: java.lang.Throwable -> L96
            r6.A02 = r8     // Catch: java.lang.Throwable -> L96
            r6.A03 = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = A0A(r6, r7, r0)     // Catch: java.lang.Throwable -> L96
            if (r0 != r5) goto L8c
            return r5
        L89:
            X.AbstractC09560e7.A00(r7)     // Catch: java.lang.Throwable -> L96
        L8c:
            android.graphics.Bitmap r5 = A01(r13, r9, r8)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L95
            X.AbstractC13090lv.A04(r3, r1)
        L95:
            return r5
        L96:
            r0 = move-exception
            if (r2 == 0) goto L9c
            X.AbstractC13090lv.A04(r3, r1)
        L9c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A03(android.graphics.Bitmap, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(android.graphics.Bitmap r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = 1
            boolean r0 = r11 instanceof X.C57138PWq
            if (r0 == 0) goto L31
            r8 = r11
            X.PWq r8 = (X.C57138PWq) r8
            int r0 = r8.A06
            if (r0 != r9) goto L31
            int r2 = r8.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r8.A01 = r2
        L17:
            java.lang.Object r7 = r8.A04
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A01
            r4 = 2
            if (r0 == 0) goto L49
            if (r0 == r9) goto L3c
            if (r0 != r4) goto L37
            int r5 = r8.A00
            boolean r3 = r8.A05
            java.lang.Object r4 = r8.A03
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.Object r2 = r8.A02
            java.lang.String r2 = (java.lang.String) r2
            goto L8e
        L31:
            X.PWq r8 = new X.PWq
            r8.<init>(r9, r11)
            goto L17
        L37:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L3c:
            int r5 = r8.A00
            boolean r3 = r8.A05
            java.lang.Object r2 = r8.A03
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r10 = r8.A02
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            goto L6c
        L49:
            X.AbstractC09560e7.A00(r7)
            java.lang.String r2 = "calculateMaskDataOutline"
            boolean r3 = A0E()
            int r5 = X.MSW.A01()
            if (r3 == 0) goto L5b
            X.AbstractC13090lv.A03(r2, r5)
        L5b:
            r8.A02 = r10     // Catch: java.lang.Throwable -> L9e
            r8.A03 = r2     // Catch: java.lang.Throwable -> L9e
            r8.A05 = r3     // Catch: java.lang.Throwable -> L9e
            r8.A00 = r5     // Catch: java.lang.Throwable -> L9e
            r8.A01 = r9     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r7 = A09(r10, r8, r9)     // Catch: java.lang.Throwable -> L9e
            if (r7 != r6) goto L6f
            return r6
        L6c:
            X.AbstractC09560e7.A00(r7)     // Catch: java.lang.Throwable -> L9e
        L6f:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch: java.lang.Throwable -> L9e
            int r0 = r10.getWidth()     // Catch: java.lang.Throwable -> L9e
            float r1 = (float) r0     // Catch: java.lang.Throwable -> L9e
            r0 = 1128792064(0x43480000, float:200.0)
            float r1 = r1 / r0
            r8.A02 = r2     // Catch: java.lang.Throwable -> L9e
            r8.A03 = r7     // Catch: java.lang.Throwable -> L9e
            r8.A05 = r3     // Catch: java.lang.Throwable -> L9e
            r8.A00 = r5     // Catch: java.lang.Throwable -> L9e
            r8.A01 = r4     // Catch: java.lang.Throwable -> L9e
            r4 = r7
            r0 = 160000(0x27100, float:2.24208E-40)
            java.lang.Object r7 = A07(r7, r8, r1, r0)     // Catch: java.lang.Throwable -> L9e
            if (r7 != r6) goto L91
            return r6
        L8e:
            X.AbstractC09560e7.A00(r7)     // Catch: java.lang.Throwable -> L9e
        L91:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch: java.lang.Throwable -> L9e
            X.CQd r6 = new X.CQd     // Catch: java.lang.Throwable -> L9e
            r6.<init>(r4, r7)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L9d
            X.AbstractC13090lv.A04(r2, r5)
        L9d:
            return r6
        L9e:
            r0 = move-exception
            if (r3 == 0) goto La4
            X.AbstractC13090lv.A04(r2, r5)
        La4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A04(android.graphics.Bitmap, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(android.graphics.Bitmap r11, X.InterfaceC23621Ds r12) {
        /*
            r7 = 0
            boolean r0 = r12 instanceof X.C57136PWo
            if (r0 == 0) goto L60
            r5 = r12
            X.PWo r5 = (X.C57136PWo) r5
            int r0 = r5.A05
            if (r0 != r7) goto L60
            int r2 = r5.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.A02 = r2
        L17:
            java.lang.Object r1 = r5.A04
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A02
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L66
            int r12 = r5.A01
            int r8 = r5.A00
            java.lang.Object r6 = r5.A03
            int[] r6 = (int[]) r6
            X.AbstractC09560e7.A00(r1)
        L2d:
            android.graphics.Bitmap r5 = X.AbstractC167007dF.A0F(r8, r12)
            r9 = r7
            r10 = r7
            r11 = r8
            r5.setPixels(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L38:
            X.AbstractC09560e7.A00(r1)
            int r8 = r11.getWidth()
            int r12 = r11.getHeight()
            int[] r6 = A0F(r11)
            X.17u r2 = X.C17s.A0C(r7, r8)
            r1 = 6
            X.DHW r0 = new X.DHW
            r0.<init>(r6, r8, r12, r1)
            r5.A03 = r6
            r5.A00 = r8
            r5.A01 = r12
            r5.A02 = r3
            java.lang.Object r0 = A0A(r5, r0, r2)
            if (r0 != r4) goto L2d
            return r4
        L60:
            X.PWo r5 = new X.PWo
            r5.<init>(r7, r12)
            goto L17
        L66:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A05(android.graphics.Bitmap, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(android.graphics.Bitmap r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = 1
            boolean r0 = r10 instanceof X.C57136PWo
            if (r0 == 0) goto L5a
            r7 = r10
            X.PWo r7 = (X.C57136PWo) r7
            int r0 = r7.A05
            if (r0 != r8) goto L5a
            int r2 = r7.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r7.A02 = r2
        L17:
            java.lang.Object r1 = r7.A04
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A02
            if (r0 == 0) goto L31
            if (r0 != r8) goto L60
            int r5 = r7.A01
            int r3 = r7.A00
            java.lang.Object r4 = r7.A03
            int[] r4 = (int[]) r4
            X.AbstractC09560e7.A00(r1)
        L2c:
            android.graphics.Bitmap r6 = A01(r4, r3, r5)
            return r6
        L31:
            X.AbstractC09560e7.A00(r1)
            int[] r4 = A0F(r9)
            int r3 = r9.getWidth()
            int r5 = r9.getHeight()
            r0 = 0
            X.17u r2 = X.C17s.A0C(r0, r3)
            r1 = 7
            X.DHW r0 = new X.DHW
            r0.<init>(r4, r3, r5, r1)
            r7.A03 = r4
            r7.A00 = r3
            r7.A01 = r5
            r7.A02 = r8
            java.lang.Object r0 = A0A(r7, r0, r2)
            if (r0 != r6) goto L2c
            return r6
        L5a:
            X.PWo r7 = new X.PWo
            r7.<init>(r8, r10)
            goto L17
        L60:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A06(android.graphics.Bitmap, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (((X.C57138PWq) r12).A06 != 3) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A07(android.graphics.Bitmap r11, X.InterfaceC23621Ds r12, float r13, int r14) {
        /*
            r3 = 3
            boolean r0 = r12 instanceof X.C57138PWq
            if (r0 == 0) goto Ld
            r0 = r12
            X.PWq r0 = (X.C57138PWq) r0
            int r1 = r0.A06
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L36
            r7 = r12
            X.PWq r7 = (X.C57138PWq) r7
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r7.A01 = r2
        L1e:
            java.lang.Object r8 = r7.A04
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A01
            r5 = 1
            if (r0 == 0) goto L41
            if (r0 != r5) goto L3c
            int r4 = r7.A00
            boolean r2 = r7.A05
            java.lang.Object r3 = r7.A03
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r11 = r7.A02
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            goto Lb3
        L36:
            X.PWq r7 = new X.PWq
            r7.<init>(r3, r12)
            goto L1e
        L3c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L41:
            X.AbstractC09560e7.A00(r8)
            java.lang.String r3 = "dilateScaled"
            boolean r2 = A0E()
            int r4 = X.MSW.A01()
            if (r2 == 0) goto L53
            X.AbstractC13090lv.A03(r3, r4)
        L53:
            int r1 = r11.getWidth()     // Catch: java.lang.Throwable -> Lcd
            int r0 = r11.getHeight()     // Catch: java.lang.Throwable -> Lcd
            int r1 = r1 * r0
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r1 <= r14) goto L73
            float r8 = (float) r14     // Catch: java.lang.Throwable -> Lcd
            int r1 = r11.getWidth()     // Catch: java.lang.Throwable -> Lcd
            int r0 = r11.getHeight()     // Catch: java.lang.Throwable -> Lcd
            int r1 = r1 * r0
            float r0 = (float) r1     // Catch: java.lang.Throwable -> Lcd
            float r8 = r8 / r0
            double r0 = (double) r8     // Catch: java.lang.Throwable -> Lcd
            double r0 = java.lang.Math.sqrt(r0)     // Catch: java.lang.Throwable -> Lcd
            float r8 = (float) r0     // Catch: java.lang.Throwable -> Lcd
            goto L75
        L73:
            r8 = 1065353216(0x3f800000, float:1.0)
        L75:
            r9 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            if (r0 != 0) goto L7f
            goto L81
        L7f:
            r9 = r11
            goto L97
        L81:
            int r0 = r11.getWidth()     // Catch: java.lang.Throwable -> Lcd
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lcd
            int r1 = X.AbstractC166987dD.A0B(r0, r8)     // Catch: java.lang.Throwable -> Lcd
            int r0 = r11.getHeight()     // Catch: java.lang.Throwable -> Lcd
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lcd
            int r0 = X.AbstractC166987dD.A0B(r0, r8)     // Catch: java.lang.Throwable -> Lcd
            android.graphics.Bitmap r9 = X.C0fK.A00(r11, r1, r0, r9)     // Catch: java.lang.Throwable -> Lcd
        L97:
            X.C14360o3.A0A(r9)     // Catch: java.lang.Throwable -> Lcd
            float r13 = r13 * r8
            double r0 = (double) r13     // Catch: java.lang.Throwable -> Lcd
            double r0 = java.lang.Math.ceil(r0)     // Catch: java.lang.Throwable -> Lcd
            float r8 = (float) r0     // Catch: java.lang.Throwable -> Lcd
            int r0 = (int) r8     // Catch: java.lang.Throwable -> Lcd
            r7.A02 = r11     // Catch: java.lang.Throwable -> Lcd
            r7.A03 = r3     // Catch: java.lang.Throwable -> Lcd
            r7.A05 = r2     // Catch: java.lang.Throwable -> Lcd
            r7.A00 = r4     // Catch: java.lang.Throwable -> Lcd
            r7.A01 = r5     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r8 = A08(r9, r7, r0)     // Catch: java.lang.Throwable -> Lcd
            if (r8 != r6) goto Lb6
            return r6
        Lb3:
            X.AbstractC09560e7.A00(r8)     // Catch: java.lang.Throwable -> Lcd
        Lb6:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: java.lang.Throwable -> Lcd
            int r1 = r11.getWidth()     // Catch: java.lang.Throwable -> Lcd
            int r0 = r11.getHeight()     // Catch: java.lang.Throwable -> Lcd
            android.graphics.Bitmap r6 = X.C0fK.A00(r8, r1, r0, r5)     // Catch: java.lang.Throwable -> Lcd
            X.C14360o3.A07(r6)     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto Lcc
            X.AbstractC13090lv.A04(r3, r4)
        Lcc:
            return r6
        Lcd:
            r0 = move-exception
            if (r2 == 0) goto Ld3
            X.AbstractC13090lv.A04(r3, r4)
        Ld3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A07(android.graphics.Bitmap, X.1Ds, float, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (((X.C57138PWq) r10).A06 != 2) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A08(android.graphics.Bitmap r9, X.InterfaceC23621Ds r10, int r11) {
        /*
            r3 = 2
            boolean r0 = r10 instanceof X.C57138PWq
            if (r0 == 0) goto Ld
            r0 = r10
            X.PWq r0 = (X.C57138PWq) r0
            int r1 = r0.A06
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L36
            r8 = r10
            X.PWq r8 = (X.C57138PWq) r8
            int r2 = r8.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r8.A01 = r2
        L1e:
            java.lang.Object r2 = r8.A04
            X.1JX r7 = X.C1JX.A02
            int r0 = r8.A01
            r6 = 1
            if (r0 == 0) goto L41
            if (r0 != r6) goto L3c
            int r5 = r8.A00
            boolean r3 = r8.A05
            java.lang.Object r4 = r8.A03
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r8.A02
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            goto L70
        L36:
            X.PWq r8 = new X.PWq
            r8.<init>(r3, r10)
            goto L1e
        L3c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L41:
            X.AbstractC09560e7.A00(r2)
            java.lang.String r4 = "Bitmap.dilateBitmap"
            boolean r3 = A0E()
            int r5 = X.MSW.A01()
            if (r3 == 0) goto L53
            X.AbstractC13090lv.A03(r4, r5)
        L53:
            int[] r2 = A0F(r9)     // Catch: java.lang.Throwable -> L87
            int r1 = r9.getWidth()     // Catch: java.lang.Throwable -> L87
            int r0 = r9.getHeight()     // Catch: java.lang.Throwable -> L87
            r8.A02 = r9     // Catch: java.lang.Throwable -> L87
            r8.A03 = r4     // Catch: java.lang.Throwable -> L87
            r8.A05 = r3     // Catch: java.lang.Throwable -> L87
            r8.A00 = r5     // Catch: java.lang.Throwable -> L87
            r8.A01 = r6     // Catch: java.lang.Throwable -> L87
            java.lang.Object r2 = A0C(r8, r2, r1, r0, r11)     // Catch: java.lang.Throwable -> L87
            if (r2 != r7) goto L73
            return r7
        L70:
            X.AbstractC09560e7.A00(r2)     // Catch: java.lang.Throwable -> L87
        L73:
            int[] r2 = (int[]) r2     // Catch: java.lang.Throwable -> L87
            int r1 = r9.getWidth()     // Catch: java.lang.Throwable -> L87
            int r0 = r9.getHeight()     // Catch: java.lang.Throwable -> L87
            android.graphics.Bitmap r7 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L87
            if (r3 == 0) goto L86
            X.AbstractC13090lv.A04(r4, r5)
        L86:
            return r7
        L87:
            r0 = move-exception
            if (r3 == 0) goto L8d
            X.AbstractC13090lv.A04(r4, r5)
        L8d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A08(android.graphics.Bitmap, X.1Ds, int):java.lang.Object");
    }

    public static final Object A0B(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, C17u c17u, int i) {
        C57561PgZ c57561PgZ = new C57561PgZ(interfaceC16660sJ, 4);
        int A012 = AbstractC001800i.A01(c17u);
        if (i < 1) {
            i = 1;
        }
        Object A002 = AnonymousClass194.A00(interfaceC23621Ds, new MCB(AbstractC43592JPx.A0W(C12L.A00, 585987666), (InterfaceC23621Ds) null, c57561PgZ, c17u, A012 / i));
        C1JX c1jx = C1JX.A02;
        if (A002 != c1jx) {
            A002 = C0eB.A00;
        }
        if (A002 != c1jx) {
            return C0eB.A00;
        }
        return A002;
    }

    public static final int[] A0F(Bitmap bitmap) {
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return iArr;
    }

    public static final Bitmap A01(int[] iArr, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        C14360o3.A07(createBitmap);
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A09(android.graphics.Bitmap r10, X.InterfaceC23621Ds r11, int r12) {
        /*
            boolean r0 = r11 instanceof X.PWN
            if (r0 == 0) goto L2d
            r8 = r11
            X.PWN r8 = (X.PWN) r8
            int r2 = r8.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r8.A02 = r2
        L12:
            java.lang.Object r2 = r8.A06
            X.1JX r9 = X.C1JX.A02
            int r0 = r8.A02
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L47
            if (r0 == r6) goto L38
            if (r0 != r7) goto L33
            int r5 = r8.A00
            boolean r4 = r8.A05
            java.lang.Object r3 = r8.A04
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r10 = r8.A03
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            goto L96
        L2d:
            X.PWN r8 = new X.PWN
            r8.<init>(r11)
            goto L12
        L33:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L38:
            int r5 = r8.A01
            boolean r4 = r8.A05
            int r12 = r8.A00
            java.lang.Object r3 = r8.A04
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r10 = r8.A03
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            goto L78
        L47:
            X.AbstractC09560e7.A00(r2)
            java.lang.String r3 = "Bitmap.dilateErode"
            boolean r4 = A0E()
            int r5 = X.MSW.A01()
            if (r4 == 0) goto L59
            X.AbstractC13090lv.A03(r3, r5)
        L59:
            int[] r2 = A0F(r10)     // Catch: java.lang.Throwable -> Lad
            int r1 = r10.getWidth()     // Catch: java.lang.Throwable -> Lad
            int r0 = r10.getHeight()     // Catch: java.lang.Throwable -> Lad
            r8.A03 = r10     // Catch: java.lang.Throwable -> Lad
            r8.A04 = r3     // Catch: java.lang.Throwable -> Lad
            r8.A00 = r12     // Catch: java.lang.Throwable -> Lad
            r8.A05 = r4     // Catch: java.lang.Throwable -> Lad
            r8.A01 = r5     // Catch: java.lang.Throwable -> Lad
            r8.A02 = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r2 = A0C(r8, r2, r1, r0, r12)     // Catch: java.lang.Throwable -> Lad
            if (r2 != r9) goto L7b
            return r9
        L78:
            X.AbstractC09560e7.A00(r2)     // Catch: java.lang.Throwable -> Lad
        L7b:
            int[] r2 = (int[]) r2     // Catch: java.lang.Throwable -> Lad
            int r1 = r10.getWidth()     // Catch: java.lang.Throwable -> Lad
            int r0 = r10.getHeight()     // Catch: java.lang.Throwable -> Lad
            r8.A03 = r10     // Catch: java.lang.Throwable -> Lad
            r8.A04 = r3     // Catch: java.lang.Throwable -> Lad
            r8.A05 = r4     // Catch: java.lang.Throwable -> Lad
            r8.A00 = r5     // Catch: java.lang.Throwable -> Lad
            r8.A02 = r7     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r2 = A0D(r8, r2, r1, r0, r12)     // Catch: java.lang.Throwable -> Lad
            if (r2 != r9) goto L99
            return r9
        L96:
            X.AbstractC09560e7.A00(r2)     // Catch: java.lang.Throwable -> Lad
        L99:
            int[] r2 = (int[]) r2     // Catch: java.lang.Throwable -> Lad
            int r1 = r10.getWidth()     // Catch: java.lang.Throwable -> Lad
            int r0 = r10.getHeight()     // Catch: java.lang.Throwable -> Lad
            android.graphics.Bitmap r9 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto Lac
            X.AbstractC13090lv.A04(r3, r5)
        Lac:
            return r9
        Lad:
            r0 = move-exception
            if (r4 == 0) goto Lb3
            X.AbstractC13090lv.A04(r3, r5)
        Lb3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A09(android.graphics.Bitmap, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (((X.PWe) r3).A0B != 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:15:0x0055, B:16:0x0091, B:18:0x0095, B:23:0x00bd, B:34:0x00ba, B:38:0x0089), top: B:10:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Ds] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e9 -> B:16:0x0091). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0C(X.InterfaceC23621Ds r16, int[] r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A0C(X.1Ds, int[], int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((X.PWe) r15).A0B != 1) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:14:0x0050, B:15:0x0099, B:17:0x009d, B:18:0x00a1, B:20:0x0074, B:34:0x006b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:14:0x0050, B:15:0x0099, B:17:0x009d, B:18:0x00a1, B:20:0x0074, B:34:0x006b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0096 -> B:15:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0D(X.InterfaceC23621Ds r15, int[] r16, int r17, int r18, int r19) {
        /*
            r14 = r17
            r13 = r18
            r11 = r16
            r8 = r19
            r7 = 1
            boolean r0 = r15 instanceof X.PWe
            if (r0 == 0) goto L15
            r0 = r15
            X.PWe r0 = (X.PWe) r0
            int r1 = r0.A0B
            r0 = 1
            if (r1 == r7) goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L4a
            r6 = r15
            X.PWe r6 = (X.PWe) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r6.A00 = r2
        L26:
            java.lang.Object r10 = r6.A09
            X.1JX r9 = X.C1JX.A02
            int r0 = r6.A00
            r5 = 0
            if (r0 == 0) goto L59
            if (r0 != r7) goto L54
            int r1 = r6.A05
            int r2 = r6.A04
            boolean r3 = r6.A0A
            int r8 = r6.A03
            int r13 = r6.A02
            int r14 = r6.A01
            java.lang.Object r12 = r6.A08
            int[] r12 = (int[]) r12
            java.lang.Object r4 = r6.A07
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r11 = r6.A06
            int[] r11 = (int[]) r11
            goto L50
        L4a:
            X.PWe r6 = new X.PWe
            r6.<init>(r7, r15)
            goto L26
        L50:
            X.AbstractC09560e7.A00(r10)     // Catch: java.lang.Throwable -> Lab
            goto L99
        L54:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L59:
            X.AbstractC09560e7.A00(r10)
            java.lang.String r4 = "erode"
            boolean r3 = A0E()
            int r2 = X.MSW.A01()
            if (r3 == 0) goto L6b
            X.AbstractC13090lv.A03(r4, r2)
        L6b:
            java.lang.Object r12 = r11.clone()     // Catch: java.lang.Throwable -> Lab
            int[] r12 = (int[]) r12     // Catch: java.lang.Throwable -> Lab
            r1 = 0
        L72:
            if (r1 >= r8) goto La5
            X.17u r0 = X.C17s.A0C(r5, r14)     // Catch: java.lang.Throwable -> Lab
            r15 = 7
            X.DRe r10 = new X.DRe     // Catch: java.lang.Throwable -> Lab
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lab
            r6.A06 = r11     // Catch: java.lang.Throwable -> Lab
            r6.A07 = r4     // Catch: java.lang.Throwable -> Lab
            r6.A08 = r12     // Catch: java.lang.Throwable -> Lab
            r6.A01 = r14     // Catch: java.lang.Throwable -> Lab
            r6.A02 = r13     // Catch: java.lang.Throwable -> Lab
            r6.A03 = r8     // Catch: java.lang.Throwable -> Lab
            r6.A0A = r3     // Catch: java.lang.Throwable -> Lab
            r6.A04 = r2     // Catch: java.lang.Throwable -> Lab
            r6.A05 = r1     // Catch: java.lang.Throwable -> Lab
            r6.A00 = r7     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r0 = A0A(r6, r10, r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 != r9) goto L99
            goto La4
        L99:
            int r0 = r8 + (-1)
            if (r1 >= r0) goto La1
            int r0 = r12.length     // Catch: java.lang.Throwable -> Lab
            X.AbstractC06960Yn.A0U(r12, r11, r5, r5, r0)     // Catch: java.lang.Throwable -> Lab
        La1:
            int r1 = r1 + 1
            goto L72
        La4:
            return r9
        La5:
            if (r3 == 0) goto Laa
            X.AbstractC13090lv.A04(r4, r2)
        Laa:
            return r12
        Lab:
            r0 = move-exception
            if (r3 == 0) goto Lb1
            X.AbstractC13090lv.A04(r4, r2)
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A0D(X.1Ds, int[], int, int, int):java.lang.Object");
    }

    public static boolean A0E() {
        return Systrace.A0E(1L);
    }

    public static Object A0A(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, C17u c17u) {
        return A0B(interfaceC23621Ds, interfaceC16660sJ, c17u, Runtime.getRuntime().availableProcessors());
    }
}
