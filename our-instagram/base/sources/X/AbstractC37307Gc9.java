package X;

import com.facebook.common.dextricks.DalvikInternals;
import java.util.Arrays;

/* renamed from: X.Gc9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37307Gc9 {
    public static byte[] A00 = {18, 10, DalvikInternals.IOPRIO_CLASS_SHIFT, 12, 7, 61, 12, 23, 15, 0, 7, 16, 1, 23, 1, 1, 27, 29, 28, 45, 27, 22, 86, 80, 70, 81, 77, 66, 78, 70};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(12, 10, 122);
    }
}
