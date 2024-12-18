package X;

import java.util.Arrays;

/* renamed from: X.Dnb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31192Dnb {
    public static byte[] A00 = {52, 64, 64, 60, 63, 6, -5, -5, 60, 62, 53, 66, 45, 47, 69, 47, 49, 58, 64, 49, 62, -6, 53, 58, 63, 64, 45, 51, 62, 45, 57, -6, 47, 59, 57, -5, 60, 59, 56, 53, 47, 69, 3, -11, 3, 3, -7, -1, -2, -17, -7, -12, 48, 46, 32, 45, 41, 28, 40, 32};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }
}
