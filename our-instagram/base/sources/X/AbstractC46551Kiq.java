package X;

/* renamed from: X.Kiq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46551Kiq {
    public static final long A00(long j, long j2, long j3) {
        if (j2 > 0) {
            long j4 = j - j2;
            if (0 <= j4 && j4 < 2001) {
                return j2;
            }
        }
        if (j3 <= 0) {
            return -1L;
        }
        long j5 = j - j3;
        if (0 > j5 || j5 >= 2001) {
            return -1L;
        }
        return j3;
    }
}
