package X;

import java.util.Arrays;

/* renamed from: X.GcH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37315GcH {
    public static byte[] A00 = {112, 113, 98, 125, 119, 113, 75, 125, 112, 30, 8, 30, 30, 4, 2, 3, 50, 4, 9, 72, 78, 88, 79, 83, 92, 80, 88};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }
}
