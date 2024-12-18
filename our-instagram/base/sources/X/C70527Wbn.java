package X;

/* renamed from: X.Wbn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70527Wbn implements InterfaceC98454bO, XLI {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final boolean A06;

    @Override // X.XLI
    public final long Avh() {
        return -1L;
    }

    public C70527Wbn(C69628VsV c69628VsV, long j, long j2, boolean z) {
        long A08;
        int i = c69628VsV.A00;
        int i2 = c69628VsV.A02;
        this.A05 = j;
        this.A04 = j2;
        this.A01 = i2 == -1 ? 1 : i2;
        this.A00 = i;
        this.A06 = z;
        if (j == -1) {
            this.A02 = -1L;
            A08 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.A02 = j3;
            A08 = AbstractC65703TsZ.A08(j3) / i;
        }
        this.A03 = A08;
    }

    @Override // X.InterfaceC98454bO
    public final long Azt() {
        return this.A03;
    }

    @Override // X.InterfaceC98454bO
    public final C69745Vuf Bs5(long j) {
        W5Q w5q;
        long j2 = this.A02;
        if (j2 == -1 && !this.A06) {
            w5q = new W5Q(0L, this.A04);
        } else {
            long j3 = this.A00;
            long j4 = this.A01;
            long j5 = (((j * j3) / 8000000) / j4) * j4;
            if (j2 != -1) {
                j5 = Math.min(j5, j2 - j4);
            }
            long max = Math.max(j5, 0L);
            long j6 = this.A04;
            long j7 = j6 + max;
            long A08 = AbstractC65703TsZ.A08(j7 - j6) / j3;
            w5q = new W5Q(A08, j7);
            if (j2 != -1 && A08 < j) {
                long j8 = j4 + j7;
                if (j8 < this.A05) {
                    return new C69745Vuf(w5q, new W5Q(AbstractC65703TsZ.A08(j8 - j6) / j3, j8));
                }
            }
        }
        return new C69745Vuf(w5q, w5q);
    }

    @Override // X.XLI
    public final long C8V(long j) {
        return AbstractC65703TsZ.A08(j - this.A04) / this.A00;
    }

    @Override // X.InterfaceC98454bO
    public final boolean Cca() {
        if (this.A02 == -1 && !this.A06) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC98454bO
    public final /* synthetic */ long CAK(int i) {
        return this.A03;
    }
}
