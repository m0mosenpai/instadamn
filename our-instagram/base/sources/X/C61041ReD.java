package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.ReD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61041ReD extends InputStream {
    public int A00 = -1;
    public final ByteBuffer A01;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.A00 = this.A01.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.A00;
        if (i != -1) {
            this.A01.position(i);
        } else {
            throw MSW.A0y("Cannot reset to unset mark position");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.A01.remaining();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.A01;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.A01;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    public C61041ReD(ByteBuffer byteBuffer) {
        this.A01 = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.A01;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        return byteBuffer.get() & 255;
    }
}
