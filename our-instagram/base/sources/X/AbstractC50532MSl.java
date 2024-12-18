package X;

import com.facebook.common.dextricks.DalvikInternals;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.MSl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50532MSl {
    public static byte[] A00 = {48, 49, 34, 61, 55, 49, 11, 61, 48, 66, 65, 73, 71, 64, 113, 71, 74, 106, 105, 97, 111, 104, 89, 114, 111, 107, 99, 117, 114, 103, 107, 118, 111, 121, 111, 111, 117, 115, 114, 51, 112, 115, 123, 117, 114, 67, 125, Byte.MAX_VALUE, 104, 117, 106, 117, 104, 101, 51, 56, 46, 56, 56, 34, 36, 37, 100, 39, 36, 44, 34, 37, 20, 42, 40, 63, 34, 61, 34, 63, 50, 100, 42, 61, 36, 60, 20, 39, 36, 44, 34, 37, 100, PublicSuffixDatabase.EXCEPTION_MARKER, 55, PublicSuffixDatabase.EXCEPTION_MARKER, PublicSuffixDatabase.EXCEPTION_MARKER, 59, 61, 60, 125, 62, 61, 53, 59, 60, DalvikInternals.IOPRIO_CLASS_SHIFT, 51, 49, 38, 59, 36, 59, 38, 43, 125, 54, 59, PublicSuffixDatabase.EXCEPTION_MARKER, 51, 36, 61, 37, 125, 40, 62, 40, 40, 50, 52, 53, 116, 55, 52, 60, 50, 53, 4, 58, 56, 47, 50, 45, 50, 47, 34, 116, 55, 52, 60, 52, 46, 47, 4, 40, 62, 40, 40, 50, 52, 53, 116, 49, 39, 49, 49, 43, 45, 44, 109, 46, 45, 37, 43, 44, 29, 35, PublicSuffixDatabase.EXCEPTION_MARKER, 54, 43, 52, 43, 54, 59, 109, 55, 44, 38, 45, 29, 35, 52, 45, 53, 29, 46, 45, 37, 43, 44, 109, 64, 86, 64, 64, 90, 92, 93, 108, 90, 87, 88, 94, 77, 66, 95, 92, 77, 94, 73, 66, 79, 85, 124, Byte.MAX_VALUE, 103, 87, 110, 105, 107, 43, 40, 48, 0, 57, 62, 60, 43, 48, 45, 0, 54, 59, 58, 49, 43, 54, 57, 54, 58, 45, 47, 41, 63, 40, 52, 59, 55, 63};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(197, 10, 82);
    }
}
