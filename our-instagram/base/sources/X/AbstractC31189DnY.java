package X;

import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.DnY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31189DnY {
    public static byte[] A00 = {102, 103, 116, 107, 97, 103, 93, 107, 102, 125, 101, 98, 99, 104, 82, 99, 120, 96, 111, 104, Byte.MAX_VALUE, 88, 78, 88, 88, 66, 68, 69, 116, 66, 79, 38, 32, 54, PublicSuffixDatabase.EXCEPTION_MARKER, 61, 50, 62, 54, 111, 124, 107, 112, Byte.MAX_VALUE, 112, 122, 120, 109, 112, 118, 119, 70, 122, 118, 125, 124};

    public static String A02() {
        return A03(0, 9, 3);
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A03(9, 12, 12);
    }

    public static String A01() {
        return A03(31, 8, 82);
    }
}
