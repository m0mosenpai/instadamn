package X;

import java.util.Arrays;

/* renamed from: X.GcI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37316GcI {
    public static byte[] A00 = {49, 39, 49, 49, 43, 45, 44, 29, 43, 38, 125, 126, 102, 86, 111, 104, 106, 86, 122, 125, 104, 123, 125, 86, 122, 125, 104, 125, 108, 86, 103, 104, 100, 108, 104, 110, 120, 111, 115, 124, 112, 120};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(copyOfRange);
    }
}
