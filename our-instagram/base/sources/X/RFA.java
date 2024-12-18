package X;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class RFA extends C4YT {
    public final InterfaceC65402TjZ A00;

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

    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.4ac] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.metadata.Metadata A07(byte[] r14, int r15) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RFA.A07(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0226, code lost:
    
        if (r10 == 3) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02c1, code lost:
    
        if (r9 == 3) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x030f, code lost:
    
        if (r14 == 3) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x025e, code lost:
    
        if (r9 == 67) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
    
        if (r14 == 3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x032d, code lost:
    
        if (r6 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        if (r15 == 3) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, X.4bF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame A01(X.InterfaceC65402TjZ r23, X.C97974ac r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RFA.A01(X.TjZ, X.4ac, int, int, boolean):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(X.C97974ac r12, int r13, int r14, boolean r15) {
        /*
            int r5 = r12.A01
            goto L7
        L3:
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L76
            r12.A0H(r0)     // Catch: java.lang.Throwable -> L76
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
            long r2 = r12.A07()     // Catch: java.lang.Throwable -> L76
            int r4 = r12.A05()     // Catch: java.lang.Throwable -> L76
            goto L2b
        L21:
            int r1 = r12.A03()     // Catch: java.lang.Throwable -> L76
            int r0 = r12.A03()     // Catch: java.lang.Throwable -> L76
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L76
            r4 = 0
        L2b:
            r9 = 0
            if (r1 != 0) goto L39
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L39
            if (r4 != 0) goto L39
        L35:
            r12.A0G(r5)
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
            r12.A0G(r5)
            return r11
        L76:
            r0 = move-exception
            r12.A0G(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RFA.A05(X.4ac, int, int, boolean):boolean");
    }

    public RFA(InterfaceC65402TjZ interfaceC65402TjZ) {
        this.A00 = interfaceC65402TjZ;
    }

    @Override // X.C4YT
    public final Metadata A06(C96304Uo c96304Uo, ByteBuffer byteBuffer) {
        return A07(byteBuffer.array(), byteBuffer.limit());
    }

    public RFA() {
        this(null);
    }
}
