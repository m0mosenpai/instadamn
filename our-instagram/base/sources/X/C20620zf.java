package X;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/* renamed from: X.0zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20620zf extends InputStream {
    public InputStream A00;
    public C20570za A01;
    public int A02;
    public AbstractC20580zb A05;
    public C20700zp A04 = null;
    public final C13520me A07 = new C13520me();
    public boolean A06 = false;
    public IOException A03 = null;

    public C20620zf(InputStream inputStream) {
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        A00(inputStream, bArr, -1);
    }

    public C20620zf(InputStream inputStream, byte[] bArr, int i) {
        A00(inputStream, bArr, i);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.A00;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.A00 = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != -1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    private void A00(InputStream inputStream, byte[] bArr, int i) {
        AbstractC20580zb abstractC20580zb;
        this.A00 = inputStream;
        this.A02 = i;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = AbstractC20610ze.A01;
            if (i2 < 6) {
                if (bArr[i2] == bArr2[i2]) {
                    i2++;
                } else {
                    throw new C20600zd() { // from class: X.0oG
                    };
                }
            } else {
                if (AbstractC14030nT.A01(bArr, 6, 2, 8)) {
                    try {
                        if (bArr[6] == 0) {
                            byte b = bArr[7];
                            if ((b & 255) < 16) {
                                C20570za c20570za = new C20570za();
                                c20570za.A00 = b;
                                this.A01 = c20570za;
                                if (b != 0) {
                                    if (b != 1) {
                                        if (b != 4) {
                                            if (b == 10) {
                                                try {
                                                    abstractC20580zb = new C14050nV();
                                                } catch (NoSuchAlgorithmException unused) {
                                                }
                                            }
                                            StringBuffer stringBuffer = new StringBuffer();
                                            stringBuffer.append("Unsupported Check ID ");
                                            stringBuffer.append((int) b);
                                            throw new IOException(stringBuffer.toString());
                                        }
                                        abstractC20580zb = new C14230nn();
                                    } else {
                                        abstractC20580zb = new C14340ny();
                                    }
                                } else {
                                    abstractC20580zb = new AbstractC20580zb() { // from class: X.0nm
                                        @Override // X.AbstractC20580zb
                                        public final void A00(byte[] bArr3, int i3, int i4) {
                                        }

                                        @Override // X.AbstractC20580zb
                                        public final byte[] A01() {
                                            return new byte[0];
                                        }

                                        {
                                            this.A00 = 0;
                                            this.A01 = "None";
                                        }
                                    };
                                }
                                this.A05 = abstractC20580zb;
                                return;
                            }
                        }
                        throw new IOException();
                    } catch (C14590oX unused2) {
                        throw new IOException("Unsupported options in XZ Stream Header");
                    }
                }
                throw new IOException("XZ Stream Header is corrupt");
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.A00 != null) {
            IOException iOException = this.A03;
            if (iOException == null) {
                C20700zp c20700zp = this.A04;
                if (c20700zp == null) {
                    return 0;
                }
                return c20700zp.A03.available();
            }
            throw iOException;
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2;
        int i5 = i;
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0 && i3 <= bArr.length) {
            int i6 = 0;
            if (i2 != 0) {
                if (this.A00 != null) {
                    IOException iOException = this.A03;
                    if (iOException == null) {
                        if (!this.A06) {
                            while (true) {
                                try {
                                    C20700zp c20700zp = this.A04;
                                    if (c20700zp == null) {
                                        try {
                                            c20700zp = new C20700zp(this.A00, this.A05, this.A02);
                                            this.A04 = c20700zp;
                                        } catch (C20650zk unused) {
                                            C13520me c13520me = this.A07;
                                            InputStream inputStream = this.A00;
                                            CRC32 crc32 = new CRC32();
                                            int i7 = 0;
                                            crc32.update(0);
                                            CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
                                            if (AbstractC14030nT.A00(checkedInputStream) == c13520me.A02) {
                                                C13520me c13520me2 = new C13520me();
                                                for (long j = 0; j < c13520me.A02; j++) {
                                                    try {
                                                        c13520me2.A01(AbstractC14030nT.A00(checkedInputStream), AbstractC14030nT.A00(checkedInputStream));
                                                        if (((AbstractC20550zX) c13520me2).A00 > ((AbstractC20550zX) c13520me).A00 || c13520me2.A03 > c13520me.A03 || c13520me2.A01 > c13520me.A01) {
                                                            throw new IOException("XZ Index is corrupt");
                                                        }
                                                    } catch (C20600zd unused2) {
                                                        throw new IOException("XZ Index is corrupt");
                                                    }
                                                }
                                                if (((AbstractC20550zX) c13520me2).A00 == ((AbstractC20550zX) c13520me).A00 && c13520me2.A03 == c13520me.A03 && c13520me2.A01 == c13520me.A01 && Arrays.equals(c13520me2.A00.A01(), c13520me.A00.A01())) {
                                                    DataInputStream dataInputStream = new DataInputStream(checkedInputStream);
                                                    long j2 = c13520me.A02;
                                                    int i8 = 0;
                                                    do {
                                                        i8++;
                                                        j2 >>= 7;
                                                    } while (j2 != 0);
                                                    for (int i9 = (int) (3 & (4 - (((i8 + 1) + c13520me.A01) + 4))); i9 > 0; i9--) {
                                                        if (dataInputStream.readUnsignedByte() != 0) {
                                                            throw new IOException("XZ Index is corrupt");
                                                        }
                                                    }
                                                    long value = crc32.getValue();
                                                    while (((value >>> (i7 * 8)) & 255) == dataInputStream.readUnsignedByte()) {
                                                        i7++;
                                                        if (i7 >= 4) {
                                                            byte[] bArr2 = new byte[12];
                                                            new DataInputStream(this.A00).readFully(bArr2);
                                                            byte b = bArr2[10];
                                                            byte[] bArr3 = AbstractC20610ze.A00;
                                                            int i10 = 0;
                                                            if (b == bArr3[0] && bArr2[11] == bArr3[1]) {
                                                                if (AbstractC14030nT.A01(bArr2, 4, 6, 0)) {
                                                                    try {
                                                                        if (bArr2[8] == 0) {
                                                                            byte b2 = bArr2[9];
                                                                            if ((b2 & 255) < 16) {
                                                                                long j3 = 0;
                                                                                do {
                                                                                    j3 |= (bArr2[i10 + 4] & 255) << (i10 * 8);
                                                                                    i10++;
                                                                                } while (i10 < 4);
                                                                                long j4 = (j3 + 1) * 4;
                                                                                if (this.A01.A00 == b2 && c13520me.A00() == j4) {
                                                                                    this.A06 = true;
                                                                                    if (i6 > 0) {
                                                                                        return i6;
                                                                                    }
                                                                                } else {
                                                                                    throw new IOException("XZ Stream Footer does not match Stream Header");
                                                                                }
                                                                            }
                                                                        }
                                                                        throw new IOException();
                                                                    } catch (C14590oX unused3) {
                                                                        throw new IOException("Unsupported options in XZ Stream Footer");
                                                                    }
                                                                }
                                                                throw new IOException("XZ Stream Footer is corrupt");
                                                            }
                                                            throw new IOException("XZ Stream Footer is corrupt");
                                                        }
                                                    }
                                                    throw new IOException("XZ Index is corrupt");
                                                }
                                                throw new IOException("XZ Index is corrupt");
                                            }
                                            throw new IOException("XZ Index is corrupt");
                                        }
                                    }
                                    int read = c20700zp.read(bArr, i5, i4);
                                    if (read > 0) {
                                        i6 += read;
                                        i5 += read;
                                        i4 -= read;
                                        if (i4 <= 0) {
                                            break;
                                        }
                                    } else if (read == -1) {
                                        C13520me c13520me3 = this.A07;
                                        C20700zp c20700zp2 = this.A04;
                                        c13520me3.A01(c20700zp2.A06 + c20700zp2.A08.A00 + c20700zp2.A09.A00, c20700zp2.A01);
                                        this.A04 = null;
                                    }
                                } catch (IOException e) {
                                    this.A03 = e;
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    throw e;
                                }
                            }
                        }
                        return -1;
                    }
                    throw iOException;
                }
                throw new IOException("Stream closed");
            }
            return i6;
        }
        throw new IndexOutOfBoundsException();
    }
}
