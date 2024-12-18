package X;

import java.util.Arrays;

/* renamed from: X.Dnh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31198Dnh {
    public static byte[] A00 = {60, 61, 46, 49, 59, 61, 7, 49, 60, 83, 69, 83, 83, 73, 79, 78, Byte.MAX_VALUE, 73, 68, 75, 77, 91, 76, 80, 95, 83, 91};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(9, 10, 109);
    }

    public static String A01() {
        return A02(19, 8, 115);
    }
}
