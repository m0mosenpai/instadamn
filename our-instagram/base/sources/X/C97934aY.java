package X;

import java.io.IOException;
import java.util.Locale;

/* renamed from: X.4aY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97934aY {
    public long A00;
    public long A01;
    public InterfaceC97364Yw A02;
    public C4BB A03;
    public final long A04;
    public final InterfaceC92404Bv A05;
    public final C4XG A06;
    public final C92134At A07;
    public final boolean A08;

    public final long A00() {
        if (this.A02.BsK(this.A00) == -1) {
            return -1L;
        }
        InterfaceC97364Yw interfaceC97364Yw = this.A02;
        return ((interfaceC97364Yw.B6h() + this.A01) + interfaceC97364Yw.BsK(this.A00)) - 1;
    }

    public final long A01(long j) {
        return ((this.A02.B6Y(this.A00, j) + this.A01) + this.A02.AeO(this.A00, j)) - 1;
    }

    public final long A02(long j) {
        InterfaceC97364Yw interfaceC97364Yw = this.A02;
        long j2 = this.A01;
        long j3 = j - j2;
        long B6h = interfaceC97364Yw.B6h();
        if (j3 >= B6h) {
            return interfaceC97364Yw.Azu(j3, this.A00);
        }
        throw new IOException(String.format(Locale.US, "Segment number without shift number is behind, segmentNum=%d ,segmentNumShift=%d ,firstSegmentNum=%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(B6h)));
    }

    public final long A03(long j) {
        return this.A02.C8V(j - this.A01) + this.A02.Azu(j - this.A01, this.A00);
    }

    public final long A04(long j) {
        return this.A02.BsO(j, this.A00) + this.A01;
    }

    public final boolean A05(long j) {
        InterfaceC97364Yw interfaceC97364Yw = this.A02;
        long B6h = (interfaceC97364Yw.B6h() + interfaceC97364Yw.BsK(this.A00)) - 1;
        if (j >= this.A04 + this.A02.C8V(B6h) + this.A02.Azu(B6h, this.A00)) {
            return false;
        }
        return true;
    }

    public C97934aY(InterfaceC92404Bv interfaceC92404Bv, C4XG c4xg, InterfaceC97364Yw interfaceC97364Yw, C92134At c92134At, C4BB c4bb, long j, long j2, long j3, boolean z) {
        this.A04 = j;
        this.A00 = j2;
        this.A03 = c4bb;
        this.A07 = c92134At;
        this.A01 = j3;
        this.A06 = c4xg;
        this.A02 = interfaceC97364Yw;
        this.A08 = z;
        this.A05 = interfaceC92404Bv == null ? new C92394Bu() : interfaceC92404Bv;
    }
}
