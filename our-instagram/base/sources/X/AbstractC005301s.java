package X;

/* renamed from: X.01s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC005301s {
    public static final int[] A00 = new int[0];
    public static final long[] A01 = new long[0];
    public static final Object[] A02 = new Object[0];

    public static final int A00(int[] iArr, int i, int i2) {
        int i3;
        C14360o3.A0B(iArr, 0);
        int i4 = i - 1;
        int i5 = 0;
        while (true) {
            i3 = i5 ^ (-1);
            if (i5 <= i4) {
                i3 = (i5 + i4) >>> 1;
                int i6 = iArr[i3];
                if (i6 < i2) {
                    i5 = i3 + 1;
                } else {
                    if (i6 <= i2) {
                        break;
                    }
                    i4 = i3 - 1;
                }
            } else {
                break;
            }
        }
        return i3;
    }

    public static final int A01(long[] jArr, int i, long j) {
        int i2;
        C14360o3.A0B(jArr, 0);
        int i3 = i - 1;
        int i4 = 0;
        while (true) {
            i2 = i4 ^ (-1);
            if (i4 > i3) {
                break;
            }
            i2 = (i4 + i3) >>> 1;
            long j2 = jArr[i2];
            if (j2 < j) {
                i4 = i2 + 1;
            } else {
                if (j2 <= j) {
                    break;
                }
                i3 = i2 - 1;
            }
        }
        return i2;
    }
}
