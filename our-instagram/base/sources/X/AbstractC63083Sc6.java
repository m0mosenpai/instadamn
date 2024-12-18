package X;

import java.util.Arrays;

/* renamed from: X.Sc6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63083Sc6 {
    public static byte[] A00 = {74, 75, 88, 71, 77, 75, 113, 71, 74, 64, 88, 95, 94, 85, 111, 94, 69, 93, 82, 85, 66, 11, 29, 11, 11, 17, 23, 22, 39, 17, 28, 60, 58, 44, 59, 39, 40, 36, 44};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(21, 10, 36);
    }
}
