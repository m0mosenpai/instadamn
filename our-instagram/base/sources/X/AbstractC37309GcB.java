package X;

import java.util.Arrays;

/* renamed from: X.GcB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37309GcB {
    public static byte[] A00 = {5, 3, -11, 2, -2, -15, -3, -11};

    public static String A00() {
        byte[] copyOfRange = Arrays.copyOfRange(A00, 0, 8);
        for (int i = 0; i < copyOfRange.length; i++) {
            copyOfRange[i] = (byte) ((copyOfRange[i] - 79) - 65);
        }
        return new String(copyOfRange);
    }

    public static String A01() {
        return A00();
    }
}
