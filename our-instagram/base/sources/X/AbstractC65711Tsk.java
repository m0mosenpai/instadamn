package X;

import java.util.Arrays;

/* renamed from: X.Tsk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65711Tsk {
    public static byte[] A00 = {20, 12, 11, 10, 1, 59, 10, 17, 9, 6, 1, 22, 120, 110, 120, 120, 98, 100, 101, 84, 98, 111, 19, 21, 3, 20, 8, 7, 11, 3};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(12, 10, 28);
    }
}
