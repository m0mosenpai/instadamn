package X;

import java.io.OutputStream;

/* renamed from: X.0ot, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14790ot extends AbstractC20660zl {
    public long A00 = 0;
    public final OutputStream A01;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.A01.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.A01.write(i);
        long j = this.A00;
        if (j >= 0) {
            this.A00 = j + 1;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
        long j = this.A00;
        if (j >= 0) {
            this.A00 = j + i2;
        }
    }

    public C14790ot(OutputStream outputStream) {
        this.A01 = outputStream;
    }
}
