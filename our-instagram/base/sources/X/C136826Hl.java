package X;

import android.text.Layout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136826Hl {
    public char[] A00;
    public final Layout A01;
    public final List A02;
    public final List A03;
    public final boolean[] A04;

    public static final int A00(C136826Hl c136826Hl, int i, int i2) {
        while (i > i2) {
            char charAt = c136826Hl.A01.getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760) {
                if (C14360o3.A00(charAt, 8192) >= 0 && C14360o3.A00(charAt, 8202) <= 0) {
                    if (charAt == 8199) {
                        break;
                    }
                } else if (charAt != 8287 && charAt != 12288) {
                    break;
                }
            }
            i--;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018b, code lost:
    
        if (r17 != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r12 != ((java.lang.Number) r2.get(r3)).intValue()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017b, code lost:
    
        if (r17 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0196, code lost:
    
        if (r17 != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0182, code lost:
    
        if (r17 == false) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float A01(int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136826Hl.A01(int, boolean, boolean):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r6.getRunCount() == 1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi A02(int r14) {
        /*
            r13 = this;
            boolean[] r2 = r13.A04
            boolean r0 = r2[r14]
            if (r0 == 0) goto Lf
            java.util.List r0 = r13.A03
            java.lang.Object r6 = r0.get(r14)
            java.text.Bidi r6 = (java.text.Bidi) r6
            return r6
        Lf:
            r8 = 0
            if (r14 != 0) goto L77
            r6 = 0
        L13:
            java.util.List r5 = r13.A02
            java.lang.Object r0 = r5.get(r14)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            int r11 = r3 - r6
            char[] r7 = r13.A00
            if (r7 == 0) goto L28
            int r0 = r7.length
            if (r0 >= r11) goto L2a
        L28:
            char[] r7 = new char[r11]
        L2a:
            r1 = r7
            android.text.Layout r4 = r13.A01
            java.lang.CharSequence r0 = r4.getText()
            android.text.TextUtils.getChars(r0, r6, r3, r7, r8)
            boolean r0 = java.text.Bidi.requiresBidi(r7, r8, r11)
            r9 = 0
            r3 = 1
            if (r0 == 0) goto L58
            if (r14 != 0) goto L6a
            r0 = 0
        L3f:
            int r0 = r4.getLineForOffset(r0)
            int r4 = r4.getParagraphDirection(r0)
            r0 = -1
            r12 = 0
            if (r4 != r0) goto L4c
            r12 = 1
        L4c:
            java.text.Bidi r6 = new java.text.Bidi
            r10 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r3) goto L59
        L58:
            r6 = r9
        L59:
            java.util.List r0 = r13.A03
            r0.set(r14, r6)
            r2[r14] = r3
            if (r6 == 0) goto L67
            char[] r1 = r13.A00
            if (r7 != r1) goto L67
            r1 = r9
        L67:
            r13.A00 = r1
            return r6
        L6a:
            int r0 = r14 + (-1)
            java.lang.Object r0 = r5.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L3f
        L77:
            java.util.List r1 = r13.A02
            int r0 = r14 + (-1)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136826Hl.A02(int):java.text.Bidi");
    }

    public C136826Hl(Layout layout) {
        this.A01 = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int A04 = AbstractC001900j.A04(this.A01.getText(), '\n', i);
            if (A04 < 0) {
                i = this.A01.getText().length();
            } else {
                i = A04 + 1;
            }
            arrayList.add(Integer.valueOf(i));
        } while (i < this.A01.getText().length());
        this.A02 = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.A03 = arrayList2;
        this.A04 = new boolean[arrayList.size()];
        arrayList.size();
    }
}
