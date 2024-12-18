package X;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: X.9OQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9OQ extends MediaDataSource {
    public IOException A00;
    public final MediaDataSource A01;

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 1);
        try {
            return this.A01.readAt(j, bArr, i, i2);
        } catch (IOException e) {
            this.A00 = e;
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.A01.close();
        } catch (IOException e) {
            this.A00 = e;
            throw e;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        try {
            return this.A01.getSize();
        } catch (IOException e) {
            this.A00 = e;
            throw e;
        }
    }

    public C9OQ(MediaDataSource mediaDataSource) {
        this.A01 = mediaDataSource;
    }
}
