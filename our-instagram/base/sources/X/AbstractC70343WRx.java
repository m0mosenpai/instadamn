package X;

/* renamed from: X.WRx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70343WRx implements InterfaceC71878X8l {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        W5N w5n;
        long j2 = this.A02;
        if (j2 == -1) {
            w5n = new W5N(0L, this.A03);
        } else {
            long j3 = this.A00;
            long j4 = this.A01;
            long max = Math.max(Math.min((((j * j3) / 8000000) / j4) * j4, j2 - j4), 0L);
            long j5 = this.A03;
            long j6 = j5 + max;
            long A08 = AbstractC65703TsZ.A08(j6 - j5) / j3;
            w5n = new W5N(A08, j6);
            if (A08 < j) {
                long j7 = j4 + j6;
                if (j7 < this.A05) {
                    return new C69736VuW(w5n, new W5N(AbstractC65703TsZ.A08(j7 - j5) / j3, j7));
                }
            }
        }
        return new C69736VuW(w5n, w5n);
    }

    public AbstractC70343WRx(int i, int i2, long j, long j2) {
        long A08;
        this.A05 = j;
        this.A03 = j2;
        this.A01 = i2 == -1 ? 1 : i2;
        this.A00 = i;
        if (j == -1) {
            this.A02 = -1L;
            A08 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.A02 = j3;
            A08 = AbstractC65703TsZ.A08(j3) / i;
        }
        this.A04 = A08;
    }
}
