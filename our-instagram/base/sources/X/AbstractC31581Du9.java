package X;

import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.Du9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31581Du9 {
    public static byte[] A00 = {53, 54, 71, 58, 52, 54, 48, 58, 53, -5, 5, -26, 9, 1, -40, -13, -11, -41, 0, -13, -12, -2, -9, -10, 47, PublicSuffixDatabase.EXCEPTION_MARKER, 47, 47, 37, 43, 42, 27, 37, 32, -10, -7, -15, -56, -29, -27, -50, -21, -11, -14, -5, -59, -29, -18, -18, -28, -29, -27, -19, -44, -25, -13, -9, -25, -11, -10, -33, -30, -38, -54, -47, -52, -50, -54, -34, -33, -52, -35, -33, -54, -34, -33, -52, -33, -48, -54, -39, -52, -40, -48, 42, 40, 26, 39, 35, 22, 34, 26};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 102);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(24, 10, 86);
    }

    public static String A01() {
        return A02(84, 8, 79);
    }
}
