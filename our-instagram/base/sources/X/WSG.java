package X;

import androidx.media3.common.util.Util;

/* loaded from: classes11.dex */
public final class WSG implements InterfaceC72041XGk {
    public final long A00;
    public final long[] A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;

    @Override // X.InterfaceC72041XGk
    public final int Aem() {
        return this.A02;
    }

    @Override // X.InterfaceC72041XGk
    public final long Avh() {
        return this.A04;
    }

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        long A09;
        long max;
        long j2;
        double d;
        long[] jArr = this.A01;
        if (!AbstractC167007dF.A1W(jArr)) {
            A09 = 0;
            j2 = this.A06;
            max = this.A03;
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
                    WDn.A00(jArr);
                    double d4 = jArr[i];
                    if (i == 99) {
                        d = 256.0d;
                    } else {
                        d = jArr[i + 1];
                    }
                    d3 = d4 + ((d2 - i) * (d - d4));
                }
            }
            long j4 = this.A05;
            max = Math.max(this.A03, Math.min(Math.round((d3 / 256.0d) * j4), j4 - 1));
            j2 = this.A06;
        }
        W5N w5n = new W5N(A09, j2 + max);
        return new C69736VuW(w5n, w5n);
    }

    @Override // X.InterfaceC72041XGk
    public final long C8V(long j) {
        long j2;
        double d;
        long j3 = j - this.A06;
        long[] jArr = this.A01;
        if (AbstractC167007dF.A1W(jArr) && j3 > this.A03) {
            WDn.A00(jArr);
            double d2 = (j3 * 256.0d) / this.A05;
            int A02 = Util.A02(jArr, (long) d2, true);
            long j4 = this.A00;
            long j5 = (j4 * A02) / 100;
            long j6 = jArr[A02];
            int i = A02 + 1;
            long j7 = (j4 * i) / 100;
            if (A02 == 99) {
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

    public WSG(long[] jArr, int i, int i2, long j, long j2, long j3) {
        this.A06 = j;
        this.A03 = i;
        this.A00 = j2;
        this.A02 = i2;
        this.A05 = j3;
        this.A01 = jArr;
        this.A04 = j3 != -1 ? j + j3 : -1L;
    }
}
