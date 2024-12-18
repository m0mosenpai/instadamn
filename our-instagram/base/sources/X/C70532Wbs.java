package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.Wbs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70532Wbs implements XLI {
    public final long A00;
    public final long[] A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;

    @Override // X.XLI
    public final long Avh() {
        return this.A03;
    }

    @Override // X.InterfaceC98454bO
    public final long Azt() {
        return this.A00;
    }

    @Override // X.InterfaceC98454bO
    public final C69745Vuf Bs5(long j) {
        long A09;
        long max;
        long j2;
        double d;
        long[] jArr = this.A01;
        if (!AbstractC167007dF.A1W(jArr)) {
            A09 = 0;
            j2 = this.A05;
            max = this.A02;
        } else {
            long j3 = this.A00;
            A09 = AbstractC65703TsZ.A09(j, j3);
            double d2 = (A09 * 100.0d) / j3;
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                if (d2 >= 100.0d) {
                    d3 = 256.0d;
                } else {
                    int i = (int) d2;
                    C4B8.A01(jArr);
                    double d4 = jArr[i];
                    if (i == 99) {
                        d = 256.0d;
                    } else {
                        d = jArr[i + 1];
                    }
                    d3 = d4 + ((d2 - i) * (d - d4));
                }
            }
            long j4 = this.A04;
            max = Math.max(this.A02, Math.min(Math.round((d3 / 256.0d) * j4), j4 - 1));
            j2 = this.A05;
        }
        W5Q w5q = new W5Q(A09, j2 + max);
        return new C69745Vuf(w5q, w5q);
    }

    @Override // X.XLI
    public final long C8V(long j) {
        long j2;
        double d;
        long j3 = j - this.A05;
        long[] jArr = this.A01;
        if (AbstractC167007dF.A1W(jArr) && j3 > this.A02) {
            C4B8.A01(jArr);
            double d2 = (j3 * 256.0d) / this.A04;
            int A04 = Util.A04(jArr, (long) d2, true);
            long j4 = this.A00;
            long j5 = (j4 * A04) / 100;
            long j6 = jArr[A04];
            int i = A04 + 1;
            long j7 = (j4 * i) / 100;
            if (A04 == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i];
            }
            if (j6 == j2) {
                d = 0.0d;
            } else {
                d = (d2 - j6) / (j2 - j6);
            }
            return j5 + Math.round(d * (j7 - j5));
        }
        return 0L;
    }

    @Override // X.InterfaceC98454bO
    public final boolean Cca() {
        return AbstractC167007dF.A1W(this.A01);
    }

    public C70532Wbs(long[] jArr, int i, long j, long j2, long j3) {
        this.A05 = j;
        this.A02 = i;
        this.A00 = j2;
        this.A01 = jArr;
        this.A04 = j3;
        this.A03 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // X.InterfaceC98454bO
    public final /* synthetic */ long CAK(int i) {
        return this.A00;
    }
}
