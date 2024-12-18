package X;

/* renamed from: X.VvZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69793VvZ {
    public long A00;
    public long A01;
    public long A02;
    public final ThreadLocal A03 = new ThreadLocal();

    public final synchronized long A00() {
        long j;
        j = this.A02;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long A01(long j) {
        long j2;
        j2 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (this.A01 == -9223372036854775807L) {
                long j3 = this.A02;
                if (j3 == 9223372036854775806L) {
                    Long l = (Long) this.A03.get();
                    l.getClass();
                    j3 = l.longValue();
                }
                this.A01 = j3 - j;
                notifyAll();
            }
            this.A00 = j;
            j2 = j + this.A01;
        }
        return j2;
    }

    public final synchronized long A02(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.A00;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return A01((j * 1000000) / 90000);
    }

    public final synchronized long A03(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.A00;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = j3 / 8589934592L;
            long j5 = (j4 * 8589934592L) + j;
            j += (j4 + 1) * 8589934592L;
            if (j5 >= j3) {
                j = j5;
            }
        }
        return A01((j * 1000000) / 90000);
    }

    public final synchronized void A04(long j) {
        long j2;
        this.A02 = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.A01 = j2;
        this.A00 = -9223372036854775807L;
    }

    public C69793VvZ() {
        A04(0L);
    }
}
