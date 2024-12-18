package X;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: X.TWg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64840TWg implements InterfaceC65677Tr7 {
    public int A00;
    public boolean A01;
    public final Inflater A02;
    public final InterfaceC65701TsN A03;

    @Override // X.InterfaceC65677Tr7
    public final long E7q(TWX twx, long j) {
        boolean z;
        if (j >= 0) {
            if (!this.A01) {
                if (j == 0) {
                    return 0L;
                }
                do {
                    Inflater inflater = this.A02;
                    z = false;
                    if (inflater.needsInput()) {
                        int i = this.A00;
                        if (i != 0) {
                            int remaining = i - inflater.getRemaining();
                            this.A00 -= remaining;
                            this.A03.Em6(remaining);
                        }
                        if (inflater.getRemaining() == 0) {
                            InterfaceC65701TsN interfaceC65701TsN = this.A03;
                            if (interfaceC65701TsN.ATd()) {
                                z = true;
                            } else {
                                C63304ShA c63304ShA = interfaceC65701TsN.AEK().A01;
                                int i2 = c63304ShA.A00;
                                int i3 = c63304ShA.A01;
                                int i4 = i2 - i3;
                                this.A00 = i4;
                                inflater.setInput(c63304ShA.A06, i3, i4);
                            }
                        } else {
                            throw AbstractC166987dD.A14("?");
                        }
                    }
                    try {
                        C63304ShA A09 = twx.A09(1);
                        int inflate = inflater.inflate(A09.A06, A09.A00, (int) Math.min(j, 8192 - r5));
                        if (inflate > 0) {
                            A09.A00 += inflate;
                            long j2 = inflate;
                            twx.A00 += j2;
                            return j2;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            int i5 = this.A00;
                            if (i5 != 0) {
                                int remaining2 = i5 - inflater.getRemaining();
                                this.A00 -= remaining2;
                                this.A03.Em6(remaining2);
                            }
                            if (A09.A01 == A09.A00) {
                                C63304ShA.A01(twx, A09);
                                return -1L;
                            }
                            return -1L;
                        }
                    } catch (DataFormatException e) {
                        throw new IOException(e);
                    }
                } while (!z);
                throw new EOFException("source exhausted prematurely");
            }
            throw AbstractC58321PtD.A0k();
        }
        throw AbstractC58319PtB.A0h("byteCount < 0: ", j);
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return this.A03.Eq9();
    }

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.A01) {
            this.A02.end();
            this.A01 = true;
            this.A03.close();
        }
    }

    public C64840TWg(Inflater inflater, InterfaceC65701TsN interfaceC65701TsN) {
        this.A03 = interfaceC65701TsN;
        this.A02 = inflater;
    }
}
