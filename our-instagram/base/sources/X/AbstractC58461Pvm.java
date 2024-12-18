package X;

import java.util.Arrays;

/* renamed from: X.Pvm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58461Pvm {
    public static byte[] A00 = {87, 86, 69, 90, 80, 86, 108, 90, 87, 116, 98, 116, 116, 110, 104, 105, 88, 110, 99, 94, 88, 78, 89, 69, 74, 70, 78};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }
}
