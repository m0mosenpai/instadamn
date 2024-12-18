package X;

/* renamed from: X.01m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC004701m {
    public static final long[] A00 = {-9187201950435737345L, -1};
    public static final C18590vm A01 = new C18590vm(0);

    public static final void A01(long[] jArr, int i) {
        int i2 = (i + 7) >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & (((-1) ^ j) + (j >>> 7));
        }
        int length = jArr.length - 1;
        int i4 = length - 1;
        jArr[i4] = (-72057594037927936L) | (jArr[i4] & 72057594037927935L);
        jArr[length] = jArr[0];
    }

    public static final int A00(long[] jArr, int i, int i2) {
        while (i < i2) {
            if (((jArr[i >> 3] >> ((i & 7) << 3)) & 255) != 128) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}
