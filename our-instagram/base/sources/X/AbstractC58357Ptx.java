package X;

import java.util.Arrays;

/* renamed from: X.Ptx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58357Ptx {
    public static byte[] A00 = {-23, -37, -23, -23, -33, -27, -28, -43, -33, -38, 26, 24, 10, 23, 19, 6, 18, 10};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(10, 8, 53);
    }
}
