package X;

import com.facebook.common.dextricks.DalvikInternals;
import java.util.Arrays;

/* renamed from: X.02j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC006902j {
    public static byte[] A00 = {31, 30, DalvikInternals.IOPRIO_CLASS_SHIFT, 18, 24, 30, 36, 18, 31, 17, 7, 17, 17, 11, DalvikInternals.IOPRIO_CLASS_SHIFT, 12, 61, 11, 6};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }
}
