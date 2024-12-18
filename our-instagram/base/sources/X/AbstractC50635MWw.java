package X;

import com.facebook.common.dextricks.DalvikInternals;
import java.util.Arrays;

/* renamed from: X.MWw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50635MWw {
    public static byte[] A00 = {2, 30, 30, 26, 25, 80, 69, 69, 26, 24, 3, 28, 11, 9, 19, 9, 15, 4, 30, 15, 24, 68, 3, 4, 25, 30, 11, DalvikInternals.IOPRIO_CLASS_SHIFT, 24, 11, 7, 68, 9, 5, 7, 69, 26, 5, 6, 3, 9, 19, 23, 1, 23, 23, DalvikInternals.IOPRIO_CLASS_SHIFT, 11, 10, 59, DalvikInternals.IOPRIO_CLASS_SHIFT, 0, 112, 118, 96, 119, 107, 100, 104, 96};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 100);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(52, 8, 97);
    }

    public static String A01() {
        return A02(42, 10, 0);
    }
}
