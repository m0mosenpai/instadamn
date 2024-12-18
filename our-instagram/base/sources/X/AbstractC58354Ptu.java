package X;

import java.util.Arrays;

/* renamed from: X.Ptu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58354Ptu {
    public static byte[] A00 = {8, 9, 26, 5, 15, 9, 51, 5, 8, 102, 112, 102, 102, 124, 122, 123, 74, 124, 113, 108, 106, 121, 118, 107, 104, 121, 106, 125, 118, 123, 97};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 37);
    }
}
