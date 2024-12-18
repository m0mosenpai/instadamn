package X;

/* loaded from: classes10.dex */
public final class TWZ implements InterfaceC65679Tr9 {
    public boolean A00;
    public final C65170Tej A01;
    public final /* synthetic */ TWR A02;

    @Override // X.InterfaceC65679Tr9, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (!this.A00) {
            this.A00 = true;
            TWR twr = this.A02;
            twr.A05.FEs("0\r\n\r\n");
            C65170Tej c65170Tej = this.A01;
            C63030Sb2 c63030Sb2 = c65170Tej.A00;
            c65170Tej.A00 = C63030Sb2.A03;
            c63030Sb2.A02();
            c63030Sb2.A03();
            twr.A00 = 3;
        }
    }

    @Override // X.InterfaceC65679Tr9, java.io.Flushable
    public final synchronized void flush() {
        if (!this.A00) {
            this.A02.A05.flush();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Tej] */
    public TWZ(TWR twr) {
        this.A02 = twr;
        C63030Sb2 c63030Sb2 = C63030Sb2.A03;
        C63030Sb2 Eq9 = twr.A05.Eq9();
        ?? obj = new Object();
        if (Eq9 != null) {
            obj.A00 = Eq9;
            this.A01 = obj;
            return;
        }
        throw AbstractC166987dD.A12("delegate == null");
    }

    @Override // X.InterfaceC65679Tr9
    public final C63030Sb2 Eq9() {
        return this.A01;
    }

    @Override // X.InterfaceC65679Tr9
    public final void FEM(TWX twx, long j) {
        if (!this.A00) {
            if (j != 0) {
                InterfaceC65700TsM interfaceC65700TsM = this.A02.A05;
                interfaceC65700TsM.FEX(j);
                interfaceC65700TsM.FEs("\r\n");
                interfaceC65700TsM.FEM(twx, j);
                interfaceC65700TsM.FEs("\r\n");
                return;
            }
            return;
        }
        throw AbstractC58321PtD.A0k();
    }
}
