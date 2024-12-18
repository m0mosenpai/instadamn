package X;

import androidx.media3.common.util.Util;

/* renamed from: X.WRv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70341WRv implements InterfaceC71878X8l {
    public final int A00;
    public final C69318VlQ A01;
    public final long A02;
    public final long A03;
    public final long A04;

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        C69318VlQ c69318VlQ = this.A01;
        long j2 = c69318VlQ.A03;
        long j3 = this.A00;
        long j4 = this.A02 - 1;
        long A09 = AbstractC65703TsZ.A09((j2 * j) / (j3 * 1000000), j4);
        long j5 = this.A04;
        long j6 = c69318VlQ.A01;
        long A06 = Util.A06(A09 * j3, j2);
        W5N w5n = new W5N(A06, j5 + (j6 * A09));
        if (A06 < j && A09 != j4) {
            long j7 = A09 + 1;
            return new C69736VuW(w5n, new W5N(Util.A06(j7 * j3, j2), j5 + (j6 * j7)));
        }
        return new C69736VuW(w5n, w5n);
    }

    public C70341WRv(C69318VlQ c69318VlQ, int i, long j, long j2) {
        this.A01 = c69318VlQ;
        this.A00 = i;
        this.A04 = j;
        long j3 = (j2 - j) / c69318VlQ.A01;
        this.A02 = j3;
        this.A03 = Util.A06(j3 * i, c69318VlQ.A03);
    }
}
