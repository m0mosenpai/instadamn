package X;

import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.Dva, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31670Dva {
    public static byte[] A00 = {42, 45, 39, 47, 42, 37, 41, PublicSuffixDatabase.EXCEPTION_MARKER, 84, 76, 75, 74, 65, 123, 74, 81, 73, 70, 65, 86, 61, 43, 61, 61, 39, PublicSuffixDatabase.EXCEPTION_MARKER, 32, 17, 39, 42, 115, 117, 99, 116, 104, 103, 107, 99};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 82);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(20, 10, 28);
    }
}
