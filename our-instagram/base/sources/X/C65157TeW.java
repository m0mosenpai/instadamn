package X;

import java.net.ProtocolException;

/* renamed from: X.TeW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65157TeW extends AbstractC64839TWf {
    public long A00;
    public boolean A01;
    public final C63379Sit A02;
    public final /* synthetic */ TWR A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65157TeW(C63379Sit c63379Sit, TWR twr) {
        super(twr);
        this.A03 = twr;
        this.A00 = -1L;
        this.A01 = true;
        this.A02 = c63379Sit;
    }

    @Override // X.AbstractC64839TWf, X.InterfaceC65677Tr7
    public final long E7q(TWX twx, long j) {
        if (j >= 0) {
            if (!super.A00) {
                if (!this.A01) {
                    return -1L;
                }
                long j2 = this.A00;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        this.A03.A06.E8U();
                    }
                    try {
                        TWR twr = this.A03;
                        InterfaceC65701TsN interfaceC65701TsN = twr.A06;
                        this.A00 = interfaceC65701TsN.E89();
                        String trim = interfaceC65701TsN.E8U().trim();
                        long j3 = this.A00;
                        if (j3 >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                            if (j3 == 0) {
                                this.A01 = false;
                                C63365SiO A00 = TWR.A00(twr);
                                twr.A02 = A00;
                                AbstractC63263SgM.A01(twr.A03.A0I, A00, this.A02);
                                A00();
                            }
                            if (!this.A01) {
                                return -1L;
                            }
                        } else {
                            throw new ProtocolException(AnonymousClass001.A0r("expected chunk size and optional extensions but was \"", trim, "\"", j3));
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long E7q = super.E7q(twx, Math.min(j, this.A00));
                if (E7q != -1) {
                    this.A00 -= E7q;
                    return E7q;
                }
                this.A03.A04.A01();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                A00();
                throw protocolException;
            }
            throw AbstractC58321PtD.A0k();
        }
        throw AbstractC58319PtB.A0h("byteCount < 0: ", j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (X.AbstractC63404SjZ.A0C(java.util.concurrent.TimeUnit.MILLISECONDS, r2, 100) == false) goto L9;
     */
    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r2 = this;
            boolean r0 = r2.A00
            if (r0 != 0) goto L1f
            boolean r0 = r2.A01
            if (r0 == 0) goto L1c
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 100
            boolean r0 = X.AbstractC63404SjZ.A0C(r1, r2, r0)     // Catch: java.io.IOException -> L12
            if (r0 != 0) goto L1c
        L12:
            X.TWR r0 = r2.A03
            X.TeX r0 = r0.A04
            r0.A01()
            r2.A00()
        L1c:
            r0 = 1
            r2.A00 = r0
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65157TeW.close():void");
    }
}
