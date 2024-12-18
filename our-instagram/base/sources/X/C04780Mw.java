package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.0Mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04780Mw extends InputStream {
    public ByteBuffer A00;

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.A00;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.A00;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        return byteBuffer.get() & 255;
    }
}
