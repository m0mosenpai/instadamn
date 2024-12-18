package X;

/* renamed from: X.2WV, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2WV {
    public static final long A00(Integer num, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        long j7;
        long scalb;
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 == 0) {
                return j6;
            }
            long j8 = 900000 + j2;
            if (j6 >= j8) {
                return j6;
            }
            return j8;
        }
        if (z) {
            if (num == C05F.A01) {
                scalb = i * j;
            } else {
                scalb = Math.scalb((float) j, i - 1);
            }
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j2 + scalb;
        }
        if (z2) {
            if (i2 == 0) {
                j7 = j2 + j3;
            } else {
                j7 = j2 + j5;
            }
            if (j4 != j5 && i2 == 0) {
                return j7 + (j5 - j4);
            }
            return j7;
        }
        if (j2 != -1) {
            return j2 + j3;
        }
        return Long.MAX_VALUE;
    }
}
