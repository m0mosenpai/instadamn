package X;

import java.util.Arrays;

/* renamed from: X.Ptn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58347Ptn {
    public static byte[] A00 = {-98, -97, -80, -93, -99, -97, -103, -93, -98, -35, -49, -35, -35, -45, -39, -40, -55, -45, -50, -32, -34, -48, -35, -39, -52, -40, -48};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new String(copyOfRange);
    }
}
