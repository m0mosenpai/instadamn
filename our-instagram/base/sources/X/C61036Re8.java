package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Re8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61036Re8 extends InputStream {
    public final ByteBuffer A00;

    @Override // java.io.InputStream
    public final int available() {
        return this.A00.remaining();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.A00;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    public C61036Re8(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }
}
