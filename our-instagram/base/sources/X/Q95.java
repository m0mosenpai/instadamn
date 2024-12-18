package X;

import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class Q95 extends AbstractC61273Rkj {
    public static final InterfaceC71838X6v A01 = new InterfaceC71838X6v() { // from class: X.Sqy
    };
    public final InterfaceC71838X6v A00;

    public static int A00(byte[] bArr, int i, int i2) {
        int length;
        int i3 = i;
        while (true) {
            length = bArr.length;
            if (i3 < length) {
                if (bArr[i3] == 0) {
                    break;
                }
                i3++;
            } else {
                i3 = length;
                break;
            }
        }
        if (i2 == 0 || i2 == 3) {
            return i3;
        }
        while (i3 < length - 1) {
            if ((i3 - i) % 2 != 0 || bArr[i3 + 1] != 0) {
                while (true) {
                    i3++;
                    if (i3 < length) {
                        if (bArr[i3] == 0) {
                            break;
                        }
                    } else {
                        i3 = length;
                        break;
                    }
                }
            } else {
                return i3;
            }
        }
        return length;
    }

    public static ImmutableList A02(byte[] bArr, int i, int i2) {
        int i3;
        if (i2 < bArr.length) {
            ImmutableList.Builder builder = ImmutableList.builder();
            while (true) {
                int A00 = A00(bArr, i2, i);
                if (i2 >= A00) {
                    break;
                }
                builder.add((Object) AbstractC58318PtA.A0n(A04(i), bArr, i2, A00 - i2));
                if (i != 0) {
                    i3 = 2;
                    if (i != 3) {
                        i2 = i3 + A00;
                    }
                }
                i3 = 1;
                i2 = i3 + A00;
            }
            ImmutableList build = builder.build();
            if (!build.isEmpty()) {
                return build;
            }
        }
        return ImmutableList.of((Object) "");
    }

    public static String A03(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr;
        String str;
        Locale locale = Locale.US;
        if (i == 2) {
            objArr = AbstractC58320PtC.A1a(Integer.valueOf(i2), i3, i4);
            str = "%c%c%c";
        } else {
            objArr = new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            str = "%c%c%c%c";
        }
        return String.format(locale, str, objArr);
    }

    public static Charset A04(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return AbstractC50482Ts.A00;
                }
                return AbstractC50482Ts.A05;
            }
            return AbstractC50482Ts.A03;
        }
        return AbstractC50482Ts.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.WFa, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.common.Metadata A06(byte[] r14, int r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q95.A06(byte[], int):androidx.media3.common.Metadata");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x021c, code lost:
    
        if (r15 == 3) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02bd, code lost:
    
        if (r15 == 3) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x030a, code lost:
    
        if (r15 == 3) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0257, code lost:
    
        if (r4 == 67) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        if (r13 == 3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0496, code lost:
    
        if (r0 == null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0153, code lost:
    
        if (r14 == 3) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.metadata.id3.Id3Frame A01(X.WFa r25, X.InterfaceC71838X6v r26, int r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q95.A01(X.WFa, X.X6v, int, int, boolean):androidx.media3.extractor.metadata.id3.Id3Frame");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(X.WFa r12, int r13, int r14, boolean r15) {
        /*
            int r5 = r12.A01
            goto L7
        L3:
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L76
            r12.A0P(r0)     // Catch: java.lang.Throwable -> L76
        L7:
            int r6 = r12.A00     // Catch: java.lang.Throwable -> L76
            int r0 = r12.A01     // Catch: java.lang.Throwable -> L76
            int r0 = r6 - r0
            r8 = 1
            if (r0 < r14) goto L35
            r7 = 3
            r11 = 0
            if (r13 < r7) goto L21
            int r1 = r12.A01()     // Catch: java.lang.Throwable -> L76
            long r2 = r12.A0C()     // Catch: java.lang.Throwable -> L76
            int r4 = r12.A08()     // Catch: java.lang.Throwable -> L76
            goto L2b
        L21:
            int r1 = r12.A06()     // Catch: java.lang.Throwable -> L76
            int r0 = r12.A06()     // Catch: java.lang.Throwable -> L76
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L76
            r4 = 0
        L2b:
            r9 = 0
            if (r1 != 0) goto L39
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L39
            if (r4 != 0) goto L39
        L35:
            r12.A0O(r5)
            return r8
        L39:
            r0 = 4
            if (r13 != r0) goto L5c
            if (r15 != 0) goto L4a
            r7 = 8421504(0x808080, double:4.160776E-317)
            long r7 = r7 & r2
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L72
            long r2 = X.AbstractC58324PtG.A01(r2)
        L4a:
            r0 = r4 & 64
            boolean r1 = X.AbstractC167007dF.A1M(r0)
            r0 = r4 & 1
        L52:
            if (r0 == 0) goto L56
            int r1 = r1 + 4
        L56:
            long r0 = (long) r1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L72
            goto L69
        L5c:
            if (r13 != r7) goto L67
            r0 = r4 & 32
            boolean r1 = X.AbstractC167007dF.A1M(r0)
            r0 = r4 & 128(0x80, float:1.8E-43)
            goto L52
        L67:
            r1 = 0
            goto L56
        L69:
            int r0 = r12.A01     // Catch: java.lang.Throwable -> L76
            int r6 = r6 - r0
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L76
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L72
            goto L3
        L72:
            r12.A0O(r5)
            return r11
        L76:
            r0 = move-exception
            r12.A0O(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q95.A05(X.WFa, int, int, boolean):boolean");
    }

    public Q95(InterfaceC71838X6v interfaceC71838X6v) {
        this.A00 = interfaceC71838X6v;
    }

    public Q95() {
        this(null);
    }
}
