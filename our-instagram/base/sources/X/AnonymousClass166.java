package X;

import com.facebook.common.dextricks.Constants;
import java.util.Arrays;

/* renamed from: X.166, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass166 {
    public static final char[] A02 = AnonymousClass167.A01();
    public static final byte[] A01 = AnonymousClass167.A00();
    public static final AnonymousClass166 A00 = new Object();

    public static int A00(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + Constants.LOAD_RESULT_PGO_ATTEMPTED + (i2 - 56320);
        }
        throw new IllegalArgumentException(AnonymousClass001.A11("Broken surrogate pair: first char 0x", Integer.toHexString(i), ", second 0x", Integer.toHexString(i2), "; illegal combination"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0101, code lost:
    
        throw new java.lang.IllegalArgumentException(X.AbstractC61055ReU.A00(r3));
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] A01(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass166.A01(java.lang.String):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] A02(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass166.A02(java.lang.String):byte[]");
    }

    public final char[] A03(String str) {
        int i;
        int length = str.length();
        char[] cArr = new char[Math.min(Math.max(16, length + Math.min((length >> 3) + 6, 1000)), 32000)];
        int[] iArr = AnonymousClass167.A07;
        C16O c16o = null;
        char[] cArr2 = null;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i2 < length) {
            do {
                char charAt = str.charAt(i2);
                if (charAt < 128 && iArr[charAt] != 0) {
                    if (cArr2 == null) {
                        cArr2 = new char[]{'\\', 0, '0', '0'};
                    }
                    int i4 = i2 + 1;
                    char charAt2 = str.charAt(i2);
                    int i5 = iArr[charAt2];
                    if (i5 < 0) {
                        cArr2[1] = 'u';
                        char[] cArr3 = A02;
                        cArr2[4] = cArr3[charAt2 >> 4];
                        cArr2[5] = cArr3[charAt2 & 15];
                        i = 6;
                    } else {
                        cArr2[1] = (char) i5;
                        i = 2;
                    }
                    int i6 = i3 + i;
                    int length2 = cArr.length;
                    if (i6 > length2) {
                        int i7 = length2 - i3;
                        if (i7 > 0) {
                            System.arraycopy(cArr2, 0, cArr, i3, i7);
                        }
                        if (c16o == null) {
                            c16o = new C16O(cArr);
                        }
                        cArr = c16o.A0D();
                        int i8 = i - i7;
                        System.arraycopy(cArr2, i7, cArr, 0, i8);
                        i3 = i8;
                    } else {
                        System.arraycopy(cArr2, 0, cArr, i3, i);
                        i3 = i6;
                    }
                    i2 = i4;
                } else {
                    if (i3 >= cArr.length) {
                        if (c16o == null) {
                            c16o = new C16O(cArr);
                        }
                        cArr = c16o.A0D();
                        i3 = 0;
                    }
                    cArr[i3] = charAt;
                    i2++;
                    i3++;
                }
            } while (i2 < length);
        }
        if (c16o == null) {
            return Arrays.copyOfRange(cArr, 0, i3);
        }
        c16o.A00 = i3;
        return c16o.A0B();
    }
}
