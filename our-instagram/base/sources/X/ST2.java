package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class ST2 {
    public static byte[] A00 = {34, 20, 34, 34, 24, 30, 29, 14, 24, 19, 70, 73, 65, 49, 56, 51, 53, 70, 65, 68, 49, 59, 54, 55, 64, 70, 59, 56, 59, 55, 68, 56, 54, 40, 53, 49, 36, 48, 40};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }
}
