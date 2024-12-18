package X;

import java.util.Iterator;

/* renamed from: X.52t, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52t extends AbstractC107574t2 implements InterfaceC107614t6 {
    public long A00;
    public final C123795it A01;

    @Override // X.AbstractC107574t2
    public final float A02(long j) {
        boolean z;
        if (this.A00 == Long.MIN_VALUE) {
            this.A00 = j;
            float f = A03("initial").A00;
            float f2 = A03("end").A00;
            C123795it c123795it = this.A01;
            C123805iu c123805iu = c123795it.A04;
            c123805iu.A00 = f;
            Iterator it = c123795it.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onSpringUpdate");
            }
            double d = c123805iu.A00;
            c123795it.A00 = d;
            c123795it.A06.A00 = d;
            c123805iu.A01 = 0.0d;
            c123795it.A00(f2);
            return f;
        }
        float f3 = A03("end").A00;
        C123795it c123795it2 = this.A01;
        c123795it2.A00(f3);
        if (c123795it2.A01()) {
            return f3;
        }
        double d2 = (j - this.A00) / 1.0E9d;
        boolean z2 = false;
        double d3 = 0.064d;
        if (d2 <= 0.064d) {
            d3 = d2;
        }
        double d4 = c123795it2.A01 + d3;
        c123795it2.A01 = d4;
        C89773zJ c89773zJ = c123795it2.A02;
        double d5 = c89773zJ.A01;
        double d6 = c89773zJ.A00;
        C123805iu c123805iu2 = c123795it2.A04;
        double d7 = c123805iu2.A00;
        double d8 = c123805iu2.A01;
        C123805iu c123805iu3 = c123795it2.A06;
        double d9 = c123805iu3.A00;
        double d10 = c123805iu3.A01;
        while (d4 >= 0.001d) {
            d4 -= 0.001d;
            c123795it2.A01 = d4;
            if (d4 < 0.001d) {
                C123805iu c123805iu4 = c123795it2.A05;
                c123805iu4.A00 = d7;
                c123805iu4.A01 = d8;
            }
            double d11 = c123795it2.A00;
            double d12 = ((d11 - d9) * d5) - (d6 * d8);
            double d13 = d8 + (d12 * 0.001d * 0.5d);
            double d14 = ((d11 - (((d8 * 0.001d) * 0.5d) + d7)) * d5) - (d6 * d13);
            double d15 = d8 + (d14 * 0.001d * 0.5d);
            double d16 = ((d11 - (d7 + ((d13 * 0.001d) * 0.5d))) * d5) - (d6 * d15);
            d9 = d7 + (d15 * 0.001d);
            d10 = d8 + (d16 * 0.001d);
            d7 += (d8 + ((d13 + d15) * 2.0d) + d10) * 0.16666666666666666d * 0.001d;
            d8 += (d12 + ((d14 + d16) * 2.0d) + (((d11 - d9) * d5) - (d6 * d10))) * 0.16666666666666666d * 0.001d;
        }
        c123805iu3.A00 = d9;
        c123805iu3.A01 = d10;
        c123805iu2.A00 = d7;
        c123805iu2.A01 = d8;
        if (d4 > 0.0d) {
            double d17 = d4 / 0.001d;
            C123805iu c123805iu5 = c123795it2.A05;
            double d18 = 1.0d - d17;
            d7 = (d7 * d17) + (c123805iu5.A00 * d18);
            c123805iu2.A00 = d7;
            d8 = (d8 * d17) + (c123805iu5.A01 * d18);
            c123805iu2.A01 = d8;
        }
        if (c123795it2.A01()) {
            if (d5 > 0.0d) {
                c123805iu2.A00 = c123795it2.A00;
            } else {
                c123795it2.A00 = d7;
            }
            if (0.0d != d8) {
                c123805iu2.A01 = 0.0d;
            }
            z2 = true;
        }
        if (c123795it2.A03) {
            c123795it2.A03 = false;
            z = true;
        } else {
            z = false;
        }
        if (z2) {
            c123795it2.A03 = true;
        }
        Iterator it2 = c123795it2.A07.iterator();
        if (it2.hasNext()) {
            it2.next();
            if (z) {
                throw new NullPointerException("onSpringActivate");
            }
            throw new NullPointerException("onSpringUpdate");
        }
        this.A00 = j;
        return (float) c123805iu2.A00;
    }

    @Override // X.InterfaceC107614t6
    public final boolean isFinished() {
        return this.A01.A01();
    }

    public C52t(C89773zJ c89773zJ) {
        this.A00 = Long.MIN_VALUE;
        C123795it c123795it = new C123795it();
        this.A01 = c123795it;
        if (c89773zJ != null) {
            c123795it.A02 = c89773zJ;
        }
    }

    public C52t() {
        this(null);
    }
}
