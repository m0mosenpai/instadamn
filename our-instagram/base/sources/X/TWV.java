package X;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TWV implements InterfaceC65700TsM {
    public boolean A00;
    public final TWX A01 = new Object();
    public final InterfaceC65679Tr9 A02;

    public final void A00() {
        if (!this.A00) {
            TWX twx = this.A01;
            long j = twx.A00;
            if (j != 0) {
                C63304ShA c63304ShA = twx.A01.A03;
                if (c63304ShA.A00 < 8192 && c63304ShA.A04) {
                    j -= r1 - c63304ShA.A01;
                }
                if (j > 0) {
                    this.A02.FEM(twx, j);
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65700TsM
    public final TWX AEK() {
        return this.A01;
    }

    @Override // X.InterfaceC65700TsM
    public final InterfaceC65700TsM ARO() {
        if (!this.A00) {
            TWX twx = this.A01;
            long j = twx.A00;
            if (j > 0) {
                this.A02.FEM(twx, j);
            }
            return this;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65679Tr9
    public final C63030Sb2 Eq9() {
        return this.A02.Eq9();
    }

    @Override // X.InterfaceC65700TsM
    public final InterfaceC65700TsM FEG(byte[] bArr) {
        if (!this.A00) {
            this.A01.A0I(bArr);
            A00();
            return this;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65679Tr9
    public final void FEM(TWX twx, long j) {
        if (!this.A00) {
            this.A01.FEM(twx, j);
            A00();
            return;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65700TsM
    public final InterfaceC65700TsM FER(int i) {
        if (!this.A00) {
            this.A01.A0B(i);
            A00();
            return this;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65700TsM
    public final InterfaceC65700TsM FEX(long j) {
        if (!this.A00) {
            this.A01.A0F(j);
            A00();
            return this;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65700TsM
    public final InterfaceC65700TsM FEZ(int i) {
        if (!this.A00) {
            this.A01.A0C(i);
            A00();
            return this;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65700TsM
    public final InterfaceC65700TsM FEj(int i) {
        if (!this.A00) {
            this.A01.A0D(i);
            A00();
            return this;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65700TsM
    public final InterfaceC65700TsM FEs(String str) {
        if (!this.A00) {
            this.A01.A0G(str, 0, str.length());
            A00();
            return this;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65679Tr9, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.A00) {
            Throwable th = null;
            try {
                TWX twx = this.A01;
                long j = twx.A00;
                if (j > 0) {
                    this.A02.FEM(twx, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.A02.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.A00 = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC65700TsM, X.InterfaceC65679Tr9, java.io.Flushable
    public final void flush() {
        if (!this.A00) {
            TWX twx = this.A01;
            long j = twx.A00;
            if (j > 0) {
                this.A02.FEM(twx, j);
            }
            this.A02.flush();
            return;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.A00;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.A00) {
            int write = this.A01.write(byteBuffer);
            A00();
            return write;
        }
        throw AbstractC58321PtD.A0k();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TWX, java.lang.Object] */
    public TWV(InterfaceC65679Tr9 interfaceC65679Tr9) {
        this.A02 = interfaceC65679Tr9;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("buffer(");
        return AbstractC58323PtF.A0q(this.A02, A1C);
    }
}
