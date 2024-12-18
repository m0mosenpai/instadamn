package X;

import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.DnZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31190DnZ {
    public static byte[] A00 = {-61, -60, -43, -56, -62, -60, -66, -56, -61, 25, 17, 24, 23, 14, 8, 23, 30, 22, 11, 14, 27, -46, -60, -46, -46, -56, -50, -51, -66, -56, -61, 40, 38, 24, 37, PublicSuffixDatabase.EXCEPTION_MARKER, 20, 32, 24};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(31, 8, 115);
    }
}
