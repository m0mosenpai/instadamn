package X;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: X.TWm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64846TWm implements InterfaceC65677Tr7 {
    public long A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC65677Tr7 A03;
    public final long A04;
    public final /* synthetic */ SO5 A05;

    public C64846TWm(SO5 so5, InterfaceC65677Tr7 interfaceC65677Tr7, long j) {
        this.A05 = so5;
        if (interfaceC65677Tr7 != null) {
            this.A03 = interfaceC65677Tr7;
            this.A04 = j;
            if (j == 0) {
                A00(null);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12("delegate == null");
    }

    public final IOException A00(IOException iOException) {
        if (!this.A02) {
            this.A02 = true;
            SO5 so5 = this.A05;
            if (iOException != null) {
                so5.A01(iOException);
            }
            return so5.A03.A02(iOException, so5, false, true);
        }
        return iOException;
    }

    @Override // X.InterfaceC65677Tr7
    public final long E7q(TWX twx, long j) {
        if (!this.A01) {
            try {
                long E7q = this.A03.E7q(twx, j);
                if (E7q == -1) {
                    A00(null);
                    return -1L;
                }
                long j2 = this.A00 + E7q;
                long j3 = this.A04;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException(AnonymousClass001.A0f("expected ", " bytes but received ", j3, j2));
                }
                this.A00 = j2;
                if (j2 == j3) {
                    A00(null);
                }
                return E7q;
            } catch (IOException e) {
                throw A00(e);
            }
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return this.A03.Eq9();
    }

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.A01) {
            this.A01 = true;
            try {
                this.A03.close();
                A00(null);
            } catch (IOException e) {
                throw A00(e);
            }
        }
    }

    public final String toString() {
        return AnonymousClass001.A0u(AbstractC31173DnH.A0q(this), "(", this.A03.toString(), ")");
    }
}
