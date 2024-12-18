package X;

/* loaded from: classes12.dex */
public abstract class Y3L {
    public static final int[] A00 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX WARN: Code restructure failed: missing block: B:256:0x0585, code lost:
    
        if (r5 < 8) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
    
        r8 = X.EnumC72391XcR.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0688, code lost:
    
        r17 = r17 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027c A[LOOP:2: B:82:0x027a->B:83:0x027c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C72833XoS A00(java.lang.Integer r29, java.lang.String r30, java.util.Map r31) {
        /*
            Method dump skipped, instructions count: 1911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y3L.A00(java.lang.Integer, java.lang.String, java.util.Map):X.XoS");
    }

    public static boolean A01(Y7W y7w, Integer num, int i) {
        int i2 = y7w.A00;
        C72732Xm4 c72732Xm4 = y7w.A03[num.intValue()];
        int i3 = c72732Xm4.A00;
        int i4 = 0;
        for (C72731Xm3 c72731Xm3 : c72732Xm4.A01) {
            i4 += c72731Xm3.A00;
        }
        if (i2 - (i3 * i4) < (i + 7) / 8) {
            return false;
        }
        return true;
    }
}
