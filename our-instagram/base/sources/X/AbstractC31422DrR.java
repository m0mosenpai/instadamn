package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.Arrays;

/* renamed from: X.DrR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31422DrR {
    public static byte[] A00 = {122, 108, 122, 122, 96, 102, 103, 86, 96, 109, 85, 83, 69, 82, 78, 65, 77, 69};

    public static String A00() {
        return A02(0, 10, 118);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ StringTreeSet.MAX_SYMBOL_COUNT);
        }
        return new String(copyOfRange);
    }

    public static String A01() {
        return A02(10, 8, 95);
    }
}
