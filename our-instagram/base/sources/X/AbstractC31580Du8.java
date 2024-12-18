package X;

import java.util.Arrays;

/* renamed from: X.Du8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31580Du8 {
    public static byte[] A00 = {82, 83, 64, 95, 85, 83, 105, 95, 82, 64, 86, 64, 64, 90, 92, 93, 108, 90, 87, 91, 93, 75, 92, 64, 79, 67, 75};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(copyOfRange);
    }
}
