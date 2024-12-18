package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.188, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass188 {
    public static final String A00 = String.valueOf(Integer.MIN_VALUE);
    public static final String A01 = String.valueOf(Long.MIN_VALUE);
    public static final int[] A02;
    public static final String[] A03;
    public static final String[] A04;

    static {
        int[] iArr = new int[1000];
        A02 = iArr;
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = 0;
            do {
                int i4 = 0;
                do {
                    iArr[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                } while (i4 < 10);
                i3++;
            } while (i3 < 10);
        }
        A03 = new String[]{"0", RealtimeSubscription.GRAPHQL_MQTT_VERSION, "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        A04 = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    public static int A00(int i, char[] cArr, int i2) {
        int i3;
        int[] iArr;
        int i4;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = A00;
                int length = str.length();
                str.getChars(0, length, cArr, i2);
                return i2 + length;
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i < 1000) {
                if (i < 10) {
                    cArr[i2] = (char) (i + 48);
                    return i2 + 1;
                }
                return A01(i, cArr, i2);
            }
            int i5 = i / 1000;
            i3 = i - (i5 * 1000);
            i4 = A01(i5, cArr, i2);
            iArr = A02;
        } else {
            if (i >= 1000000000) {
                int i6 = i - 1000000000;
                int i7 = i2 + 1;
                char c = '1';
                if (i6 >= 1000000000) {
                    i6 -= 1000000000;
                    c = '2';
                }
                cArr[i2] = c;
                return A02(i6, cArr, i7);
            }
            int i8 = i / 1000;
            i3 = i - (i8 * 1000);
            int i9 = i8 / 1000;
            int i10 = i8 - (i9 * 1000);
            int A012 = A01(i9, cArr, i2);
            iArr = A02;
            int i11 = iArr[i10];
            int i12 = A012 + 1;
            cArr[A012] = (char) (i11 >> 16);
            int i13 = i12 + 1;
            cArr[i12] = (char) ((i11 >> 8) & StringTreeSet.MAX_SYMBOL_COUNT);
            i4 = i13 + 1;
            cArr[i13] = (char) (i11 & StringTreeSet.MAX_SYMBOL_COUNT);
        }
        int i14 = iArr[i3];
        int i15 = i4 + 1;
        cArr[i4] = (char) (i14 >> 16);
        int i16 = i15 + 1;
        cArr[i15] = (char) ((i14 >> 8) & StringTreeSet.MAX_SYMBOL_COUNT);
        int i17 = i16 + 1;
        cArr[i16] = (char) (i14 & StringTreeSet.MAX_SYMBOL_COUNT);
        return i17;
    }

    public static int A01(int i, char[] cArr, int i2) {
        int i3 = A02[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & StringTreeSet.MAX_SYMBOL_COUNT);
            i2++;
        }
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 & StringTreeSet.MAX_SYMBOL_COUNT);
        return i4;
    }

    public static int A02(int i, char[] cArr, int i2) {
        int i3 = i / 1000;
        int i4 = i3 / 1000;
        int[] iArr = A02;
        int i5 = iArr[i4];
        int i6 = i2 + 1;
        cArr[i2] = (char) (i5 >> 16);
        int i7 = i6 + 1;
        cArr[i6] = (char) ((i5 >> 8) & StringTreeSet.MAX_SYMBOL_COUNT);
        int i8 = i7 + 1;
        cArr[i7] = (char) (i5 & StringTreeSet.MAX_SYMBOL_COUNT);
        int i9 = iArr[i3 - (i4 * 1000)];
        int i10 = i8 + 1;
        cArr[i8] = (char) (i9 >> 16);
        int i11 = i10 + 1;
        cArr[i10] = (char) ((i9 >> 8) & StringTreeSet.MAX_SYMBOL_COUNT);
        int i12 = i11 + 1;
        cArr[i11] = (char) (i9 & StringTreeSet.MAX_SYMBOL_COUNT);
        int i13 = iArr[i - (i3 * 1000)];
        int i14 = i12 + 1;
        cArr[i12] = (char) (i13 >> 16);
        int i15 = i14 + 1;
        cArr[i14] = (char) ((i13 >> 8) & StringTreeSet.MAX_SYMBOL_COUNT);
        int i16 = i15 + 1;
        cArr[i15] = (char) (i13 & StringTreeSet.MAX_SYMBOL_COUNT);
        return i16;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = A00;
                int length = str.length();
                int i3 = 0;
                while (i3 < length) {
                    bArr[i2] = (byte) str.charAt(i3);
                    i3++;
                    i2++;
                }
                return i2;
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i < 1000) {
                if (i < 10) {
                    int i4 = i2 + 1;
                    bArr[i2] = (byte) (i + 48);
                    return i4;
                }
                return A04(bArr, i, i2);
            }
            int i5 = i / 1000;
            int i6 = i - (i5 * 1000);
            int A042 = A04(bArr, i5, i2);
            int i7 = A02[i6];
            int i8 = A042 + 1;
            bArr[A042] = (byte) (i7 >> 16);
            int i9 = i8 + 1;
            bArr[i8] = (byte) (i7 >> 8);
            int i10 = i9 + 1;
            bArr[i9] = (byte) i7;
            return i10;
        }
        if (i >= 1000000000) {
            int i11 = i - 1000000000;
            int i12 = i2 + 1;
            byte b = 49;
            if (i11 >= 1000000000) {
                i11 -= 1000000000;
                b = 50;
            }
            bArr[i2] = b;
            return A05(bArr, i11, i12);
        }
        int i13 = i / 1000;
        int i14 = i - (i13 * 1000);
        int i15 = i13 / 1000;
        int A043 = A04(bArr, i15, i2);
        int[] iArr = A02;
        int i16 = iArr[i13 - (i15 * 1000)];
        int i17 = A043 + 1;
        bArr[A043] = (byte) (i16 >> 16);
        int i18 = i17 + 1;
        bArr[i17] = (byte) (i16 >> 8);
        int i19 = i18 + 1;
        bArr[i18] = (byte) i16;
        int i20 = iArr[i14];
        int i21 = i19 + 1;
        bArr[i19] = (byte) (i20 >> 16);
        int i22 = i21 + 1;
        bArr[i21] = (byte) (i20 >> 8);
        int i23 = i22 + 1;
        bArr[i22] = (byte) i20;
        return i23;
    }

    public static int A04(byte[] bArr, int i, int i2) {
        int i3 = A02[i];
        if (i > 9) {
            if (i > 99) {
                bArr[i2] = (byte) (i3 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i3 >> 8);
            i2++;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) i3;
        return i4;
    }

    public static int A05(byte[] bArr, int i, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int i6 = i3 - (i5 * 1000);
        int[] iArr = A02;
        int i7 = iArr[i5];
        int i8 = i2 + 1;
        bArr[i2] = (byte) (i7 >> 16);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) i7;
        int i11 = iArr[i6];
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) i11;
        int i15 = iArr[i4];
        int i16 = i14 + 1;
        bArr[i14] = (byte) (i15 >> 16);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (i15 >> 8);
        int i18 = i17 + 1;
        bArr[i17] = (byte) i15;
        return i18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x002e, code lost:
    
        if (r10 <= 2147483647L) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A06(byte[] r8, int r9, long r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass188.A06(byte[], int, long):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0024, code lost:
    
        if (r10 <= 2147483647L) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A07(char[] r8, int r9, long r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass188.A07(char[], int, long):int");
    }

    public static String A08(int i) {
        String[] strArr = A03;
        if (i < 11) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            String[] strArr2 = A04;
            if (i2 < 10) {
                return strArr2[i2];
            }
        }
        return Integer.toString(i);
    }
}
