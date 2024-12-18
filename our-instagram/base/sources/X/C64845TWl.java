package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.TWl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64845TWl implements InterfaceC65677Tr7 {
    public final /* synthetic */ InputStream A00;
    public final /* synthetic */ C63030Sb2 A01;

    public C64845TWl(InputStream inputStream, C63030Sb2 c63030Sb2) {
        this.A01 = c63030Sb2;
        this.A00 = inputStream;
    }

    @Override // X.InterfaceC65677Tr7
    public final long E7q(TWX twx, long j) {
        if (j >= 0) {
            if (j == 0) {
                return 0L;
            }
            try {
                this.A01.A06();
                C63304ShA A09 = twx.A09(1);
                int read = this.A00.read(A09.A06, A09.A00, (int) Math.min(j, 8192 - r4));
                if (read == -1) {
                    if (A09.A01 == A09.A00) {
                        C63304ShA.A01(twx, A09);
                        return -1L;
                    }
                    return -1L;
                }
                A09.A00 += read;
                long j2 = read;
                twx.A00 += j2;
                return j2;
            } catch (AssertionError e) {
                if (e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed")) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw AbstractC58319PtB.A0h("byteCount < 0: ", j);
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return this.A01;
    }

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.A00.close();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("source(");
        return AbstractC58323PtF.A0q(this.A00, A1C);
    }
}
