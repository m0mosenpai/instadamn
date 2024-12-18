package X;

import java.util.Arrays;

/* renamed from: X.MWy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50637MWy {
    public static byte[] A00 = {-39, -53, -39, -39, -49, -43, -44, -59, -49, -54, 26, 24, 10, 23, 19, 6, 18, 10};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 59);
        }
        return new String(copyOfRange);
    }
}
