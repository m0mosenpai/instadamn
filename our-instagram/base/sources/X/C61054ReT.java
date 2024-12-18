package X;

import java.io.CharConversionException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: X.ReT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61054ReT extends Reader {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InputStream A04;
    public byte[] A05;
    public char A06 = 0;
    public char[] A07;
    public final C16H A08;
    public final boolean A09;
    public final boolean A0A;

    private void A00(int i) {
        int i2 = this.A00 + i;
        int i3 = this.A01;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ");
        A1C.append(i);
        A1C.append(", needed ");
        A1C.append(4);
        A1C.append(", at char #");
        A1C.append(i3);
        A1C.append(", byte #");
        A1C.append(i2);
        throw new CharConversionException(AbstractC166997dE.A0x(")", A1C));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.A04;
        if (inputStream != null) {
            this.A04 = null;
            byte[] bArr = this.A05;
            if (bArr != null) {
                this.A05 = null;
                C16H c16h = this.A08;
                if (c16h != null) {
                    c16h.A02(bArr);
                }
            }
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr;
        byte[] bArr2;
        int i5;
        int i6;
        byte[] bArr3 = this.A05;
        if (bArr3 != null) {
            if (i2 < 1) {
                return i2;
            }
            if (i >= 0 && (i3 = i + i2) <= cArr.length) {
                char c = this.A06;
                if (c != 0) {
                    i4 = i + 1;
                    cArr[i] = c;
                    this.A06 = (char) 0;
                } else {
                    int i7 = this.A02;
                    int i8 = this.A03;
                    int i9 = i7 - i8;
                    if (i9 < 4) {
                        int i10 = i9;
                        InputStream inputStream = this.A04;
                        if (inputStream != null) {
                            this.A00 += i7 - i9;
                            if (i9 > 0) {
                                if (i8 > 0) {
                                    System.arraycopy(bArr3, i8, bArr3, 0, i9);
                                    this.A03 = 0;
                                }
                            } else {
                                this.A03 = 0;
                                i10 = inputStream.read(bArr3);
                                if (i10 < 1) {
                                    this.A02 = 0;
                                    if (i10 < 0) {
                                        if (this.A09 && (bArr = this.A05) != null) {
                                            this.A05 = null;
                                            C16H c16h = this.A08;
                                            if (c16h != null) {
                                                c16h.A02(bArr);
                                            }
                                        }
                                    }
                                    throw MSW.A0y("Strange I/O stream, returned 0 bytes on read");
                                }
                            }
                            while (true) {
                                this.A02 = i10;
                                if (i10 >= 4) {
                                    break;
                                }
                                InputStream inputStream2 = this.A04;
                                byte[] bArr4 = this.A05;
                                int read = inputStream2.read(bArr4, i10, bArr4.length - i10);
                                if (read < 1) {
                                    if (read < 0) {
                                        if (this.A09 && (bArr2 = this.A05) != null) {
                                            this.A05 = null;
                                            C16H c16h2 = this.A08;
                                            if (c16h2 != null) {
                                                c16h2.A02(bArr2);
                                            }
                                        }
                                        A00(this.A02);
                                        throw C00O.createAndThrow();
                                    }
                                } else {
                                    i10 = this.A02 + read;
                                }
                            }
                        }
                        if (i9 != 0) {
                            A00(this.A02 - this.A03);
                            throw C00O.createAndThrow();
                        }
                    }
                    i4 = i;
                }
                int i11 = this.A02 - 4;
                while (true) {
                    if (i4 < i3) {
                        int i12 = this.A03;
                        if (i12 > i11) {
                            break;
                        }
                        boolean z = this.A0A;
                        byte[] bArr5 = this.A05;
                        byte b = bArr5[i12];
                        if (z) {
                            i6 = (b << 8) | (bArr5[i12 + 1] & 255);
                            i5 = (bArr5[i12 + 3] & 255) | ((bArr5[i12 + 2] & 255) << 8);
                        } else {
                            i5 = (b & 255) | ((bArr5[i12 + 1] & 255) << 8);
                            i6 = (bArr5[i12 + 3] << 8) | (bArr5[i12 + 2] & 255);
                        }
                        this.A03 = i12 + 4;
                        if (i6 != 0) {
                            int i13 = 65535 & i6;
                            int i14 = i5 | ((i13 - 1) << 16);
                            if (i13 > 16) {
                                String format = String.format(" (above 0x%08x)", AbstractC25228BEl.A1Y(1114111));
                                int i15 = (this.A00 + this.A03) - 1;
                                int i16 = this.A01;
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                A1C.append("Invalid UTF-32 character 0x");
                                AbstractC58318PtA.A1T(A1C, i14);
                                A1C.append(format);
                                A1C.append(" at char #");
                                A1C.append(i16 + (i4 - i));
                                A1C.append(", byte #");
                                A1C.append(i15);
                                throw new CharConversionException(AbstractC166997dE.A0x(")", A1C));
                            }
                            int i17 = i4 + 1;
                            cArr[i4] = (char) ((i14 >> 10) + 55296);
                            int i18 = 56320 | (i14 & 1023);
                            if (i17 >= i3) {
                                this.A06 = (char) i14;
                                i4 = i17;
                                break;
                            }
                            i5 = i18;
                            i4 = i17;
                        }
                        cArr[i4] = (char) i5;
                        i4++;
                    } else {
                        break;
                    }
                }
                int i19 = i4 - i;
                this.A01 += i19;
                return i19;
            }
            throw AbstractC58319PtB.A0f("read(buf,%d,%d), cbuf[%d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cArr.length)});
        }
        return -1;
    }

    public C61054ReT(C16H c16h, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.A08 = c16h;
        this.A04 = inputStream;
        this.A05 = bArr;
        this.A03 = i;
        this.A02 = i2;
        this.A0A = z;
        this.A09 = inputStream != null;
    }

    @Override // java.io.Reader
    public final int read() {
        char[] cArr = this.A07;
        if (cArr == null) {
            cArr = new char[1];
            this.A07 = cArr;
        }
        if (read(cArr, 0, 1) < 1) {
            return -1;
        }
        return this.A07[0];
    }
}
