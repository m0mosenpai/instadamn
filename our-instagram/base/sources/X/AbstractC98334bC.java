package X;

import android.util.Pair;
import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.4bC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC98334bC {
    public static final byte[] A00 = "OpusHead".getBytes(AbstractC50482Ts.A05);

    public static Pair A00(C97974ac c97974ac, int i, int i2) {
        int i3;
        int i4;
        int i5 = c97974ac.A01;
        while (i5 - i < i2) {
            c97974ac.A0G(i5);
            int A01 = c97974ac.A01();
            boolean z = false;
            if (A01 > 0) {
                z = true;
            }
            AbstractC98354bE.A00(z, "childAtomSize must be positive");
            if (c97974ac.A01() == 1936289382) {
                int i6 = i5 + 8;
                C98344bD c98344bD = null;
                boolean z2 = false;
                String str = null;
                Integer num = null;
                int i7 = -1;
                int i8 = 0;
                while (i6 - i5 < A01) {
                    c97974ac.A0G(i6);
                    int A012 = c97974ac.A01();
                    int A013 = c97974ac.A01();
                    if (A013 == 1718775137) {
                        num = Integer.valueOf(c97974ac.A01());
                    } else if (A013 == 1935894637) {
                        c97974ac.A0H(4);
                        str = new String(c97974ac.A02, c97974ac.A01, 4, AbstractC50482Ts.A05);
                        c97974ac.A01 += 4;
                    } else if (A013 == 1935894633) {
                        i7 = i6;
                        i8 = A012;
                    }
                    i6 += A012;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    boolean z3 = false;
                    if (num != null) {
                        z3 = true;
                    }
                    AbstractC98354bE.A00(z3, AbstractC111324zv.A00(2406));
                    boolean z4 = false;
                    if (i7 != -1) {
                        z4 = true;
                    }
                    AbstractC98354bE.A00(z4, AbstractC111324zv.A00(3045));
                    int i9 = i7 + 8;
                    while (true) {
                        byte[] bArr = null;
                        if (i9 - i7 >= i8) {
                            break;
                        }
                        c97974ac.A0G(i9);
                        int A014 = c97974ac.A01();
                        if (c97974ac.A01() == 1952804451) {
                            int A015 = (c97974ac.A01() >> 24) & 255;
                            c97974ac.A0H(1);
                            if (A015 == 0) {
                                c97974ac.A0H(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int A02 = c97974ac.A02();
                                i3 = (A02 & 240) >> 4;
                                i4 = A02 & 15;
                            }
                            int A022 = c97974ac.A02();
                            boolean z5 = false;
                            if (A022 == 1) {
                                z5 = true;
                            }
                            int A023 = c97974ac.A02();
                            byte[] bArr2 = new byte[16];
                            c97974ac.A0J(bArr2, 0, 16);
                            if (z5 && A023 == 0) {
                                int A024 = c97974ac.A02();
                                bArr = new byte[A024];
                                c97974ac.A0J(bArr, 0, A024);
                            }
                            c98344bD = new C98344bD(str, bArr2, bArr, A023, i3, i4, z5);
                            z2 = true;
                        } else {
                            i9 += A014;
                        }
                    }
                    AbstractC98354bE.A00(z2, AbstractC111324zv.A00(3220));
                    Pair create = Pair.create(num, c98344bD);
                    if (create != null) {
                        return create;
                    }
                }
            }
            i5 += A01;
        }
        return null;
    }

    public static C127515pU A01(C97974ac c97974ac, int i) {
        c97974ac.A0G(i + 8 + 4);
        c97974ac.A0H(1);
        do {
        } while ((c97974ac.A02() & 128) == 128);
        c97974ac.A0H(2);
        int A02 = c97974ac.A02();
        if ((A02 & 128) != 0) {
            c97974ac.A0H(2);
        }
        if ((A02 & 64) != 0) {
            c97974ac.A0H(c97974ac.A02());
        }
        if ((A02 & 32) != 0) {
            c97974ac.A0H(2);
        }
        c97974ac.A0H(1);
        do {
        } while ((c97974ac.A02() & 128) == 128);
        String A01 = C2IH.A01(c97974ac.A02());
        if (!"audio/mpeg".equals(A01) && !"audio/vnd.dts".equals(A01) && !"audio/vnd.dts.hd".equals(A01)) {
            c97974ac.A0H(4);
            long A07 = c97974ac.A07();
            long A072 = c97974ac.A07();
            c97974ac.A0H(1);
            int A022 = c97974ac.A02();
            int i2 = A022 & StringTreeSet.MAX_SYMBOL_COUNT;
            while ((A022 & 128) == 128) {
                A022 = c97974ac.A02();
                i2 = (i2 << 7) | (A022 & StringTreeSet.MAX_SYMBOL_COUNT);
            }
            byte[] bArr = new byte[i2];
            c97974ac.A0J(bArr, 0, i2);
            long j = -1;
            if (A072 <= 0) {
                A072 = -1;
            }
            if (A07 > 0) {
                j = A07;
            }
            return new C127515pU(A01, bArr, A072, j);
        }
        return new C127515pU(A01, null, -1L, -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022f A[ADDED_TO_REGION, LOOP:12: B:180:0x022f->B:190:0x03e7, LOOP_START, PHI: r6 r9 r12 r19 r28 r31
      0x022f: PHI (r6v6 int) = (r6v2 int), (r6v7 int) binds: [B:179:0x022d, B:190:0x03e7] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:179:0x022d, B:190:0x03e7] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r12v3 int) = (r12v1 int), (r12v6 int) binds: [B:179:0x022d, B:190:0x03e7] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r19v2 long) = (r19v1 long), (r19v5 long) binds: [B:179:0x022d, B:190:0x03e7] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r28v2 int) = (r28v1 int), (r28v3 int) binds: [B:179:0x022d, B:190:0x03e7] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r31v2 int) = (r31v1 int), (r31v3 int) binds: [B:179:0x022d, B:190:0x03e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0261 A[ADDED_TO_REGION, LOOP:13: B:199:0x0261->B:202:0x03c2, LOOP_START, PHI: r30
      0x0261: PHI (r30v3 int) = (r30v2 int), (r30v4 int) binds: [B:198:0x025f, B:202:0x03c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x025b A[EDGE_INSN: B:245:0x025b->B:197:0x025b BREAK  A[LOOP:11: B:178:0x0229->B:242:0x0446], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A03(com.google.android.exoplayer2.drm.DrmInitData r51, X.C58603PyW r52, X.C98294b8 r53, X.C2n2 r54, long r55, boolean r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC98334bC.A03(com.google.android.exoplayer2.drm.DrmInitData, X.PyW, X.4b8, X.2n2, long, boolean, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:518:0x0b07, code lost:
    
        if (r14 != 1) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0c92, code lost:
    
        if ((r5.A02() & 128) == 0) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x08c1, code lost:
    
        if (r1 != null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x08f1, code lost:
    
        if (r36 <= 0) goto L387;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0db7  */
    /* JADX WARN: Type inference failed for: r0v178, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.4bD[]] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v64, types: [com.google.common.collect.ImmutableList] */
    /* JADX WARN: Type inference failed for: r2v70, types: [com.google.common.collect.ImmutableList] */
    /* JADX WARN: Type inference failed for: r2v72, types: [com.google.common.collect.ImmutableList] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v77, types: [com.google.common.collect.ImmutableList] */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, X.4bF] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, X.4bF] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, X.4bF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C98394bI A02(com.google.android.exoplayer2.drm.DrmInitData r57, X.C98294b8 r58, X.C98314bA r59, long r60, boolean r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 3555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC98334bC.A02(com.google.android.exoplayer2.drm.DrmInitData, X.4b8, X.4bA, long, boolean, boolean):X.4bI");
    }
}
