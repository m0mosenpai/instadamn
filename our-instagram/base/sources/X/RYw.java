package X;

import com.google.protobuf.UnsafeUtil;

/* loaded from: classes10.dex */
public final class RYw extends SOG {
    public static int A00(byte[] bArr, int i, long j) {
        int i2 = 0;
        if (i >= 16) {
            while (true) {
                int i3 = i2 + 8;
                if (i3 > i) {
                    break;
                }
                if ((UnsafeUtil.A02.A07(bArr, UnsafeUtil.A01 + j) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j += 8;
                i2 = i3;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (UnsafeUtil.A00(bArr, j) >= 0) {
                    i2++;
                    j = j2;
                }
            }
            return i;
        }
        return i2;
    }
}
