package X;

import androidx.media3.common.util.Util;

/* renamed from: X.WSq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70362WSq implements XCy {
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C70130W5r A04;
    public final InterfaceC72026XFo A05;
    public final XG2 A06;
    public final C69318VlQ A07;

    @Override // X.XCy
    public final void CNb(int i, long j) {
        this.A05.EMe(new C70341WRv(this.A07, 1, i, j));
        this.A06.AWZ(this.A04);
    }

    @Override // X.XCy
    public final void EJX(long j) {
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0L;
    }

    @Override // X.XCy
    public final boolean ELP(XGj xGj, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.A00) < (i2 = this.A03)) {
            int ELK = this.A06.ELK(xGj, (int) Math.min(i2 - i, j2), true);
            if (ELK == -1) {
                j2 = 0;
            } else {
                this.A00 += ELK;
                j2 -= ELK;
            }
        }
        int i3 = this.A07.A01;
        int i4 = this.A00 / i3;
        if (i4 > 0) {
            long A06 = this.A02 + Util.A06(this.A01, r4.A03);
            int i5 = i4 * i3;
            int i6 = this.A00 - i5;
            this.A06.ELS(null, 1, i5, i6, A06);
            this.A01 += i4;
            this.A00 = i6;
        }
        if (j2 <= 0) {
            return true;
        }
        return false;
    }

    public C70362WSq(InterfaceC72026XFo interfaceC72026XFo, XG2 xg2, C69318VlQ c69318VlQ, String str, int i) {
        this.A05 = interfaceC72026XFo;
        this.A06 = xg2;
        this.A07 = c69318VlQ;
        int i2 = c69318VlQ.A04;
        int i3 = (c69318VlQ.A00 * i2) / 8;
        int i4 = c69318VlQ.A01;
        if (i4 == i3) {
            int i5 = c69318VlQ.A03;
            int i6 = i5 * i3;
            int i7 = i6 * 8;
            int max = Math.max(i3, i6 / 10);
            this.A03 = max;
            C70116W4o c70116W4o = new C70116W4o();
            c70116W4o.A00(str);
            c70116W4o.A03 = i7;
            c70116W4o.A0D = i7;
            c70116W4o.A0A = max;
            c70116W4o.A04 = i2;
            c70116W4o.A0G = i5;
            c70116W4o.A0C = i;
            this.A04 = new C70130W5r(c70116W4o);
            return;
        }
        throw new VCM(AnonymousClass001.A02(i3, i4, "Expected block size: ", "; got: "), null, 1, true);
    }
}
