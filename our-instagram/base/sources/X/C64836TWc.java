package X;

import java.io.OutputStream;

/* renamed from: X.TWc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64836TWc implements InterfaceC65679Tr9 {
    public final /* synthetic */ OutputStream A00;
    public final /* synthetic */ C63030Sb2 A01;

    @Override // X.InterfaceC65679Tr9
    public final void FEM(TWX twx, long j) {
        long j2 = j;
        SUN.A00(twx.A00, 0L, j2);
        while (j2 > 0) {
            this.A01.A06();
            C63304ShA c63304ShA = twx.A01;
            int i = c63304ShA.A00;
            int i2 = c63304ShA.A01;
            int min = (int) Math.min(j2, i - i2);
            this.A00.write(c63304ShA.A06, i2, min);
            int i3 = c63304ShA.A01 + min;
            c63304ShA.A01 = i3;
            long j3 = min;
            j2 -= j3;
            twx.A00 -= j3;
            if (i3 == c63304ShA.A00) {
                C63304ShA.A01(twx, c63304ShA);
            }
        }
    }

    public C64836TWc(OutputStream outputStream, C63030Sb2 c63030Sb2) {
        this.A01 = c63030Sb2;
        this.A00 = outputStream;
    }

    @Override // X.InterfaceC65679Tr9
    public final C63030Sb2 Eq9() {
        return this.A01;
    }

    @Override // X.InterfaceC65679Tr9, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.A00.close();
    }

    @Override // X.InterfaceC65679Tr9, java.io.Flushable
    public final void flush() {
        this.A00.flush();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("sink(");
        return AbstractC58323PtF.A0q(this.A00, A1C);
    }
}
