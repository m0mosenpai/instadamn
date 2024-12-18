package X;

import java.util.Arrays;

/* loaded from: classes11.dex */
public abstract class WFG {
    public static final byte[] A01 = {0, 0, 0, 1};
    public static final float[] A02 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object A03 = new Object();
    public static int[] A00 = new int[10];

    public static int A00(byte[] bArr, int i) {
        int i2;
        synchronized (A03) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    int[] iArr = A00;
                    int length = iArr.length;
                    if (length <= i4) {
                        iArr = Arrays.copyOf(iArr, length * 2);
                        A00 = iArr;
                    }
                    iArr[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = A00[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
    
        if (r8[r11 - 3] == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0078, code lost:
    
        if (r8[r11 - 2] != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007d, code lost:
    
        if (r8[r2] == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        if (r8[r2] != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a3, code lost:
    
        if (r9[2] != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a8, code lost:
    
        if (r9[1] != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(byte[] r8, boolean[] r9, int r10, int r11) {
        /*
            int r5 = r11 - r10
            r7 = 0
            r4 = 1
            boolean r0 = X.MSY.A1R(r5)
            X.WDn.A02(r0)
            if (r5 == 0) goto Lab
            boolean r0 = r9[r7]
            if (r0 == 0) goto L1b
            r9[r7] = r7
            r9[r4] = r7
            r0 = 2
            r9[r0] = r7
            int r10 = r10 + (-3)
            return r10
        L1b:
            r3 = 2
            if (r5 <= r4) goto L46
            boolean r0 = r9[r4]
            if (r0 == 0) goto L2e
            r0 = r8[r10]
            if (r0 != r4) goto L2e
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            int r10 = r10 - r3
            return r10
        L2e:
            if (r5 <= r3) goto L46
            boolean r0 = r9[r3]
            if (r0 == 0) goto L46
            r0 = r8[r10]
            if (r0 != 0) goto L46
            int r0 = r10 + 1
            r0 = r8[r0]
            if (r0 != r4) goto L46
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            int r10 = r10 - r4
            return r10
        L46:
            int r2 = r11 + (-1)
            int r6 = r10 + 2
        L4a:
            if (r6 >= r2) goto L6c
            r1 = r8[r6]
            r0 = r1 & 254(0xfe, float:3.56E-43)
            if (r0 != 0) goto L69
            int r10 = r6 + (-2)
            r0 = r8[r10]
            if (r0 != 0) goto L67
            int r0 = r6 + (-1)
            r0 = r8[r0]
            if (r0 != 0) goto L67
            if (r1 != r4) goto L67
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            return r10
        L67:
            int r6 = r6 + (-2)
        L69:
            int r6 = r6 + 3
            goto L4a
        L6c:
            if (r5 <= r3) goto L9f
            int r0 = r11 + (-3)
            r0 = r8[r0]
            if (r0 != 0) goto L7f
        L74:
            int r0 = r11 + (-2)
            r0 = r8[r0]
            if (r0 != 0) goto L7f
        L7a:
            r1 = r8[r2]
            r0 = 1
            if (r1 == r4) goto L80
        L7f:
            r0 = 0
        L80:
            r9[r7] = r0
            if (r5 <= r4) goto L9a
            int r0 = r11 + (-2)
            r0 = r8[r0]
            if (r0 != 0) goto L8f
        L8a:
            r1 = r8[r2]
            r0 = 1
            if (r1 == 0) goto L90
        L8f:
            r0 = 0
        L90:
            r9[r4] = r0
            r0 = r8[r2]
            if (r0 != 0) goto L97
            r7 = 1
        L97:
            r9[r3] = r7
            return r11
        L9a:
            boolean r0 = r9[r3]
            if (r0 == 0) goto L8f
            goto L8a
        L9f:
            if (r5 != r3) goto La6
            boolean r0 = r9[r3]
            if (r0 == 0) goto L7f
            goto L74
        La6:
            boolean r0 = r9[r4]
            if (r0 == 0) goto L7f
            goto L7a
        Lab:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFG.A01(byte[], boolean[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r23 == 2) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C69471Vnu A02(byte[] r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFG.A02(byte[], int, int):X.Vnu");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00bf, code lost:
    
        if ((r18 & 16) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (r2 != 1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C69455Vne A03(byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFG.A03(byte[], int, int):X.Vne");
    }
}
