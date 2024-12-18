package X;

import java.util.Arrays;

/* renamed from: X.Pu1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58361Pu1 {
    public static byte[] A00 = {-75, -74, -57, -70, -76, -74, -80, -70, -75, -35, -49, -35, -35, -45, -39, -40, -55, -45, -50, 5, 3, -11, 2, -2, -15, -3, -11};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 43);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 63);
    }
}
