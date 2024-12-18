package X;

import java.util.Arrays;

/* renamed from: X.W6w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70143W6w {
    public static byte[] A00 = {61, 60, 47, 48, 58, 60, 6, 48, 61, 79, 89, 79, 79, 85, 83, 82, 99, 85, 88, 120, 126, 104, Byte.MAX_VALUE, 99, 108, 96, 104};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(19, 8, 49);
    }
}
