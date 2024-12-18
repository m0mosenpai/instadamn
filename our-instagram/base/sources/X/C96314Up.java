package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4Up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96314Up {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final C42011wr A05;
    public final AtomicBoolean A06;
    public final AtomicBoolean A07;
    public final boolean A08;
    public final boolean A09;
    public final C461429y A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final long A00(long j, boolean z) {
        int i;
        int i2;
        float f;
        C461429y c461429y;
        C461429y c461429y2;
        C42011wr c42011wr = this.A05;
        if (c42011wr != null && !this.A08) {
            try {
                AbstractC460729r.A01("getIntentBasedLowWatermarkUs");
                if (!z) {
                    i = c42011wr.A04;
                    if (this.A0B && (c461429y = this.A0A) != null) {
                        i2 = C461429y.A00(c461429y, 11);
                    } else {
                        i2 = c42011wr.A03;
                    }
                    f = c42011wr.A00;
                } else {
                    i = c42011wr.A07;
                    if (this.A0C && (c461429y2 = this.A0A) != null) {
                        i2 = C461429y.A00(c461429y2, 10);
                    } else {
                        i2 = c42011wr.A06;
                    }
                    f = c42011wr.A01;
                }
                return 1.0f * Math.min(((float) (i * 1000)) + (f * ((float) j)), (float) (i2 * 1000));
            } finally {
                AbstractC460729r.A00();
            }
        }
        return 0L;
    }

    public C96314Up(C461429y c461429y, C42011wr c42011wr, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A08 = z;
        this.A05 = c42011wr;
        this.A07 = atomicBoolean;
        this.A06 = atomicBoolean2;
        this.A09 = z2;
        this.A03 = i * 1000;
        this.A02 = i2 * 1000;
        this.A04 = i3 * 1000;
        this.A01 = i4 * 1000;
        this.A00 = i5 * 1000;
        this.A0A = c461429y;
        this.A0C = z3;
        this.A0B = z4;
    }

    public C96314Up() {
        this(null, null, new AtomicBoolean(false), new AtomicBoolean(false), 1000, 1000, -1, 15000, 30000, false, false, false, false);
    }
}
