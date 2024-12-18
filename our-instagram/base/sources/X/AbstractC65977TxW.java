package X;

/* renamed from: X.TxW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65977TxW {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r1 > r10.getLineRight(r2)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(android.text.Layout r10, android.view.MotionEvent r11, android.view.View r12) {
        /*
            r3 = 0
            X.C14360o3.A0B(r11, r3)
            r8 = 1
            int r5 = r11.getAction()
            if (r5 == 0) goto Le
            if (r5 == r8) goto Le
        Ld:
            return r3
        Le:
            float r0 = r11.getX()
            int r4 = (int) r0
            float r0 = r11.getY()
            int r1 = (int) r0
            int r0 = r12.getPaddingLeft()
            int r4 = r4 - r0
            int r0 = r12.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r12.getScrollX()
            int r4 = r4 + r0
            int r0 = r12.getScrollY()
            int r1 = r1 + r0
            int r2 = r10.getLineForVertical(r1)
            float r0 = r10.getLineLeft(r2)
            float r1 = (float) r4
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L42
            float r0 = r10.getLineRight(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r11 = 1
            if (r0 <= 0) goto L43
        L42:
            r11 = 0
        L43:
            int r4 = r10.getOffsetForHorizontal(r2, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La1
            r0 = -1
            if (r4 == r0) goto Ld
            java.lang.CharSequence r2 = r10.getText()
            java.lang.String r1 = "null cannot be cast to non-null type android.text.Spanned"
            X.C14360o3.A0C(r2, r1)
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r9 = r2.getSpans(r4, r4, r0)
            android.text.style.ClickableSpan[] r9 = (android.text.style.ClickableSpan[]) r9
            int r7 = r9.length
            if (r7 == 0) goto Ld
            if (r5 != r8) goto L9d
            if (r7 == r8) goto L9e
            java.lang.CharSequence r10 = r10.getText()
            X.C14360o3.A0C(r10, r1)
            android.text.Spanned r10 = (android.text.Spanned) r10
            r0 = r9[r3]
            int r6 = r10.getSpanEnd(r0)
            r0 = r9[r3]
            int r0 = r10.getSpanStart(r0)
            int r6 = r6 - r0
            r5 = r6
            r4 = 0
            r2 = 1
        L7d:
            r0 = r9[r2]
            int r1 = r10.getSpanEnd(r0)
            r0 = r9[r2]
            int r0 = r10.getSpanStart(r0)
            int r1 = r1 - r0
            if (r1 >= r6) goto L8e
            r3 = r2
            r6 = r1
        L8e:
            if (r1 <= r5) goto L92
            r4 = r2
            r5 = r1
        L92:
            int r2 = r2 + 1
            if (r2 < r7) goto L7d
            if (r11 != 0) goto L9e
            r0 = r9[r4]
        L9a:
            r0.onClick(r12)
        L9d:
            return r8
        L9e:
            r0 = r9[r3]
            goto L9a
        La1:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto Laa
            java.lang.String r1 = ""
        Laa:
            java.lang.String r0 = "IgSpannableTouchHelper HorizontalMeasurementProvider crash...."
            X.C0w9.A03(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC65977TxW.A00(android.text.Layout, android.view.MotionEvent, android.view.View):boolean");
    }
}
