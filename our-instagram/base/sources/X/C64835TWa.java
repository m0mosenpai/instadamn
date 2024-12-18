package X;

/* renamed from: X.TWa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64835TWa implements InterfaceC65679Tr9 {
    public boolean A00;
    public final C65170Tej A01;
    public final /* synthetic */ TWR A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Tej] */
    public C64835TWa(TWR twr) {
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
            long j2 = twx.A00;
            byte[] bArr = AbstractC63404SjZ.A07;
            if (j >= 0 && 0 <= j2 && j2 >= j) {
                this.A02.A05.FEM(twx, j);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65679Tr9, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.A00) {
            this.A00 = true;
            TWR twr = this.A02;
            C65170Tej c65170Tej = this.A01;
            C63030Sb2 c63030Sb2 = c65170Tej.A00;
            c65170Tej.A00 = C63030Sb2.A03;
            c63030Sb2.A02();
            c63030Sb2.A03();
            twr.A00 = 3;
        }
    }

    @Override // X.InterfaceC65679Tr9, java.io.Flushable
    public final void flush() {
        if (!this.A00) {
            this.A02.A05.flush();
        }
    }
}
