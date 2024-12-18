package X;

import java.util.Arrays;

/* renamed from: X.MSi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50529MSi {
    public static byte[] A00 = {78, 79, 92, 67, 73, 79, 117, 67, 78, 109, 123, 109, 109, 119, 113, 112, 65, 119, 122, 123, 125, 107, 124, 96, 111, 99, 107};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(19, 8, 58);
    }

    public static String A01() {
        return A02(9, 10, 42);
    }
}
