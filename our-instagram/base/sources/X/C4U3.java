package X;

import java.util.Arrays;

/* renamed from: X.4U3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4U3 {
    public long A00;
    public long A01;
    public long A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public final boolean[] A07 = new boolean[15];

    public final void A00() {
        this.A00 = 0L;
        this.A01 = 0L;
        this.A02 = 0L;
        this.A03 = 0;
        Arrays.fill(this.A07, false);
    }

    public final void A01(long j) {
        int i;
        long j2 = this.A00;
        if (j2 == 0) {
            this.A05 = j;
        } else if (j2 == 1) {
            long j3 = j - this.A05;
            this.A04 = j3;
            this.A02 = j3;
            this.A01 = 1L;
        } else {
            long j4 = j - this.A06;
            int i2 = (int) (j2 % 15);
            if (Math.abs(j4 - this.A04) <= 1000000) {
                this.A01++;
                this.A02 += j4;
                boolean[] zArr = this.A07;
                if (zArr[i2]) {
                    zArr[i2] = false;
                    i = this.A03 - 1;
                    this.A03 = i;
                }
            } else {
                boolean[] zArr2 = this.A07;
                if (!zArr2[i2]) {
                    zArr2[i2] = true;
                    i = this.A03 + 1;
                    this.A03 = i;
                }
            }
        }
        this.A00 = j2 + 1;
        this.A06 = j;
    }

    public final boolean A02() {
        if (this.A00 > 15 && this.A03 == 0) {
            return true;
        }
        return false;
    }
}
