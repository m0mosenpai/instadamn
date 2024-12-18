package X;

import java.util.Arrays;

/* renamed from: X.DnW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31187DnW {
    public static byte[] A00 = {44, 45, 62, 49, 43, 45, 39, 49, 44, 44, 30, 44, 44, 34, 40, 39, 24, 34, 29, 10, 8, -6, 7, 3, -10, 2, -6};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(9, 10, 110);
    }

    public static String A01() {
        return A02(19, 8, 74);
    }
}
