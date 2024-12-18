package X;

import java.io.InputStream;

/* renamed from: X.ReG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61044ReG extends InputStream {
    public int A00;
    public byte[] A01;
    public final int A02;
    public final C16H A03;
    public final InputStream A04;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        if (this.A01 == null) {
            this.A04.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        if (this.A01 == null) {
            this.A04.reset();
        }
    }

    private void A00() {
        byte[] bArr = this.A01;
        if (bArr != null) {
            this.A01 = null;
            C16H c16h = this.A03;
            if (c16h != null) {
                c16h.A02(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.A01 != null) {
            return this.A02 - this.A00;
        }
        return this.A04.available();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        if (this.A01 == null && this.A04.markSupported()) {
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j2;
        if (this.A01 != null) {
            int i = this.A02;
            int i2 = this.A00;
            j2 = i - i2;
            if (j2 > j) {
                this.A00 = i2 + ((int) j);
                return j;
            }
            A00();
            j -= j2;
        } else {
            j2 = 0;
        }
        if (j > 0) {
            return j2 + this.A04.skip(j);
        }
        return j2;
    }

    public C61044ReG(C16H c16h, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.A03 = c16h;
        this.A04 = inputStream;
        this.A01 = bArr;
        this.A00 = i;
        this.A02 = i2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        A00();
        this.A04.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.A01;
        if (bArr2 != null) {
            int i3 = this.A02;
            int i4 = this.A00;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.A00 + i2;
            this.A00 = i6;
            if (i6 >= i3) {
                A00();
            }
            return i2;
        }
        return this.A04.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.A01;
        if (bArr != null) {
            int i = this.A00;
            int i2 = i + 1;
            this.A00 = i2;
            int i3 = bArr[i] & 255;
            if (i2 >= this.A02) {
                A00();
            }
            return i3;
        }
        return this.A04.read();
    }
}
