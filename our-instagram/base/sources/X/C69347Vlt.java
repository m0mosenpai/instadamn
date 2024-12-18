package X;

import android.text.StaticLayout;

/* renamed from: X.Vlt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69347Vlt {
    public final float A00;
    public final StaticLayout A01;
    public final StaticLayout A02;
    public final C6S5 A03;
    public final C202888y6[] A04;
    public final boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r6 == X.C6S5.A07) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C69347Vlt(android.text.Layout.Alignment r25, android.text.Spannable r26, android.text.TextPaint r27, X.C57482kN r28, float r29, int r30, int r31) {
        /*
            r24 = this;
            r0 = 1
            r3 = r26
            X.C14360o3.A0B(r3, r0)
            r5 = r24
            r5.<init>()
            r0 = r29
            r5.A00 = r0
            r2 = r30
            r1 = r31
            X.6S5 r6 = X.AbstractC190978ct.A00(r3, r2, r1)
            r5.A03 = r6
            X.6S5 r0 = X.C6S5.A08
            if (r6 == r0) goto L22
            X.6S5 r4 = X.C6S5.A07
            r8 = 0
            if (r6 != r4) goto L23
        L22:
            r8 = 1
        L23:
            r5.A05 = r8
            r7 = 0
            if (r8 == 0) goto Lb6
            java.lang.Class<X.8y6> r4 = X.C202888y6.class
            java.lang.Object[] r4 = r3.getSpans(r2, r1, r4)
            X.8y6[] r4 = (X.C202888y6[]) r4
        L30:
            r5.A04 = r4
            java.lang.CharSequence r10 = r3.subSequence(r2, r1)
            r6 = r28
            int r12 = r6.A00
            float r14 = r6.A02
            float r15 = r6.A01
            r16 = 0
            android.text.StaticLayout r9 = new android.text.StaticLayout
            r13 = r25
            r11 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.A01 = r9
            if (r8 == 0) goto L95
            java.lang.CharSequence r17 = r3.subSequence(r2, r1)
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>()
            X.8y6[] r9 = r5.A04
            if (r9 == 0) goto L80
            r4.set(r11)
            float r8 = r11.getTextSize()
            r7 = r9[r16]
            X.8cq r7 = r7.A09
            float r7 = r7.A02
            float r8 = r8 * r7
            r4.setStrokeWidth(r8)
            android.graphics.Paint$Join r7 = android.graphics.Paint.Join.ROUND
            r4.setStrokeJoin(r7)
            X.6S5 r8 = r5.A03
            r7 = r9[r16]
            if (r8 != r0) goto Lb3
            int r0 = r7.A02
        L78:
            r4.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r0)
        L80:
            int r0 = r6.A00
            android.text.StaticLayout r7 = new android.text.StaticLayout
            r20 = r13
            r21 = r14
            r22 = r15
            r23 = r16
            r18 = r4
            r19 = r0
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L95:
            r5.A02 = r7
            java.lang.Class<X.8ci> r0 = X.C190868ci.class
            java.lang.Object[] r4 = r3.getSpans(r2, r1, r0)
            int r3 = r4.length
            r2 = 0
        L9f:
            if (r2 >= r3) goto Lb9
            r1 = r4[r2]
            X.8ci r1 = (X.C190868ci) r1
            boolean r0 = r5.A05
            r0 = r0 ^ 1
            r1.A04 = r0
            int r0 = r1.A05
            r11.setColor(r0)
            int r2 = r2 + 1
            goto L9f
        Lb3:
            int r0 = r7.A01
            goto L78
        Lb6:
            r4 = r7
            goto L30
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69347Vlt.<init>(android.text.Layout$Alignment, android.text.Spannable, android.text.TextPaint, X.2kN, float, int, int):void");
    }
}
