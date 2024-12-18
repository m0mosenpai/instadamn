package X;

/* renamed from: X.SiA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63353SiA {
    public static final SZS A00;

    public static /* bridge */ /* synthetic */ int A02(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    byte b2 = bArr[i];
                    byte b3 = bArr[i + 1];
                    if (b <= -12 && b2 <= -65 && b3 <= -65) {
                        return (b3 << 16) ^ ((b2 << 8) ^ b);
                    }
                    return -1;
                }
                throw AbstractC58318PtA.A0V();
            }
            byte b4 = bArr[i];
            if (b <= -12 && b4 <= -65) {
                return (b4 << 8) ^ b;
            }
            return -1;
        }
        if (b <= -12) {
            return b;
        }
        return -1;
    }

    public static boolean A03(byte[] bArr) {
        return A00.A01(bArr, 0, bArr.length);
    }

    public static boolean A04(byte[] bArr, int i, int i2) {
        return A00.A01(bArr, i, i2);
    }

    static {
        C63409Sjj.A0P();
        A00 = new SZS();
    }

    public static int A00(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                while (i2 < length) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new RkM(i2, length);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw AbstractC58319PtB.A0h("UTF-8 length does not fit in int: ", i3 + 4294967296L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0037, code lost:
    
        if (r10 < 2048) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(java.lang.String r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63353SiA.A01(java.lang.String, byte[], int, int):int");
    }
}
