package X;

import java.io.InputStream;

/* loaded from: classes11.dex */
public final class VCN extends InputStream {
    public long A01;
    public final InterfaceC92354Bq A03;
    public final C4C7 A04;
    public boolean A00 = false;
    public boolean A02 = false;
    public final byte[] A05 = new byte[1];

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.A02) {
            this.A03.close();
            this.A02 = true;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C4B8.A04(!this.A02);
        if (!this.A00) {
            this.A03.open(this.A04);
            this.A00 = true;
        }
        int read = this.A03.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.A01 += read;
        return read;
    }

    public VCN(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7) {
        this.A03 = interfaceC92354Bq;
        this.A04 = c4c7;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.A05;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
