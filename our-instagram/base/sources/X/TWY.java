package X;

/* loaded from: classes10.dex */
public final class TWY implements InterfaceC65679Tr9 {
    public boolean A00;
    public final /* synthetic */ SZF A01;

    public TWY(SZF szf) {
        this.A01 = szf;
    }

    @Override // X.InterfaceC65679Tr9
    public final C63030Sb2 Eq9() {
        return this.A01.A05.Eq9();
    }

    @Override // X.InterfaceC65679Tr9
    public final void FEM(TWX twx, long j) {
        if (!this.A00) {
            SZF szf = this.A01;
            TWX twx2 = szf.A03;
            twx2.FEM(twx, j);
            long j2 = twx2.A00;
            if (j2 != 0) {
                C63304ShA c63304ShA = twx2.A01.A03;
                if (c63304ShA.A00 < 8192 && c63304ShA.A04) {
                    j2 -= r1 - c63304ShA.A01;
                }
                if (j2 > 0) {
                    szf.A01(j2, false);
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC58321PtD.A0g();
    }

    @Override // X.InterfaceC65679Tr9, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.A00) {
            SZF szf = this.A01;
            szf.A01(szf.A03.A00, true);
            this.A00 = true;
            return;
        }
        throw AbstractC58321PtD.A0g();
    }

    @Override // X.InterfaceC65679Tr9, java.io.Flushable
    public final void flush() {
        if (!this.A00) {
            SZF szf = this.A01;
            szf.A01(szf.A03.A00, false);
            return;
        }
        throw AbstractC58321PtD.A0g();
    }
}
