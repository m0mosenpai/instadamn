package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.53C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53C extends InputStream {
    public boolean A00;
    public final C53B A01;
    public final ByteArrayOutputStream A02 = new ByteArrayOutputStream();
    public final InputStream A03;

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.A03.available();
        } catch (IOException e) {
            C0K8.A0C("AtomicStreamDeferWrapper", "Exception on available input stream");
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.A03.close();
            if (!this.A00) {
                this.A01.Dgm(this.A02);
                this.A00 = true;
            }
        } catch (IOException e) {
            C0K8.A0C("AtomicStreamDeferWrapper", "Exception on close input stream");
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new RuntimeException("Operation not supported");
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        throw new RuntimeException("Operation not supported");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            int read = this.A03.read(bArr);
            if (read != -1 && bArr != null) {
                this.A02.write(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            C0K8.A0C("AtomicStreamDeferWrapper", "Exception on read response input stream");
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new RuntimeException("Operation not supported");
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        throw new RuntimeException("Operation not supported");
    }

    public C53C(C53B c53b, InputStream inputStream) {
        this.A03 = inputStream;
        this.A01 = c53b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.A03.read(bArr, i, i2);
            if (read != -1 && bArr != null) {
                this.A02.write(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            C0K8.A0C("AtomicStreamDeferWrapper", "Exception on read response input stream");
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            int read = this.A03.read();
            if (read != -1) {
                this.A02.write(read);
            }
            return read;
        } catch (IOException e) {
            C0K8.A0C("AtomicStreamDeferWrapper", "Exception on read response input stream");
            throw e;
        }
    }
}
