package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public final class UMV extends Wc6 {
    public int A00;
    public C2BB A01;
    public C2BB A02;
    public InterfaceC92334Bn A03;
    public IOException A04;
    public boolean A05;
    public boolean A06;
    public C4C7 A07;
    public final int A08;
    public final int A09;
    public final C46322Au A0A;
    public final C2Ai A0B;
    public final String A0C;
    public final boolean A0D;

    private int A00(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3 = this.A00;
        if (i3 < 0) {
            this.A00 = 0;
            i3 = 0;
        }
        int i4 = super.A00 - i3;
        if (i4 == 0 || (bArr2 = super.A03) == null) {
            return 0;
        }
        if (i4 <= i2) {
            i2 = i4;
        }
        System.arraycopy(bArr2, i3, bArr, i, i2);
        this.A00 += i2;
        return i2;
    }

    @Override // X.InterfaceC92354Bq
    public final void cancel() {
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        C2BB c2bb = this.A02;
        if (c2bb != null) {
            C4C7 c4c7 = this.A07;
            C4C7 c4c72 = C4C7.A0B;
            if (c4c7 == null) {
                c4c7 = C4C7.A0B;
            }
            c2bb.Dv9(this, c4c7, true);
            this.A02 = null;
        }
        synchronized (this) {
            this.A06 = false;
            InterfaceC92344Bp interfaceC92344Bp = super.A02;
            if (interfaceC92344Bp != null) {
                try {
                    interfaceC92344Bp.close();
                } catch (IOException unused) {
                }
                super.A02 = null;
            }
        }
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        EnumC92424Bx enumC92424Bx;
        this.A07 = c4c7;
        synchronized (this) {
            if (A03()) {
                enumC92424Bx = EnumC92424Bx.CACHED;
            } else {
                enumC92424Bx = EnumC92424Bx.SEMI_CACHED;
            }
        }
        C2BB c2bb = this.A02;
        if (c2bb != null) {
            c2bb.DvF(enumC92424Bx, c4c7);
        }
        synchronized (this) {
            if (super.A01 < 0 && super.A00 < 0) {
                try {
                    wait(this.A08);
                } catch (InterruptedException unused) {
                }
                if (super.A01 < 0 && super.A00 < 0) {
                    this.A06 = false;
                    IOException iOException = new IOException("prefetch no bytes after connect wait");
                    this.A04 = iOException;
                    C2BB c2bb2 = this.A02;
                    if (c2bb2 != null) {
                        c2bb2.DvA(iOException);
                    }
                    throw this.A04;
                }
            }
            A02(this.A02, this.A0D);
        }
        C2BB c2bb3 = this.A02;
        if (c2bb3 != null) {
            c2bb3.DvH(this, c4c7, true, this.A05);
        }
        return super.A01;
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC92344Bp interfaceC92344Bp;
        C2BB c2bb;
        while (this.A06) {
            synchronized (this) {
                int A00 = A00(bArr, i, i2);
                if (A00 > 0) {
                    C2BB c2bb2 = this.A02;
                    if (c2bb2 != null) {
                        C4C7 c4c7 = this.A07;
                        C4C7 c4c72 = C4C7.A0B;
                        if (c4c7 == null) {
                            c4c7 = C4C7.A0B;
                        }
                        c2bb2.D15(this, c4c7, A00, true);
                    }
                    return A00;
                }
                try {
                    wait(this.A09);
                } catch (InterruptedException unused) {
                }
            }
        }
        IOException iOException = this.A04;
        if (iOException != null) {
            C2BB c2bb3 = this.A02;
            if (c2bb3 != null) {
                c2bb3.DvA(iOException);
            }
            throw this.A04;
        }
        int A002 = A00(bArr, i, i2);
        if (A002 > 0) {
            C2BB c2bb4 = this.A02;
            if (c2bb4 != null) {
                C4C7 c4c73 = this.A07;
                C4C7 c4c74 = C4C7.A0B;
                if (c4c73 == null) {
                    c4c73 = C4C7.A0B;
                }
                c2bb4.D15(this, c4c73, A002, true);
            }
        } else {
            synchronized (this) {
                interfaceC92344Bp = super.A02;
            }
            if (interfaceC92344Bp == null) {
                return -1;
            }
            try {
                A002 = interfaceC92344Bp.read(bArr, i, i2);
                if (A002 > 0 && (c2bb = this.A02) != null) {
                    C4C7 c4c75 = this.A07;
                    C4C7 c4c76 = C4C7.A0B;
                    if (c4c75 == null) {
                        c4c75 = C4C7.A0B;
                    }
                    c2bb.D15(this, c4c75, A002, true);
                    return A002;
                }
            } catch (IOException e) {
                C2BB c2bb5 = this.A02;
                if (c2bb5 != null) {
                    c2bb5.DvA(e);
                }
                try {
                    interfaceC92344Bp.close();
                } catch (IOException unused2) {
                }
                super.A02 = null;
                throw e;
            }
        }
        return A002;
    }

    public UMV(C46322Au c46322Au, C2Ai c2Ai, C2BB c2bb, InterfaceC92334Bn interfaceC92334Bn, String str, int i, int i2, boolean z) {
        this.A0B = c2Ai;
        this.A0C = str;
        this.A08 = i;
        this.A09 = i2;
        this.A0A = c46322Au;
        this.A01 = c2bb;
        this.A03 = interfaceC92334Bn;
        super.A02 = null;
        super.A03 = null;
        this.A04 = null;
        super.A01 = -1;
        super.A00 = -1;
        this.A00 = -1;
        this.A06 = false;
        this.A0D = z;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        C2BB wva;
        c2bc.getClass();
        if (c2bc instanceof C2BB) {
            wva = (C2BB) c2bc;
        } else {
            wva = new WVA(c2bc);
        }
        this.A02 = wva;
    }
}
