package X;

/* renamed from: X.46y, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C46y extends C46z {
    public final int A00;
    public final int[] A01;

    public final int A01(CharSequence charSequence, int i, int i2) {
        return A02(charSequence, this.A01, 0, this.A00, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0014, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A02(java.lang.CharSequence r6, int[] r7, int r8, int r9, int r10, int r11) {
        /*
            r5 = this;
            r1 = 0
            r4 = -1
            r3 = -1
        L3:
            if (r10 >= r11) goto L14
            int r2 = java.lang.Character.codePointAt(r6, r10)
            int r9 = X.C104594nP.A00(r7, r1, r9, r2)
            if (r9 >= 0) goto L15
            r0 = 65038(0xfe0e, float:9.1138E-41)
            if (r2 == r0) goto L28
        L14:
            return r3
        L15:
            int r0 = java.lang.Character.charCount(r2)
            int r10 = r10 + r0
            int r1 = r9 >>> 16
            r0 = 65535(0xffff, float:9.1834E-41)
            r9 = r9 & r0
            r0 = r7[r1]
            if (r0 != 0) goto L3
            if (r10 > r11) goto L3
            r3 = r10
            goto L3
        L28:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46y.A02(java.lang.CharSequence, int[], int, int, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A03(int[] r7, int[] r8, int r9, int r10, int r11, int r12) {
        /*
            r6 = this;
            r1 = 0
            r0 = 0
            r5 = -1
            r4 = -1
        L4:
            if (r0 >= r12) goto L15
            int r3 = r0 + 1
            r2 = r8[r0]
            int r10 = X.C104594nP.A00(r7, r1, r10, r2)
            if (r10 >= 0) goto L16
            r0 = 65038(0xfe0e, float:9.1138E-41)
            if (r2 == r0) goto L25
        L15:
            return r4
        L16:
            int r1 = r10 >>> 16
            r0 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r0
            r0 = r7[r1]
            if (r0 != 0) goto L23
            if (r3 > r12) goto L23
            r4 = r3
        L23:
            r0 = r3
            goto L4
        L25:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46y.A03(int[], int[], int, int, int, int):int");
    }

    public C46y(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }
}
