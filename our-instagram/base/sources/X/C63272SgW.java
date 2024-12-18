package X;

import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;

/* renamed from: X.SgW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63272SgW {
    public C62879SVe A00 = new C62879SVe();
    public final C62894SWa A01;
    public final Rr8 A02;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (java.lang.Character.isHighSurrogate(r1) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r2 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004f, code lost:
    
        if (java.lang.Character.isLowSurrogate(r1) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0042, code lost:
    
        if (r2 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0038, code lost:
    
        if (r5 != (-1)) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(android.text.Editable r9, android.view.inputmethod.InputConnection r10, int r11, int r12, boolean r13) {
        /*
            r7 = 0
            if (r9 == 0) goto L3a
            if (r11 < 0) goto L3a
            if (r12 < 0) goto L3a
            int r6 = android.text.Selection.getSelectionStart(r9)
            int r5 = android.text.Selection.getSelectionEnd(r9)
            r3 = -1
            if (r6 == r3) goto L3a
            if (r5 == r3) goto L3a
            if (r6 != r5) goto L3a
            if (r13 == 0) goto L97
            int r4 = java.lang.Math.max(r11, r7)
            int r0 = r9.length()
            if (r6 < 0) goto L26
            if (r0 < r6) goto L26
            if (r4 >= 0) goto L6b
        L26:
            r6 = -1
        L27:
            int r8 = java.lang.Math.max(r12, r7)
            int r4 = r9.length()
            if (r5 < 0) goto L35
            if (r4 < r5) goto L35
            if (r8 >= 0) goto L3b
        L35:
            r5 = -1
        L36:
            if (r6 == r3) goto L3a
            if (r5 != r3) goto La5
        L3a:
            return r7
        L3b:
            r2 = 0
        L3c:
            if (r8 != 0) goto L3f
            goto L36
        L3f:
            if (r5 < r4) goto L45
            r5 = r4
            if (r2 == 0) goto L36
            goto L35
        L45:
            char r1 = r9.charAt(r5)
            if (r2 == 0) goto L56
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 == 0) goto L35
            int r8 = r8 + (-1)
            int r5 = r5 + 1
            goto L3b
        L56:
            boolean r0 = java.lang.Character.isSurrogate(r1)
            if (r0 != 0) goto L61
            int r8 = r8 + (-1)
            int r5 = r5 + 1
            goto L3c
        L61:
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 != 0) goto L35
            int r5 = r5 + 1
            r2 = 1
            goto L3f
        L6b:
            r2 = 0
        L6c:
            if (r4 != 0) goto L6f
            goto L27
        L6f:
            int r6 = r6 + (-1)
            if (r6 >= 0) goto L77
            r6 = 0
            if (r2 == 0) goto L27
            goto L26
        L77:
            char r1 = r9.charAt(r6)
            if (r2 == 0) goto L86
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 == 0) goto L26
            int r4 = r4 + (-1)
            goto L6b
        L86:
            boolean r0 = java.lang.Character.isSurrogate(r1)
            if (r0 != 0) goto L8f
            int r4 = r4 + (-1)
            goto L6c
        L8f:
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 != 0) goto L26
            r2 = 1
            goto L6f
        L97:
            int r6 = r6 - r11
            int r6 = java.lang.Math.max(r6, r7)
            int r5 = r5 + r12
            int r0 = r9.length()
            int r5 = java.lang.Math.min(r5, r0)
        La5:
            java.lang.Class<X.Q42> r0 = X.Q42.class
            java.lang.Object[] r4 = r9.getSpans(r6, r5, r0)
            X.Q42[] r4 = (X.Q42[]) r4
            if (r4 == 0) goto L3a
            int r3 = r4.length
            if (r3 <= 0) goto L3a
            r2 = 0
        Lb3:
            r0 = r4[r2]
            int r1 = r9.getSpanStart(r0)
            int r0 = r9.getSpanEnd(r0)
            int r6 = java.lang.Math.min(r1, r6)
            int r5 = java.lang.Math.max(r0, r5)
            int r2 = r2 + 1
            if (r2 < r3) goto Lb3
            int r1 = java.lang.Math.max(r6, r7)
            int r0 = r9.length()
            int r0 = java.lang.Math.min(r5, r0)
            r10.beginBatchEdit()
            r9.delete(r1, r0)
            r10.endBatchEdit()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63272SgW.A01(android.text.Editable, android.view.inputmethod.InputConnection, int, int, boolean):boolean");
    }

    public static boolean A02(C63169SeU c63169SeU, C63272SgW c63272SgW, CharSequence charSequence, int i, int i2) {
        if (c63169SeU.A02 == 0) {
            C62879SVe c62879SVe = c63272SgW.A00;
            ThreadLocal threadLocal = C62879SVe.A01;
            if (threadLocal.get() == null) {
                threadLocal.set(AbstractC166987dD.A1C());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            int i3 = 1;
            if (c62879SVe.A00.hasGlyph(sb.toString())) {
                i3 = 2;
            }
            c63169SeU.A02 = i3;
        }
        return c63169SeU.A02 == 2;
    }

    public C63272SgW(Rr8 rr8, C62894SWa c62894SWa) {
        this.A02 = rr8;
        this.A01 = c62894SWa;
    }

    public static boolean A00(Editable editable, KeyEvent keyEvent, boolean z) {
        Q42[] q42Arr;
        int length;
        if (!(!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()))) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (q42Arr = (Q42[]) editable.getSpans(selectionStart, selectionEnd, Q42.class)) != null && (length = q42Arr.length) > 0) {
                int i = 0;
                do {
                    Q42 q42 = q42Arr[i];
                    int spanStart = editable.getSpanStart(q42);
                    int spanEnd = editable.getSpanEnd(q42);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        i++;
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                        i++;
                    }
                } while (i < length);
            }
        }
        return false;
    }
}
