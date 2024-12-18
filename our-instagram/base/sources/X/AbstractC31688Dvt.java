package X;

import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.Dvt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31688Dvt {
    public static byte[] A00 = {14, 15, 28, 3, 9, 15, 53, 3, 14, PublicSuffixDatabase.EXCEPTION_MARKER, 38, 44, 36, PublicSuffixDatabase.EXCEPTION_MARKER, 46, 34, 42, 97, 119, 97, 97, 123, 125, 124, 77, 123, 118, 116, 114, 100, 115, 111, 96, 108, 100};

    public static String A01() {
        return A02(0, 9, 92);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(17, 10, 36);
    }
}
