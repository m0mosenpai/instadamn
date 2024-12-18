package X;

import java.util.Arrays;

/* renamed from: X.Pty, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58358Pty {
    public static byte[] A00 = {-61, -60, -43, -56, -62, -60, -66, -56, -61, -6, -20, -6, -6, -16, -10, -11, -26, -16, -21, -3, -5, -19, -6, -10, -23, -11, -19};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 27);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 108);
    }
}
