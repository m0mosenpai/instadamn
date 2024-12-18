package X;

/* renamed from: X.W2x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70097W2x {
    public long A00;
    public long A01;
    public long A02;
    public long A03 = 0;
    public long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public C70097W2x(long j, long j2, long j3, long j4, long j5, long j6) {
        this.A06 = j;
        this.A07 = j2;
        this.A01 = j3;
        this.A02 = j4;
        this.A00 = j5;
        this.A05 = j6;
        this.A04 = A00(j2, 0L, j3, j4, j5, j6);
    }

    public static long A00(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 < j5 && j2 + 1 < j3) {
            long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
            return Math.max(j4, Math.min(((j7 + j4) - j6) - (j7 / 20), j5 - 1));
        }
        return j4;
    }
}
