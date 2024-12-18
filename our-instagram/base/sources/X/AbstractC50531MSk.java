package X;

import java.util.Arrays;

/* renamed from: X.MSk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50531MSk {
    public static byte[] A00 = {107, 106, 121, 102, 108, 106, 80, 102, 107, 40, 62, 40, 40, 50, 52, 53, 116, 55, 52, 60, 50, 53, 4, 58, 56, 47, 50, 45, 50, 47, 34, 116, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, Byte.MAX_VALUE, 121, 111, 120, 100, 107, 103, 111};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(42, 8, 43);
    }

    public static String A01() {
        return A02(32, 10, 12);
    }
}
