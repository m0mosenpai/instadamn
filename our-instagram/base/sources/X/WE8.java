package X;

import android.util.Pair;
import com.facebook.common.dextricks.StringTreeSet;

/* loaded from: classes11.dex */
public abstract class WE8 {
    public static final byte[] A00 = "OpusHead".getBytes(AbstractC50482Ts.A05);

    public static Pair A00(WFa wFa, int i, int i2) {
        int i3;
        int i4;
        int i5 = wFa.A01;
        while (i5 - i < i2) {
            wFa.A0O(i5);
            int A01 = wFa.A01();
            AbstractC68263VKa.A00(AbstractC167007dF.A1O(A01), AbstractC111324zv.A00(2045));
            if (wFa.A01() == 1936289382) {
                int i6 = i5 + 8;
                C69262VkW c69262VkW = null;
                boolean z = false;
                String str = null;
                Integer num = null;
                int i7 = -1;
                int i8 = 0;
                while (i6 - i5 < A01) {
                    wFa.A0O(i6);
                    int A012 = wFa.A01();
                    int A013 = wFa.A01();
                    if (A013 == 1718775137) {
                        num = Integer.valueOf(wFa.A01());
                    } else if (A013 == 1935894637) {
                        wFa.A0P(4);
                        str = wFa.A0I(AbstractC50482Ts.A05, 4);
                    } else if (A013 == 1935894633) {
                        i7 = i6;
                        i8 = A012;
                    }
                    i6 += A012;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    AbstractC68263VKa.A00(AbstractC167007dF.A1W(num), AbstractC111324zv.A00(2406));
                    AbstractC68263VKa.A00(MSY.A1S(i7, -1), AbstractC111324zv.A00(3045));
                    int i9 = i7 + 8;
                    while (true) {
                        byte[] bArr = null;
                        if (i9 - i7 >= i8) {
                            break;
                        }
                        wFa.A0O(i9);
                        int A014 = wFa.A01();
                        if (wFa.A01() == 1952804451) {
                            int A015 = (wFa.A01() >> 24) & 255;
                            wFa.A0P(1);
                            if (A015 == 0) {
                                wFa.A0P(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int A05 = wFa.A05();
                                i3 = (A05 & 240) >> 4;
                                i4 = A05 & 15;
                            }
                            boolean A1P = AbstractC167007dF.A1P(wFa.A05(), 1);
                            int A052 = wFa.A05();
                            byte[] bArr2 = new byte[16];
                            wFa.A0R(bArr2, 0, 16);
                            if (A1P && A052 == 0) {
                                int A053 = wFa.A05();
                                bArr = new byte[A053];
                                wFa.A0R(bArr, 0, A053);
                            }
                            c69262VkW = new C69262VkW(str, bArr2, bArr, A052, i3, i4, A1P);
                            z = true;
                        } else {
                            i9 += A014;
                        }
                    }
                    AbstractC68263VKa.A00(z, AbstractC111324zv.A00(3220));
                    Pair create = Pair.create(num, c69262VkW);
                    if (create != null) {
                        return create;
                    }
                }
            }
            i5 += A01;
        }
        return null;
    }

    public static C69183VjC A01(WFa wFa, int i) {
        String str;
        wFa.A0O(i + 8 + 4);
        wFa.A0P(1);
        do {
        } while ((wFa.A05() & 128) == 128);
        wFa.A0P(2);
        int A05 = wFa.A05();
        if ((A05 & 128) != 0) {
            wFa.A0P(2);
        }
        if ((A05 & 64) != 0) {
            wFa.A0P(wFa.A05());
        }
        if ((A05 & 32) != 0) {
            wFa.A0P(2);
        }
        wFa.A0P(1);
        do {
        } while ((wFa.A05() & 128) == 128);
        int A052 = wFa.A05();
        if (A052 != 32) {
            if (A052 != 33) {
                if (A052 != 35) {
                    if (A052 != 64) {
                        if (A052 != 163) {
                            if (A052 != 177) {
                                if (A052 != 221) {
                                    if (A052 != 165) {
                                        if (A052 != 166) {
                                            switch (A052) {
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                    str = "video/mpeg2";
                                                    break;
                                                case 102:
                                                case 103:
                                                case 104:
                                                    break;
                                                case 105:
                                                case 107:
                                                    str = "audio/mpeg";
                                                    break;
                                                case 106:
                                                    str = "video/mpeg";
                                                    break;
                                                case 108:
                                                    str = "image/jpeg";
                                                    break;
                                                default:
                                                    switch (A052) {
                                                        case 169:
                                                        case 172:
                                                            str = "audio/vnd.dts";
                                                            break;
                                                        case AbstractC62862SUj.MAX_FACTORIAL /* 170 */:
                                                        case 171:
                                                            str = "audio/vnd.dts.hd";
                                                            break;
                                                        case 173:
                                                            str = "audio/opus";
                                                            break;
                                                        case 174:
                                                            str = "audio/ac4";
                                                            break;
                                                        default:
                                                            str = null;
                                                            break;
                                                    }
                                            }
                                        } else {
                                            str = "audio/eac3";
                                        }
                                    } else {
                                        str = "audio/ac3";
                                    }
                                } else {
                                    str = "audio/vorbis";
                                }
                            } else {
                                str = "video/x-vnd.on2.vp9";
                            }
                        } else {
                            str = "video/wvc1";
                        }
                    }
                    str = "audio/mp4a-latm";
                } else {
                    str = "video/hevc";
                }
            } else {
                str = "video/avc";
            }
        } else {
            str = "video/mp4v-es";
        }
        if (!"audio/mpeg".equals(str) && !"audio/vnd.dts".equals(str) && !"audio/vnd.dts.hd".equals(str)) {
            wFa.A0P(4);
            long A0C = wFa.A0C();
            long A0C2 = wFa.A0C();
            wFa.A0P(1);
            int A053 = wFa.A05();
            int i2 = A053 & StringTreeSet.MAX_SYMBOL_COUNT;
            while ((A053 & 128) == 128) {
                A053 = wFa.A05();
                i2 = (i2 << 7) | (A053 & StringTreeSet.MAX_SYMBOL_COUNT);
            }
            byte[] bArr = new byte[i2];
            wFa.A0R(bArr, 0, i2);
            long j = -1;
            if (A0C2 <= 0) {
                A0C2 = -1;
            }
            if (A0C > 0) {
                j = A0C;
            }
            return new C69183VjC(str, bArr, A0C2, j);
        }
        return new C69183VjC(str, null, -1L, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:379:0x07d1, code lost:
    
        if (r6 == (-1)) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0865, code lost:
    
        if (r4 != 32) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0c27, code lost:
    
        if (r11 != 1) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0c2e, code lost:
    
        if (r11 == false) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0db2, code lost:
    
        if ((r2.A05() & 128) == 0) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x09df, code lost:
    
        if (r46 <= 0) goto L422;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0eae  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x120d  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x1221  */
    /* JADX WARN: Removed duplicated region for block: B:903:0x10c8 A[ADDED_TO_REGION, LOOP:22: B:903:0x10c8->B:913:0x1197, LOOP_START, PHI: r4 r6 r13 r19 r23 r28
      0x10c8: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:902:0x10c6, B:913:0x1197] A[DONT_GENERATE, DONT_INLINE]
      0x10c8: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:902:0x10c6, B:913:0x1197] A[DONT_GENERATE, DONT_INLINE]
      0x10c8: PHI (r13v3 int) = (r13v1 int), (r13v6 int) binds: [B:902:0x10c6, B:913:0x1197] A[DONT_GENERATE, DONT_INLINE]
      0x10c8: PHI (r19v2 long) = (r19v1 long), (r19v5 long) binds: [B:902:0x10c6, B:913:0x1197] A[DONT_GENERATE, DONT_INLINE]
      0x10c8: PHI (r23v2 int) = (r23v1 int), (r23v3 int) binds: [B:902:0x10c6, B:913:0x1197] A[DONT_GENERATE, DONT_INLINE]
      0x10c8: PHI (r28v2 int) = (r28v1 int), (r28v3 int) binds: [B:902:0x10c6, B:913:0x1197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:922:0x10fa A[ADDED_TO_REGION, LOOP:23: B:922:0x10fa->B:925:0x1174, LOOP_START, PHI: r27
      0x10fa: PHI (r27v3 int) = (r27v2 int), (r27v4 int) binds: [B:921:0x10f8, B:925:0x1174] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:936:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:938:0x1171  */
    /* JADX WARN: Removed duplicated region for block: B:965:0x10f4 A[EDGE_INSN: B:965:0x10f4->B:920:0x10f4 BREAK  A[LOOP:21: B:901:0x10c2->B:962:0x11f6], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v210, types: [X.VkW[]] */
    /* JADX WARN: Type inference failed for: r0v327, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v336, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A02(androidx.media3.common.DrmInitData r67, X.SYO r68, X.C66409UFu r69, X.C2n2 r70, long r71, boolean r73, boolean r74) {
        /*
            Method dump skipped, instructions count: 5191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WE8.A02(androidx.media3.common.DrmInitData, X.SYO, X.UFu, X.2n2, long, boolean, boolean):java.util.ArrayList");
    }
}
