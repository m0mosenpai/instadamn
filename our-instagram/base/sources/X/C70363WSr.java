package X;

import androidx.media3.common.util.Util;

/* renamed from: X.WSr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70363WSr implements XCy {
    public static final int[] A0C = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] A0D = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final C69318VlQ A05;
    public final int A06;
    public final C70130W5r A07;
    public final WFa A08;
    public final InterfaceC72026XFo A09;
    public final XG2 A0A;
    public final byte[] A0B;

    @Override // X.XCy
    public final void EJX(long j) {
        this.A00 = 0;
        this.A03 = j;
        this.A01 = 0;
        this.A02 = 0L;
    }

    private void A00(int i) {
        long j = this.A03;
        long j2 = this.A02;
        C69318VlQ c69318VlQ = this.A05;
        long A06 = j + Util.A06(j2, c69318VlQ.A03);
        int i2 = i * 2 * c69318VlQ.A04;
        this.A0A.ELS(null, 1, i2, this.A01 - i2, A06);
        this.A02 += i;
        this.A01 -= i2;
    }

    @Override // X.XCy
    public final void CNb(int i, long j) {
        this.A09.EMe(new C70341WRv(this.A05, this.A04, i, j));
        this.A0A.AWZ(this.A07);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    @Override // X.XCy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ELP(X.XGj r26, long r27) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70363WSr.ELP(X.XGj, long):boolean");
    }

    public C70363WSr(InterfaceC72026XFo interfaceC72026XFo, XG2 xg2, C69318VlQ c69318VlQ) {
        this.A09 = interfaceC72026XFo;
        this.A0A = xg2;
        this.A05 = c69318VlQ;
        int i = c69318VlQ.A03;
        int max = Math.max(1, i / 10);
        this.A06 = max;
        WFa wFa = new WFa(c69318VlQ.A05);
        wFa.A03();
        int A03 = wFa.A03();
        this.A04 = A03;
        int i2 = c69318VlQ.A04;
        int i3 = c69318VlQ.A01;
        int i4 = (((i3 - (i2 * 4)) * 8) / (c69318VlQ.A00 * i2)) + 1;
        if (A03 == i4) {
            int i5 = ((max + A03) - 1) / A03;
            this.A0B = new byte[i3 * i5];
            this.A08 = new WFa(i5 * A03 * 2 * i2);
            int i6 = ((i * i3) * 8) / A03;
            C70116W4o c70116W4o = new C70116W4o();
            c70116W4o.A00("audio/raw");
            c70116W4o.A03 = i6;
            c70116W4o.A0D = i6;
            c70116W4o.A0A = max * 2 * i2;
            c70116W4o.A04 = i2;
            c70116W4o.A0G = i;
            c70116W4o.A0C = 2;
            this.A07 = new C70130W5r(c70116W4o);
            return;
        }
        throw new VCM(AnonymousClass001.A02(i4, A03, "Expected frames per block: ", "; got: "), null, 1, true);
    }
}
