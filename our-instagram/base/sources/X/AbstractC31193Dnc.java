package X;

import java.util.Arrays;

/* renamed from: X.Dnc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31193Dnc {
    public static byte[] A00 = {-103, -102, -85, -98, -104, -102, -108, -98, -103, 118, 110, 117, 116, 107, 101, 116, 123, 115, 104, 107, 120, -110, -124, -110, -110, -120, -114, -115, 126, -120, -125, -103, -105, -119, -106, -110, -123, -111, -119, -31, -48, -35, -44, -47, -44, -50, -52, -33, -44, -38, -39, -54, -50, -38, -49, -48};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 2);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(31, 8, 34);
    }
}
