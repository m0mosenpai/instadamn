package X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.view.ViewTreeObserver;
import android.widget.EditText;

/* renamed from: X.8ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC190978ct {
    public static final C6S5 A00(Spannable spannable, int i, int i2) {
        C14360o3.A0B(spannable, 0);
        if (i >= i2) {
            i2 = spannable.length();
            i = 0;
        }
        C6S0[] c6s0Arr = (C6S0[]) spannable.getSpans(i, i2, C6S0.class);
        C14360o3.A0A(c6s0Arr);
        if (c6s0Arr.length == 0) {
            return C6S5.A05;
        }
        return c6s0Arr[0].C6E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r17 == X.C6S5.A04) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r14 = r6.intValue();
        r4 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (r14 >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        r19.A0F.setSpan(r18.A00(r16, r11, r12, r19.A0b.getTextSize(), r14, 0), r14, 0, 65554);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r4 <= r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r19.A0F.setSpan(r18.A00(r16, r11, r12, r19.A0b.getTextSize(), r5, r4), r5, r4, 65554);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r14 = r6.intValue();
        r15 = r1.intValue();
        r1 = r18.A00(r16, r11, r12, r19.A0b.getTextSize(), r14, r15);
        r1.EfY(r17);
        r19.A0F.setSpan(r1, r14, r15, 65554);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        r2 = r8[r4];
        r1 = r7.getSpanStart(r2);
        r0 = r7.getSpanEnd(r2);
        r1 = java.lang.Math.min(r1, 0);
        r0 = java.lang.Math.max(r0, r5);
        r7.removeSpan(r2);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r4 >= r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r6 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        r6 = java.lang.Integer.valueOf(r1);
        r1 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r17 == X.C6S5.A06) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r16, X.C6S5 r17, X.AbstractC190968cs r18, X.C6RB r19) {
        /*
            r15 = 0
            r3 = r19
            android.text.StaticLayout r11 = r3.A0G
            if (r11 == 0) goto L74
            r9 = r18
            if (r18 == 0) goto L74
            android.text.Spannable r0 = r3.A0F
            int r5 = r0.length()
            X.AAp r1 = X.AbstractC23070AFc.A00
            android.text.Layout$Alignment r0 = r3.A0E
            X.C14360o3.A07(r0)
            java.lang.Integer r12 = r1.A00(r0)
            android.text.Spannable r1 = r3.A0F
            java.lang.Class r0 = r9.A01()
            java.lang.Object[] r8 = r1.getSpans(r15, r5, r0)
            android.text.Spannable r7 = r3.A0F
            X.C14360o3.A07(r7)
            r1 = 0
            r0 = r5
            int r6 = r8.length
            r4 = 0
            if (r6 != 0) goto L77
        L31:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.6S5 r0 = X.C6S5.A06
            r2 = 65554(0x10012, float:9.1861E-41)
            r10 = r16
            r4 = r17
            if (r4 == r0) goto L8f
            X.6S5 r0 = X.C6S5.A04
            if (r4 == r0) goto L8f
            int r14 = r6.intValue()
            int r4 = r1.intValue()
            if (r14 >= 0) goto L61
            android.text.TextPaint r0 = r3.A0b
            float r13 = r0.getTextSize()
            X.6S0 r1 = r9.A00(r10, r11, r12, r13, r14, r15)
            android.text.Spannable r0 = r3.A0F
            r0.setSpan(r1, r14, r15, r2)
        L61:
            if (r4 <= r5) goto L74
            android.text.TextPaint r0 = r3.A0b
            float r13 = r0.getTextSize()
            r14 = r5
            r15 = r4
            X.6S0 r1 = r9.A00(r10, r11, r12, r13, r14, r15)
            android.text.Spannable r0 = r3.A0F
            r0.setSpan(r1, r5, r4, r2)
        L74:
            return
        L75:
            if (r4 >= r6) goto L31
        L77:
            r2 = r8[r4]
            int r1 = r7.getSpanStart(r2)
            int r0 = r7.getSpanEnd(r2)
            int r1 = java.lang.Math.min(r1, r15)
            int r0 = java.lang.Math.max(r0, r5)
            r7.removeSpan(r2)
            int r4 = r4 + 1
            goto L75
        L8f:
            int r14 = r6.intValue()
            int r15 = r1.intValue()
            android.text.TextPaint r0 = r3.A0b
            float r13 = r0.getTextSize()
            X.6S0 r1 = r9.A00(r10, r11, r12, r13, r14, r15)
            r1.EfY(r4)
            android.text.Spannable r0 = r3.A0F
            r0.setSpan(r1, r14, r15, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC190978ct.A02(android.content.Context, X.6S5, X.8cs, X.6RB):void");
    }

    public static final void A03(Editable editable) {
        C14360o3.A0B(editable, 0);
        if (C4GL.A00(editable, C209749Pk.class) == null) {
            editable.setSpan(new Object(), 0, editable.length(), 65554);
        }
    }

    public static final boolean A05(Spannable spannable) {
        C14360o3.A0B(spannable, 0);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        if (selectionStart < 0 || selectionStart == selectionEnd) {
            selectionEnd = spannable.length();
            selectionStart = 0;
        }
        return A07(spannable, C6S0.class, selectionStart, selectionEnd);
    }

    public static final boolean A06(Spannable spannable) {
        C14360o3.A0B(spannable, 0);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        if (selectionStart < 0 || selectionStart == selectionEnd) {
            selectionEnd = spannable.length();
            selectionStart = 0;
        }
        return A07(spannable, C202888y6.class, selectionStart, selectionEnd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r19, 36320670111638314L) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        if (r8 == X.C6S5.A04) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        r1 = X.C6S5.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012c, code lost:
    
        if (r8 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        if (r18 != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(android.widget.EditText r18, com.instagram.common.session.UserSession r19, X.C55U r20, X.C6S5 r21, java.lang.Integer r22) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC190978ct.A04(android.widget.EditText, com.instagram.common.session.UserSession, X.55U, X.6S5, java.lang.Integer):void");
    }

    public static final C09530e4 A01(EditText editText, AbstractC190968cs abstractC190968cs, int i, int i2) {
        ViewTreeObserver viewTreeObserver = editText.getViewTreeObserver();
        C14360o3.A07(viewTreeObserver);
        Editable text = editText.getText();
        C6S0[] c6s0Arr = (C6S0[]) text.getSpans(i, i2, abstractC190968cs.A01());
        C202888y6[] c202888y6Arr = (C202888y6[]) text.getSpans(i, i2, C202888y6.class);
        C9TA[] c9taArr = (C9TA[]) text.getSpans(i, i2, C9TA.class);
        C9TB[] c9tbArr = (C9TB[]) text.getSpans(i, i2, C9TB.class);
        int i3 = i;
        int i4 = i2;
        for (C6S0 c6s0 : c6s0Arr) {
            int spanStart = text.getSpanStart(c6s0);
            int spanEnd = text.getSpanEnd(c6s0);
            i3 = Math.min(spanStart, i);
            i4 = Math.max(spanEnd, i2);
            viewTreeObserver.removeOnPreDrawListener(c6s0);
            text.removeSpan(c6s0);
        }
        for (C202888y6 c202888y6 : c202888y6Arr) {
            int spanStart2 = text.getSpanStart(c202888y6);
            int spanEnd2 = text.getSpanEnd(c202888y6);
            i3 = Math.min(spanStart2, i);
            i4 = Math.max(spanEnd2, i2);
            viewTreeObserver.removeOnPreDrawListener(c202888y6);
            text.removeSpan(c202888y6);
        }
        for (C9TA c9ta : c9taArr) {
            int spanStart3 = text.getSpanStart(c9ta);
            int spanEnd3 = text.getSpanEnd(c9ta);
            i3 = Math.min(spanStart3, i);
            i4 = Math.max(spanEnd3, i2);
            text.removeSpan(c9ta);
        }
        for (C9TB c9tb : c9tbArr) {
            int spanStart4 = text.getSpanStart(c9tb);
            int spanEnd4 = text.getSpanEnd(c9tb);
            i3 = Math.min(spanStart4, i);
            i4 = Math.max(spanEnd4, i2);
            text.removeSpan(c9tb);
        }
        return new C09530e4(Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static final boolean A07(Spannable spannable, Class cls, int i, int i2) {
        Object[] spans = spannable.getSpans(i, i2, cls);
        C14360o3.A0A(spans);
        if (spans.length == 0) {
            return false;
        }
        C0s6 c0s6 = new C0s6(spans);
        int i3 = 0;
        while (c0s6.hasNext()) {
            Object next = c0s6.next();
            i3 += Math.min(spannable.getSpanEnd(next), i2) - Math.max(spannable.getSpanStart(next), i);
        }
        if (i3 == i2 - i) {
            return true;
        }
        return false;
    }
}
