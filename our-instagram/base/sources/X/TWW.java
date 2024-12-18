package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class TWW implements InterfaceC65701TsN {
    public boolean A00;
    public final TWX A01 = new Object();
    public final InterfaceC65677Tr7 A02;

    @Override // X.InterfaceC65701TsN
    public final long CNM(byte b) {
        return A01((byte) 0, Long.MAX_VALUE);
    }

    @Override // X.InterfaceC65701TsN
    public final void readFully(byte[] bArr) {
        try {
            EJO(bArr.length);
            this.A01.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                TWX twx = this.A01;
                long j = twx.A00;
                if (j > 0) {
                    int A02 = twx.A02(bArr, i, (int) j);
                    if (A02 != -1) {
                        i += A02;
                    } else {
                        throw AbstractC58318PtA.A0V();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public static long A00(TWX twx, TWW tww) {
        return tww.A02.E7q(twx, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
    }

    public final long A01(byte b, long j) {
        long j2 = 0;
        if (!this.A00) {
            if (j < 0) {
                throw AbstractC58319PtB.A0j("fromIndex=%s toIndex=%s", new Object[]{0L, Long.valueOf(j)});
            }
            while (j2 < j) {
                TWX twx = this.A01;
                long A03 = twx.A03(b, j2, j);
                if (A03 != -1) {
                    return A03;
                }
                long j3 = twx.A00;
                if (j3 >= j || A00(twx, this) == -1) {
                    break;
                }
                j2 = Math.max(j2, j3);
            }
            return -1L;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65701TsN
    public final TWX AEK() {
        return this.A01;
    }

    @Override // X.InterfaceC65701TsN
    public final boolean ATd() {
        if (!this.A00) {
            TWX twx = this.A01;
            if (twx.ATd() && A00(twx, this) == -1) {
                return true;
            }
            return false;
        }
        throw AbstractC58321PtD.A0k();
    }

    @Override // X.InterfaceC65701TsN
    public final TWX Aid() {
        return this.A01;
    }

    @Override // X.InterfaceC65701TsN
    public final long CNO(C64531TIl c64531TIl) {
        long j = 0;
        if (this.A00) {
            throw AbstractC58321PtD.A0k();
        }
        while (true) {
            TWX twx = this.A01;
            long A04 = twx.A04(c64531TIl, j);
            if (A04 == -1) {
                long j2 = twx.A00;
                if (A00(twx, this) == -1) {
                    return -1L;
                }
                j = Math.max(j, j2);
            } else {
                return A04;
            }
        }
    }

    @Override // X.InterfaceC65701TsN
    public final InputStream COZ() {
        return new C61040ReC(this);
    }

    @Override // X.InterfaceC65677Tr7
    public final long E7q(TWX twx, long j) {
        if (twx != null) {
            if (j >= 0) {
                if (!this.A00) {
                    TWX twx2 = this.A01;
                    if (twx2.A00 == 0 && A00(twx2, this) == -1) {
                        return -1L;
                    }
                    return twx2.E7q(twx, Math.min(j, twx2.A00));
                }
                throw AbstractC58321PtD.A0k();
            }
            throw AbstractC58319PtB.A0h("byteCount < 0: ", j);
        }
        throw AbstractC166987dD.A12("sink == null");
    }

    @Override // X.InterfaceC65701TsN
    public final long E89() {
        byte A00;
        byte b;
        EJO(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!EIz(i2)) {
                break;
            }
            A00 = this.A01.A00(i);
            if (A00 < 48) {
                break;
            }
            if (A00 > 57) {
                if (A00 >= 97) {
                    b = 102;
                } else {
                    if (A00 < 65) {
                        break;
                    }
                    b = 70;
                }
                if (A00 > b) {
                    break;
                }
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(A00)));
        }
        return this.A01.E89();
    }

    @Override // X.InterfaceC65701TsN
    public final int E8C() {
        EJO(4L);
        return this.A01.E8C();
    }

    @Override // X.InterfaceC65701TsN
    public final short E8Q() {
        EJO(2L);
        return this.A01.E8Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.TWX, java.lang.Object] */
    @Override // X.InterfaceC65701TsN
    public final String E8V(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long A01 = A01((byte) 10, j2);
            if (A01 != -1) {
                return this.A01.A06(A01);
            }
            if (j2 < Long.MAX_VALUE && EIz(j2)) {
                TWX twx = this.A01;
                if (twx.A00(j2 - 1) == 13 && EIz(1 + j2) && twx.A00(j2) == 10) {
                    return twx.A06(j2);
                }
            }
            ?? obj = new Object();
            TWX twx2 = this.A01;
            twx2.A0H(obj, 0L, Math.min(32L, twx2.A00));
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("\\n not found: limit=");
            A1C.append(Math.min(twx2.A00, j));
            A1C.append(" content=");
            A1C.append(obj.A08().A06());
            throw new EOFException(MSX.A0l(A1C, (char) 8230));
        }
        throw AbstractC58319PtB.A0h("limit < 0: ", j);
    }

    @Override // X.InterfaceC65701TsN
    public final boolean EIz(long j) {
        TWX twx;
        if (j >= 0) {
            if (this.A00) {
                throw AbstractC58321PtD.A0k();
            }
            do {
                twx = this.A01;
                if (twx.A00 >= j) {
                    return true;
                }
            } while (A00(twx, this) != -1);
            return false;
        }
        throw AbstractC58319PtB.A0h("byteCount < 0: ", j);
    }

    @Override // X.InterfaceC65701TsN
    public final int EMo(TZE tze) {
        TWX twx;
        if (this.A00) {
            throw AbstractC58321PtD.A0k();
        }
        do {
            twx = this.A01;
            int A01 = twx.A01(tze, true);
            if (A01 == -1) {
                break;
            }
            if (A01 != -2) {
                twx.Em6(tze.A01[A01].A05());
                return A01;
            }
        } while (A00(twx, this) != -1);
        return -1;
    }

    @Override // X.InterfaceC65701TsN
    public final void Em6(long j) {
        if (this.A00) {
            throw AbstractC58321PtD.A0k();
        }
        while (j > 0) {
            TWX twx = this.A01;
            if (twx.A00 == 0 && A00(twx, this) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, twx.A00);
            twx.Em6(min);
            j -= min;
        }
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return this.A02.Eq9();
    }

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.A00) {
            this.A00 = true;
            this.A02.close();
            this.A01.A0A();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.A00;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        TWX twx = this.A01;
        if (twx.A00 == 0 && A00(twx, this) == -1) {
            return -1;
        }
        return twx.read(byteBuffer);
    }

    @Override // X.InterfaceC65701TsN
    public final byte readByte() {
        EJO(1L);
        return this.A01.readByte();
    }

    @Override // X.InterfaceC65701TsN
    public final int readInt() {
        EJO(4L);
        return this.A01.readInt();
    }

    @Override // X.InterfaceC65701TsN
    public final long readLong() {
        EJO(8L);
        return this.A01.readLong();
    }

    @Override // X.InterfaceC65701TsN
    public final short readShort() {
        EJO(2L);
        return this.A01.readShort();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TWX, java.lang.Object] */
    public TWW(InterfaceC65677Tr7 interfaceC65677Tr7) {
        this.A02 = interfaceC65677Tr7;
    }

    @Override // X.InterfaceC65701TsN
    public final byte[] E7v(long j) {
        EJO(j);
        return this.A01.E7v(j);
    }

    @Override // X.InterfaceC65701TsN
    public final C64531TIl E7w(long j) {
        EJO(j);
        return this.A01.E7w(j);
    }

    @Override // X.InterfaceC65701TsN
    public final void E87(TWX twx, long j) {
        try {
            EJO(j);
            this.A01.E87(twx, j);
        } catch (EOFException e) {
            do {
            } while (this.A01.E7q(twx, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED) != -1);
            throw e;
        }
    }

    @Override // X.InterfaceC65701TsN
    public final void EJO(long j) {
        if (EIz(j)) {
        } else {
            throw new EOFException();
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("buffer(");
        return AbstractC58323PtF.A0q(this.A02, A1C);
    }

    @Override // X.InterfaceC65701TsN
    public final String E8U() {
        return E8V(Long.MAX_VALUE);
    }
}
