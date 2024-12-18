package X;

import android.media.MediaCodec;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.YFw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73493YFw implements Closeable {
    public final ByteBuffer A02;
    public final int A03;
    public final MediaCodec A04;
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public int A00 = 0;
    public long A01 = 0;

    public final void A00() {
        int i;
        if (this.A05.compareAndSet(false, true) && (i = this.A03) >= 0) {
            this.A04.queueInputBuffer(i, 0, this.A00, this.A01, 0);
        }
    }

    public C73493YFw(MediaCodec mediaCodec, ByteBuffer byteBuffer, int i) {
        this.A04 = mediaCodec;
        this.A03 = i;
        this.A02 = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        A00();
    }
}
