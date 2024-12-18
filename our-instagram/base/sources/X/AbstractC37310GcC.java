package X;

import java.util.Arrays;

/* renamed from: X.GcC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37310GcC {
    public static byte[] A00 = {2, 20, 2, 2, 24, 30, 31, 46, 24, 21, 19, 8, 19, 23, 56, 20, 2, 2, 3, 56, 14, 3, 73, 79, 89, 78, 82, 93, 81, 89};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(22, 8, 54);
    }
}
