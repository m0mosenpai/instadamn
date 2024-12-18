package X;

import java.util.Arrays;

/* renamed from: X.Sc5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63082Sc5 {
    public static byte[] A00 = {-44, -43, -26, -39, -45, -43, -49, -39, -44, -19, -33, -19, -19, -29, -23, -24, -39, -29, -34, -124, -126, 116, -127, 125, 112, 124, 116};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 108);
    }
}
