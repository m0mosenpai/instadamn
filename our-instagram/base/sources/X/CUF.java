package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes5.dex */
public final class CUF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final CWV A05;

    public final C28167CbE A00(C01H c01h, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        int i5 = i3 + i4;
        if (c01h != null) {
            Integer num = this.A05.A04;
            if (i2 < this.A03) {
                int i6 = (int) (j & 4294967295L);
                long j2 = c01h.A00;
                int i7 = (int) (j2 & 4294967295L);
                if (i6 - i7 >= 0) {
                    if (i != 0 && (i >= this.A02 || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
                        if (!z2) {
                            return new C28167CbE(true, A00(new C01H(C01H.A00(AbstractC25225BEi.A06(j2) - this.A01, i7)), 0, i2 + 1, i5, 0, C01H.A00(Constraints.A01(this.A04), (i6 - this.A00) - i4), z, true).A00);
                        }
                    } else {
                        num.intValue();
                        return new C28167CbE(false, false);
                    }
                }
            }
        }
        return new C28167CbE(true, true);
    }

    public CUF(CWV cwv, int i, int i2, int i3, int i4, long j) {
        this.A02 = i;
        this.A05 = cwv;
        this.A04 = j;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }
}
