package X;

import java.util.Arrays;

/* renamed from: X.GcG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37314GcG {
    public static byte[] A00 = {-111, -110, -93, -106, -112, -110, -116, -106, -111, -112, -126, -112, -112, -122, -116, -117, 124, -122, -127, -73, -70, -78, -94, -87, -92, -90, -94, -74, -73, -92, -75, -73, -94, -74, -73, -92, -73, -88, -94, -79, -92, -80, -88, -36, -38, -52, -39, -43, -56, -44, -52};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 12);
    }
}
