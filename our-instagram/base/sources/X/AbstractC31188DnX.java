package X;

import java.util.Arrays;

/* renamed from: X.DnX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31188DnX {
    public static byte[] A00 = {126, Byte.MAX_VALUE, -112, -125, 125, Byte.MAX_VALUE, 121, -125, 126, -112, -126, -112, -112, -122, -116, -117, 124, -122, -127, -111, -113, -127, -114, -118, 125, -119, -127};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(9, 10, 13);
    }

    public static String A01() {
        return A02(19, 8, 12);
    }
}
