package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.ReF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61043ReF extends InputStream {
    public static final Queue A02 = new ArrayDeque(0);
    public IOException A00;
    public InputStream A01;

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.A01.reset();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.A01.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.A01.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.A01.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.A01.read(bArr);
        } catch (IOException e) {
            this.A00 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.A01.skip(j);
        } catch (IOException e) {
            this.A00 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.A01.read(bArr, i, i2);
        } catch (IOException e) {
            this.A00 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.A01.read();
        } catch (IOException e) {
            this.A00 = e;
            throw e;
        }
    }
}
