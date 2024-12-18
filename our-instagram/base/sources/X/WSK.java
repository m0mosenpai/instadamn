package X;

import androidx.media3.common.util.Util;

/* loaded from: classes11.dex */
public final class WSK implements InterfaceC71966XCw {
    public long A00;
    public long A01;
    public C68878Vda A02;
    public C70166WEi A03;

    @Override // X.InterfaceC71966XCw
    public final InterfaceC71878X8l AN9() {
        long j = this.A00;
        WDn.A02(AbstractC167007dF.A1M((j > (-1L) ? 1 : (j == (-1L) ? 0 : -1))));
        return new C70338WRs(this.A03, j);
    }

    @Override // X.InterfaceC71966XCw
    public final long E7p(XGj xGj) {
        long j = this.A01;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.A01 = -1L;
        return j2;
    }

    @Override // X.InterfaceC71966XCw
    public final void Enx(long j) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[Util.A02(jArr, j, true)];
    }
}
