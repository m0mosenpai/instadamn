package X;

/* renamed from: X.0UM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0UM {
    public static int A00(long j) {
        long j2 = (j >>> 62) & 1;
        long j3 = j >>> 16;
        if (j2 == 1) {
            return ((int) (j3 & 4294967295L)) & 4095;
        }
        return (int) (j3 & 65535);
    }

    public static long A01(long[][] jArr, long j) {
        long[] jArr2;
        int i = (int) ((j >>> 48) & 63);
        int i2 = i - 1;
        int i3 = (int) (j & 65535);
        if (i2 >= 0 && i2 < jArr.length && i3 >= 0 && (jArr2 = jArr[i2]) != null && i3 < jArr2.length) {
            long j2 = jArr2[i3];
            if (j2 == 0 || ((int) ((j2 >>> 48) & 63)) == i) {
                return j2;
            }
        }
        return 0L;
    }
}
