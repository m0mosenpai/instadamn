package X;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: X.TWe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64838TWe implements InterfaceC65679Tr9 {
    public long A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC65679Tr9 A03;
    public final /* synthetic */ SO5 A04;

    public C64838TWe(SO5 so5, InterfaceC65679Tr9 interfaceC65679Tr9) {
        this.A04 = so5;
        if (interfaceC65679Tr9 != null) {
            this.A03 = interfaceC65679Tr9;
            return;
        }
        throw AbstractC166987dD.A12("delegate == null");
    }

    private IOException A00(IOException iOException) {
        if (!this.A02) {
            this.A02 = true;
            SO5 so5 = this.A04;
            if (iOException != null) {
                so5.A01(iOException);
            }
            return so5.A03.A02(iOException, so5, true, false);
        }
        return iOException;
    }

    @Override // X.InterfaceC65679Tr9
    public final C63030Sb2 Eq9() {
        return this.A03.Eq9();
    }

    @Override // X.InterfaceC65679Tr9
    public final void FEM(TWX twx, long j) {
        if (!this.A01) {
            long j2 = this.A00 + j;
            if (j2 <= 0) {
                try {
                    this.A03.FEM(twx, j);
                    this.A00 += j;
                    return;
                } catch (IOException e) {
                    throw A00(e);
                }
            }
            throw new ProtocolException(AnonymousClass001.A0f("expected ", " bytes but received ", 0L, j2));
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65679Tr9, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.A01) {
            this.A01 = true;
            if (this.A00 == 0) {
                try {
                    this.A03.close();
                    A00(null);
                    return;
                } catch (IOException e) {
                    throw A00(e);
                }
            }
            throw new ProtocolException("unexpected end of stream");
        }
    }

    @Override // X.InterfaceC65679Tr9, java.io.Flushable
    public final void flush() {
        try {
            this.A03.flush();
        } catch (IOException e) {
            throw A00(e);
        }
    }

    public final String toString() {
        return AnonymousClass001.A0u(AbstractC31173DnH.A0q(this), "(", this.A03.toString(), ")");
    }
}
