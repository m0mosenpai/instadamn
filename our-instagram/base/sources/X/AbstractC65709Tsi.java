package X;

import com.facebook.common.dextricks.DalvikInternals;
import java.util.Arrays;

/* renamed from: X.Tsi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65709Tsi {
    public static byte[] A00 = {9, 21, 21, 17, 18, 91, 78, 78, 17, 19, 8, 23, 0, 2, 24, 2, 4, 15, 21, 4, 19, 79, 8, 15, 18, 21, 0, 6, 19, 0, 12, 79, 2, 14, 12, 78, 17, 14, DalvikInternals.IOPRIO_CLASS_SHIFT, 8, 2, 24, 23, 1, 23, 23, DalvikInternals.IOPRIO_CLASS_SHIFT, 11, 10, 59, DalvikInternals.IOPRIO_CLASS_SHIFT, 0, 94, 88, 78, 89, 69, 74, 70, 78};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(42, 10, 99);
    }

    public static String A01() {
        return A02(52, 8, 44);
    }
}
