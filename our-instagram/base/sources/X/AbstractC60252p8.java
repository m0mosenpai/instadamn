package X;

import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: X.2p8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60252p8 extends InputStream {
    public final InputStream A00;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.A00.mark(i);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.A00.reset();
    }

    public final String A00() {
        if (this instanceof C3IP) {
            return ((C3IP) this).A00;
        }
        String path = ((C60242p7) this).A00.getPath();
        C14360o3.A07(path);
        return path;
    }

    public FileChannel A01() {
        throw new UnsupportedOperationException("Stash streams do not support getChannel()");
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.A00.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.A00.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.A00.read(bArr);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.A00.skip(j);
    }

    public AbstractC60252p8(InputStream inputStream) {
        this.A00 = inputStream;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.A00.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.A00.read();
    }
}
