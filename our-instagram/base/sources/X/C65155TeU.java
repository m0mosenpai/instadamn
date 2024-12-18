package X;

import java.net.ProtocolException;

/* renamed from: X.TeU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65155TeU extends AbstractC64839TWf {
    public long A00;
    public final /* synthetic */ TWR A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65155TeU(TWR twr, long j) {
        super(twr);
        this.A01 = twr;
        this.A00 = j;
        if (j == 0) {
            A00();
        }
    }

    @Override // X.AbstractC64839TWf, X.InterfaceC65677Tr7
    public final long E7q(TWX twx, long j) {
        if (j >= 0) {
            if (!super.A00) {
                long j2 = this.A00;
                if (j2 == 0) {
                    return -1L;
                }
                long E7q = super.E7q(twx, Math.min(j2, j));
                if (E7q != -1) {
                    long j3 = this.A00 - E7q;
                    this.A00 = j3;
                    if (j3 == 0) {
                        A00();
                    }
                    return E7q;
                }
                this.A01.A04.A01();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                A00();
                throw protocolException;
            }
            throw AbstractC58321PtD.A0k();
        }
        throw AbstractC58319PtB.A0h("byteCount < 0: ", j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (X.AbstractC63404SjZ.A0C(java.util.concurrent.TimeUnit.MILLISECONDS, r5, 100) == false) goto L9;
     */
    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            boolean r0 = r5.A00
            if (r0 != 0) goto L23
            long r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L20
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 100
            boolean r0 = X.AbstractC63404SjZ.A0C(r1, r5, r0)     // Catch: java.io.IOException -> L16
            if (r0 != 0) goto L20
        L16:
            X.TWR r0 = r5.A01
            X.TeX r0 = r0.A04
            r0.A01()
            r5.A00()
        L20:
            r0 = 1
            r5.A00 = r0
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65155TeU.close():void");
    }
}
