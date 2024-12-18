package X;

import java.util.Arrays;

/* renamed from: X.Puo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58410Puo {
    public static byte[] A00 = {2, 3, 20, 7, 1, 3, -3, 7, 2, -39, -53, -39, -39, -49, -43, -44, -59, -49, -54, 23, 26, 18, 2, 9, 4, 6, 2, 22, 23, 4, 21, 23, 2, 22, 23, 4, 23, 8, 2, 17, 4, 16, 8, 27, 25, 11, 24, 20, 7, 19, 11};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 53);
    }
}
