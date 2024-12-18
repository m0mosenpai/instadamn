package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0Tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06060Tv implements InterfaceC20670zm, InterfaceC14780os {
    public final int A00;

    public C06060Tv() {
    }

    @Override // X.InterfaceC20670zm
    public final boolean AH8() {
        return false;
    }

    @Override // X.InterfaceC14780os
    public final InputStream BI5(final InputStream inputStream) {
        final int i = this.A00;
        return new InputStream(inputStream, i) { // from class: X.0zn
            public IOException A00 = null;
            public InputStream A01;
            public final C13930nJ A02;

            {
                this.A01 = inputStream;
                this.A02 = new C13930nJ(i);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                InputStream inputStream2 = this.A01;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } finally {
                        this.A01 = null;
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

            @Override // java.io.InputStream
            public final int available() {
                InputStream inputStream2 = this.A01;
                if (inputStream2 != null) {
                    IOException iOException = this.A00;
                    if (iOException == null) {
                        return inputStream2.available();
                    }
                    throw iOException;
                }
                throw new IOException("Stream closed");
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i2, int i3) {
                if (i3 == 0) {
                    return 0;
                }
                InputStream inputStream2 = this.A01;
                if (inputStream2 != null) {
                    IOException iOException = this.A00;
                    if (iOException == null) {
                        try {
                            int read = inputStream2.read(bArr, i2, i3);
                            if (read == -1) {
                                return -1;
                            }
                            C13930nJ c13930nJ = this.A02;
                            int i4 = read + i2;
                            while (i2 < i4) {
                                byte b = bArr[i2];
                                byte[] bArr2 = c13930nJ.A02;
                                int i5 = c13930nJ.A01;
                                int i6 = c13930nJ.A00;
                                byte b2 = (byte) (b + bArr2[(i5 + i6) & 255]);
                                bArr[i2] = b2;
                                c13930nJ.A00 = i6 - 1;
                                bArr2[i6 & 255] = b2;
                                i2++;
                            }
                            return read;
                        } catch (IOException e) {
                            this.A00 = e;
                            throw e;
                        }
                    }
                    throw iOException;
                }
                throw new IOException("Stream closed");
            }
        };
    }

    @Override // X.InterfaceC14780os
    public final int BSI() {
        return 1;
    }

    @Override // X.InterfaceC20670zm
    public final boolean Cgc() {
        return false;
    }

    @Override // X.InterfaceC20670zm
    public final boolean Ct0() {
        return true;
    }

    public C06060Tv(byte[] bArr) {
        if (bArr.length == 1) {
            this.A00 = (bArr[0] & 255) + 1;
            return;
        }
        throw new IOException("Unsupported Delta filter properties");
    }
}
