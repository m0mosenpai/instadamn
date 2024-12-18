package X;

import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.FYk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34875FYk {
    public static byte[] A00 = {PublicSuffixDatabase.EXCEPTION_MARKER, 38, 44, 36, PublicSuffixDatabase.EXCEPTION_MARKER, 46, 34, 42, 7, 31, 24, 25, 18, 40, 25, 2, 26, 21, 18, 5, 60, 42, 60, 60, 38, 32, PublicSuffixDatabase.EXCEPTION_MARKER, 16, 38, 43, 78, 72, 94, 73, 85, 90, 86, 94};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }
}
