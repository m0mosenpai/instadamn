package X;

/* renamed from: X.Cgc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28429Cgc {
    public static final int A00(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    public static final void A03(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    public static final boolean A04(CUT cut, int[] iArr, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (cut.A09.A02(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (cut.A09.A02(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int A01 = cut.A09.A01(0);
        if (A01 == 0 || A01 == -1 || A01 == -2) {
            return false;
        }
        return true;
    }

    public static final int A01(int[] iArr, long j) {
        int A02 = AbstractC25228BEl.A02(j);
        int i = Integer.MIN_VALUE;
        for (int A06 = AbstractC25225BEi.A06(j); A06 < A02; A06++) {
            i = Math.max(i, iArr[A06]);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x045b, code lost:
    
        if (java.lang.Math.abs(r10) < java.lang.Math.abs(r8)) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0508, code lost:
    
        if (r4[r1] > r8) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0527, code lost:
    
        if (r11 == 0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0366, code lost:
    
        r1 = A00(r3, Integer.MIN_VALUE);
        r12 = -1;
        r11 = Integer.MIN_VALUE;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0370, code lost:
    
        if (r10 >= r7) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0372, code lost:
    
        r0 = r4[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0374, code lost:
    
        if (r11 >= r0) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0376, code lost:
    
        r12 = r10;
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0378, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x037b, code lost:
    
        if (r1 == r12) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0381, code lost:
    
        if (r3[r1] != r3[r12]) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0383, code lost:
    
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x03ab, code lost:
    
        r30 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0384, code lost:
    
        r10 = r4[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0388, code lost:
    
        if (r10 != (-1)) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x038a, code lost:
    
        r10 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x038c, code lost:
    
        r12 = r50.A09;
        r11 = r12.A02(r10, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0392, code lost:
    
        if (r11 >= 0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        r6 = -1;
        r9 = Integer.MIN_VALUE;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x03ae, code lost:
    
        r14 = r50.A00(r0, r11, r1);
        r29 = X.AbstractC25228BEl.A02(r14);
        r10 = X.AbstractC25225BEi.A06(r14);
        r1 = r29 - r10;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x03c4, code lost:
    
        if (r1 == 1) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x03c6, code lost:
    
        r16 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x03c8, code lost:
    
        r12.A05(r11, r16);
        r16 = r50.A0A.A00(r11, r14);
        r14 = A01(r3, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x03d9, code lost:
    
        if (r1 == 1) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x03db, code lost:
    
        r12 = r12.A06(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x03e1, code lost:
    
        if (r10 >= r29) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r1 >= r7) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x03e5, code lost:
    
        if (r3[r10] == r14) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x03e7, code lost:
    
        r30 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x03e9, code lost:
    
        r0[r10].addFirst(r16);
        r4[r10] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x03f2, code lost:
    
        if (r12 != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x03f4, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x03f5, code lost:
    
        r3[r10] = (r16.A09 + r14) + r1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x03fe, code lost:
    
        r1 = r12[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        r0 = r4[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0401, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0394, code lost:
    
        if (r30 != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x039a, code lost:
    
        if (A04(r50, r4, r3, r1) == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (r9 >= r0) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x039c, code lost:
    
        if (r54 == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x039e, code lost:
    
        r12.A03();
        r10 = new int[r7];
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x03a4, code lost:
    
        if (r0 >= r7) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x03a6, code lost:
    
        r10[r0] = -1;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0407, code lost:
    
        r7 = new int[r9];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x040a, code lost:
    
        if (r4 >= r9) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x040c, code lost:
    
        r7[r4] = r3[r1];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        r6 = r1;
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00be, code lost:
    
        r10 = r4[r6];
        r11 = r3.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c2, code lost:
    
        if (r9 >= r11) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c8, code lost:
    
        if (r4[r9] == r4[r6]) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ca, code lost:
    
        r1 = r3[r9];
        r0 = r3[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ce, code lost:
    
        if (r1 >= r0) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d0, code lost:
    
        r3[r9] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        r12 = r50.A09;
        r11 = r12.A02(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00db, code lost:
    
        if (r11 < 0) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dd, code lost:
    
        r0 = r50.A00(r0, r11, r6);
        r13 = X.AbstractC25228BEl.A02(r0);
        r10 = X.AbstractC25225BEi.A06(r0);
        r9 = r13 - r10;
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ef, code lost:
    
        if (r9 == 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        r5 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
    
        r12.A05(r11, r5);
        r5 = r50.A0A.A00(r11, r0);
        r14 = A01(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ff, code lost:
    
        if (r9 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0101, code lost:
    
        r6 = r12.A06(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0105, code lost:
    
        if (r10 >= r13) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0107, code lost:
    
        r4[r10] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0109, code lost:
    
        if (r6 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010b, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010c, code lost:
    
        r1 = (r5.A09 + r14) + r0;
        r3[r10] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0115, code lost:
    
        if ((r50.A03 + r1) > 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0117, code lost:
    
        r50 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0119, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011c, code lost:
    
        r0 = r6[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011f, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0177 A[LOOP:9: B:100:0x0175->B:101:0x0177, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0212 A[LOOP:11: B:108:0x01a3->B:113:0x0212, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230 A[EDGE_INSN: B:180:0x0230->B:181:0x0230 BREAK  A[LOOP:13: B:136:0x0214->B:173:0x0214], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046a A[LOOP:20: B:230:0x0468->B:231:0x046a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04ed A[LOOP:23: B:261:0x04ed->B:272:0x05fc, LOOP_START, PHI: r1 r11 r14
      0x04ed: PHI (r1v65 int) = (r1v35 int), (r1v70 int) binds: [B:260:0x04eb, B:272:0x05fc] A[DONT_GENERATE, DONT_INLINE]
      0x04ed: PHI (r11v16 ??) = (r11v28 ??), (r11v29 ??) binds: [B:260:0x04eb, B:272:0x05fc] A[DONT_GENERATE, DONT_INLINE]
      0x04ed: PHI (r14v14 int) = (r14v3 int), (r14v15 int) binds: [B:260:0x04eb, B:272:0x05fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x056e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x053e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0332 A[EDGE_INSN: B:474:0x0332->B:218:0x0332 BREAK  A[LOOP:18: B:211:0x0322->B:215:0x033e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.01U[]] */
    /* JADX WARN: Type inference failed for: r0v190, types: [X.01U] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v78, types: [X.01U] */
    /* JADX WARN: Type inference failed for: r0v82, types: [X.01U] */
    /* JADX WARN: Type inference failed for: r11v13, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.AbstractCollection, java.util.List, java.util.AbstractList] */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.util.AbstractCollection, X.01U] */
    /* JADX WARN: Type inference failed for: r14v26, types: [X.01U] */
    /* JADX WARN: Type inference failed for: r1v114, types: [X.01U, X.04D] */
    /* JADX WARN: Type inference failed for: r1v23, types: [X.01U] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v30, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C28837Co7 A02(X.CUT r50, int[] r51, int[] r52, int r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28429Cgc.A02(X.CUT, int[], int[], int, boolean):X.Co7");
    }
}
