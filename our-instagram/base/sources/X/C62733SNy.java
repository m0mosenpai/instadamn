package X;

/* renamed from: X.SNy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62733SNy {
    public long A00;
    public long A01;
    public long A02;
    public final ThreadLocal A03 = new ThreadLocal();

    public final synchronized long A00(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 == -9223372036854775807L) {
            long j2 = this.A00;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.A03.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.A02 = j2 - j;
            notifyAll();
        }
        this.A01 = j;
        return j + this.A02;
    }

    public final synchronized long A01(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.A01;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return A00((j * 1000000) / 90000);
    }

    public C62733SNy(long j) {
        long j2;
        synchronized (this) {
            this.A00 = j;
            if (j == Long.MAX_VALUE) {
                j2 = 0;
            } else {
                j2 = -9223372036854775807L;
            }
            this.A02 = j2;
            this.A01 = -9223372036854775807L;
        }
    }
}
