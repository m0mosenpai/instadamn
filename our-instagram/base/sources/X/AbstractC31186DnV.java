package X;

import java.util.Arrays;

/* renamed from: X.DnV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31186DnV {
    public static byte[] A00 = {-33, -32, -15, -28, -34, -32, -38, -28, -33, -71, -79, -72, -73, -82, -88, -73, -66, -74, -85, -82, -69, -11, -25, -11, -11, -21, -15, -16, -31, -21, -26, -22, -24, -38, -25, -29, -42, -30, -38, 0, -17, -4, -13, -16, -13, -19, -21, -2, -13, -7, -8, -23, -19, -7, -18, -17};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 31);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(31, 8, 86);
    }
}
