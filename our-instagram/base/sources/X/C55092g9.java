package X;

import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import java.util.Iterator;

/* renamed from: X.2g9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55092g9 {
    public InterfaceC65184TfS A00;
    public final InterfaceC65185TfT A01;
    public final C54502f7 A02;

    public C55092g9(InterfaceC65184TfS interfaceC65184TfS, InterfaceC65185TfT interfaceC65185TfT, C54502f7 c54502f7, java.util.Set set) {
        this.A01 = interfaceC65185TfT;
        this.A02 = c54502f7;
        this.A00 = interfaceC65184TfS;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                A00(new C63606SqE(str), this, str, 0, str.length(), 1, true);
            }
        }
    }

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
    public static boolean A02(android.text.Editable r9, android.view.inputmethod.InputConnection r10, int r11, int r12, boolean r13) {
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
            java.lang.Class<X.65k> r0 = X.AbstractC1343865k.class
            java.lang.Object[] r4 = r9.getSpans(r6, r5, r0)
            X.65k[] r4 = (X.AbstractC1343865k[]) r4
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
        throw new UnsupportedOperationException("Method not decompiled: X.C55092g9.A02(android.text.Editable, android.view.inputmethod.InputConnection, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r2 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A00(X.InterfaceC110624yZ r20, X.C55092g9 r21, java.lang.CharSequence r22, int r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55092g9.A00(X.4yZ, X.2g9, java.lang.CharSequence, int, int, int, boolean):java.lang.Object");
    }

    private boolean A03(C54532fA c54532fA, CharSequence charSequence, int i, int i2) {
        if ((c54532fA.A02 & 3) == 0) {
            InterfaceC65184TfS interfaceC65184TfS = this.A00;
            C54542fB A00 = C54532fA.A00(c54532fA);
            int A002 = A00.A00(8);
            if (A002 != 0) {
                A00.A04.getShort(A002 + A00.A00);
            }
            C58340Ptb c58340Ptb = (C58340Ptb) interfaceC65184TfS;
            ThreadLocal threadLocal = C58340Ptb.A01;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = c58340Ptb.A00.hasGlyph(sb.toString());
            int i3 = c54532fA.A02 & 4;
            int i4 = i3 | 1;
            if (hasGlyph) {
                i4 = i3 | 2;
            }
            c54532fA.A02 = i4;
        }
        if ((c54532fA.A02 & 3) != 2) {
            return false;
        }
        return true;
    }

    public static boolean A01(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC1343865k[] abstractC1343865kArr;
        int length;
        if (!(!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()))) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (abstractC1343865kArr = (AbstractC1343865k[]) editable.getSpans(selectionStart, selectionEnd, AbstractC1343865k.class)) != null && (length = abstractC1343865kArr.length) > 0) {
                int i = 0;
                do {
                    AbstractC1343865k abstractC1343865k = abstractC1343865kArr[i];
                    int spanStart = editable.getSpanStart(abstractC1343865k);
                    int spanEnd = editable.getSpanEnd(abstractC1343865k);
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
