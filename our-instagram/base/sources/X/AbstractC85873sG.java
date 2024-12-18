package X;

import java.io.OutputStream;

/* renamed from: X.3sG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85873sG extends OutputStream {
    public final OutputStream A00;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.A00.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.A00.write(i);
    }

    public AbstractC85873sG(OutputStream outputStream) {
        this.A00 = outputStream;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.A00.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.A00.write(bArr);
    }
}
