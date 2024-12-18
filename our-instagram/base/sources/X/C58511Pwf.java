package X;

import android.text.TextPaint;

/* renamed from: X.Pwf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58511Pwf extends AbstractC1343865k {
    public TextPaint A00;

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r21, java.lang.CharSequence r22, int r23, int r24, float r25, int r26, int r27, int r28, android.graphics.Paint r29) {
        /*
            r20 = this;
            r4 = r22
            r13 = r29
            r5 = r13
            boolean r0 = r4 instanceof android.text.Spanned
            r1 = 0
            r7 = r21
            r11 = r25
            r6 = r20
            if (r0 == 0) goto L29
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.Class<android.text.style.CharacterStyle> r0 = android.text.style.CharacterStyle.class
            r2 = r24
            r3 = r23
            java.lang.Object[] r4 = r4.getSpans(r3, r2, r0)
            android.text.style.CharacterStyle[] r4 = (android.text.style.CharacterStyle[]) r4
            int r3 = r4.length
            if (r3 == 0) goto L29
            r2 = 0
            r0 = 1
            if (r3 != r0) goto L87
            r0 = r4[r2]
            if (r0 != r6) goto L87
        L29:
            boolean r0 = r13 instanceof android.text.TextPaint
            if (r0 == 0) goto L85
            android.text.TextPaint r5 = (android.text.TextPaint) r5
        L2f:
            if (r5 == 0) goto L61
            int r0 = r5.bgColor
            if (r0 == 0) goto L61
            short r0 = r6.A00
            float r0 = (float) r0
            float r17 = r25 + r0
            r0 = r26
            float r4 = (float) r0
            r0 = r28
            float r3 = (float) r0
            int r2 = r5.getColor()
            android.graphics.Paint$Style r1 = r5.getStyle()
            int r0 = r5.bgColor
            r5.setColor(r0)
            X.AbstractC166987dD.A1R(r5)
            r14 = r7
            r15 = r11
            r18 = r3
            r19 = r5
            r16 = r4
            r14.drawRect(r15, r16, r17, r18, r19)
            r5.setStyle(r1)
            r5.setColor(r2)
        L61:
            X.C58341Ptc.A00()
            X.2fA r3 = r6.A02
            r0 = r27
            float r12 = (float) r0
            if (r5 == 0) goto L6c
            r13 = r5
        L6c:
            X.2f7 r2 = r3.A01
            android.graphics.Typeface r0 = r2.A00
            android.graphics.Typeface r1 = r13.getTypeface()
            r13.setTypeface(r0)
            int r0 = r3.A00
            int r9 = r0 * 2
            char[] r8 = r2.A03
            r10 = 2
            r7.drawText(r8, r9, r10, r11, r12, r13)
            r13.setTypeface(r1)
            return
        L85:
            r5 = r1
            goto L61
        L87:
            android.text.TextPaint r5 = r6.A00
            if (r5 != 0) goto L92
            android.text.TextPaint r5 = new android.text.TextPaint
            r5.<init>()
            r6.A00 = r5
        L92:
            r5.set(r13)
        L95:
            r1 = r4[r2]
            boolean r0 = r1 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L9e
            r1.updateDrawState(r5)
        L9e:
            int r2 = r2 + 1
            if (r2 >= r3) goto L2f
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58511Pwf.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }
}
