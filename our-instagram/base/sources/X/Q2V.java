package X;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class Q2V extends MediaDataSource {
    public final /* synthetic */ C63857Sup A00;
    public final /* synthetic */ ByteBuffer A01;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public Q2V(C63857Sup c63857Sup, ByteBuffer byteBuffer) {
        this.A00 = c63857Sup;
        this.A01 = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.A01.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.A01;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }
}
