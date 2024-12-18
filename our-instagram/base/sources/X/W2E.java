package X;

/* loaded from: classes11.dex */
public final class W2E {
    public float A00;
    public int A01 = -1;
    public final C122845hK A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float A00(X.W2E r6, int r7, boolean r8, boolean r9, boolean r10) {
        /*
            r5 = 1
            if (r8 == 0) goto L66
            X.5hK r4 = r6.A02
            android.text.Layout r3 = r4.A09
            if (r7 > 0) goto L3f
            r2 = 0
        La:
            int r1 = r3.getLineStart(r2)
            int r0 = r4.A05(r2)
            if (r7 == r1) goto L16
            if (r7 != r0) goto L66
        L16:
            r0 = 1
        L17:
            int r1 = r7 * 4
            if (r10 == 0) goto L3a
            if (r0 == 0) goto L1e
            r5 = 0
        L1e:
            int r1 = r1 + r5
            int r0 = r6.A01
            if (r0 != r1) goto L26
            float r0 = r6.A00
        L25:
            return r0
        L26:
            X.5hK r0 = r6.A02
            if (r10 == 0) goto L35
            float r0 = r0.A03(r7, r8)
        L2e:
            if (r9 == 0) goto L25
            r6.A01 = r1
            r6.A00 = r0
            return r0
        L35:
            float r0 = r0.A04(r7, r8)
            goto L2e
        L3a:
            r5 = 3
            if (r0 == 0) goto L1e
            r5 = 2
            goto L1e
        L3f:
            java.lang.CharSequence r0 = r3.getText()
            int r0 = r0.length()
            if (r7 < r0) goto L50
            int r0 = r3.getLineCount()
            int r2 = r0 + (-1)
            goto La
        L50:
            int r2 = r3.getLineForOffset(r7)
            int r1 = r3.getLineStart(r2)
            int r0 = r3.getLineEnd(r2)
            if (r1 == r7) goto L61
            if (r0 == r7) goto L61
            goto La
        L61:
            if (r1 != r7) goto La
            int r2 = r2 + (-1)
            goto La
        L66:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2E.A00(X.W2E, int, boolean, boolean, boolean):float");
    }

    public W2E(C122845hK c122845hK) {
        this.A02 = c122845hK;
    }
}
