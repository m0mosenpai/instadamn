package X;

import java.util.Arrays;

/* renamed from: X.Ptm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58346Ptm {
    public static byte[] A00 = {-45, -44, -27, -40, -46, -44, -50, -40, -45, -69, -83, -69, -69, -79, -73, -74, -89, -79, -84, -8, -10, -24, -11, -15, -28, -16, -24};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 62);
    }
}
