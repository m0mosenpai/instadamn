package X;

/* renamed from: X.3Yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75053Yv {
    public final int A00;
    public final long[] A01;
    public final Object[] A02;

    public static final int A00(C75053Yv c75053Yv, long j) {
        int i = c75053Yv.A00 - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = c75053Yv.A01[0];
            if (j2 == j) {
                return 0;
            }
            if (j2 <= j) {
                return -1;
            }
            return -2;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = c75053Yv.A01[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public C75053Yv(long[] jArr, Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = jArr;
        this.A02 = objArr;
    }
}
