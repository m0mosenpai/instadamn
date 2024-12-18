package X;

import java.util.Arrays;

/* renamed from: X.VzI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69998VzI {
    public static byte[] A00 = {109, 123, 109, 109, 119, 113, 112, 65, 119, 122, 77, 75, 93, 74, 86, 89, 85, 93};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }
}
