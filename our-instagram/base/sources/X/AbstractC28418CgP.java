package X;

/* renamed from: X.CgP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28418CgP {
    public static final int[] A00;

    public static final int A00(String str, C28209Cc7 c28209Cc7) {
        int i;
        AbstractC167007dF.A1K(str, c28209Cc7);
        int length = str.length();
        int i2 = 0;
        C0eC.A01(length, length);
        C28221CcR c28221CcR = c28209Cc7.A00;
        if (c28221CcR.A02) {
            A01(str, 0, length);
        } else {
            String str2 = c28221CcR.A00;
            boolean z = c28221CcR.A01;
            int i3 = 0;
            i2 = str2.length();
            int i4 = length - i2;
            int length2 = "".length();
            if (i4 <= length2) {
                throw new NumberFormatException(AnonymousClass001.A13("Expected a hexadecimal number with prefix \"", str2, "\" and suffix \"", "", "\", but was ", AbstractC25227BEk.A0w(str, 0, length)));
            }
            if (i2 != 0) {
                for (int i5 = 0; i5 < i2; i5++) {
                    if (!AbstractC131335wM.A02(str2.charAt(i5), str.charAt(i5), z)) {
                        A02(str, str2, "prefix", 0, length);
                        break;
                    }
                }
                i3 = i2;
            }
            int i6 = length - length2;
            if (length2 != 0) {
                for (int i7 = 0; i7 < length2; i7++) {
                    if (!AbstractC131335wM.A02("".charAt(i7), str.charAt(i6 + i7), z)) {
                        A02(str, "", "suffix", i6, length);
                        throw C00O.createAndThrow();
                    }
                }
            }
            A01(str, i3, i6);
            length = i6;
        }
        int i8 = 0;
        while (i2 < length) {
            int i9 = i8 << 4;
            char charAt = str.charAt(i2);
            if ((charAt >>> '\b') == 0 && (i = A00[charAt]) >= 0) {
                i8 = i9 | i;
                i2++;
            } else {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Expected a hexadecimal digit at index ");
                A1C.append(i2);
                A1C.append(", but was ");
                A1C.append(str.charAt(i2));
                throw new NumberFormatException(A1C.toString());
            }
        }
        return i8;
    }

    static {
        int length;
        int length2;
        for (int i = 0; i < 256; i++) {
            "0123456789abcdef".charAt(i >> 4);
            "0123456789abcdef".charAt(i & 15);
        }
        for (int i2 = 0; i2 < 256; i2++) {
            "0123456789ABCDEF".charAt(i2 >> 4);
            "0123456789ABCDEF".charAt(i2 & 15);
        }
        int[] iArr = new int[256];
        int i3 = 0;
        do {
            iArr[i3] = -1;
            i3++;
        } while (i3 < 256);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = "0123456789abcdef".length();
            if (i4 >= length) {
                break;
            }
            iArr["0123456789abcdef".charAt(i4)] = i5;
            i4++;
            i5++;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            length2 = "0123456789ABCDEF".length();
            if (i6 >= length2) {
                break;
            }
            iArr["0123456789ABCDEF".charAt(i6)] = i7;
            i6++;
            i7++;
        }
        A00 = iArr;
        int i8 = 0;
        do {
            i8++;
        } while (i8 < 256);
        for (int i9 = 0; i9 < length; i9++) {
            "0123456789abcdef".charAt(i9);
        }
        for (int i10 = 0; i10 < length2; i10++) {
            "0123456789ABCDEF".charAt(i10);
        }
    }

    public static final void A01(String str, int i, int i2) {
        if (i < i2 && i2 - i <= 8) {
            return;
        }
        String A0w = AbstractC25227BEk.A0w(str, i, i2);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Expected ");
        A1C.append("at most");
        A1C.append(' ');
        A1C.append(8);
        A1C.append(" hexadecimal digits at index ");
        A1C.append(i);
        A1C.append(", but was ");
        A1C.append(A0w);
        A1C.append(" of length ");
        A1C.append(i2 - i);
        throw new NumberFormatException(A1C.toString());
    }

    public static final void A02(String str, String str2, String str3, int i, int i2) {
        int A04 = AbstractC25226BEj.A04(str2, i);
        if (A04 > i2) {
            A04 = i2;
        }
        String A0w = AbstractC25227BEk.A0w(str, i, A04);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Expected ");
        A1C.append(str3);
        A1C.append(" \"");
        A1C.append(str2);
        A1C.append("\" at index ");
        A1C.append(i);
        A1C.append(", but was ");
        throw new NumberFormatException(AbstractC166997dE.A0x(A0w, A1C));
    }
}
