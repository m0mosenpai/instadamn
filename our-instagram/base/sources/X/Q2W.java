package X;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class Q2W extends MediaDataSource {
    public long A00;
    public final /* synthetic */ C99054cS A01;
    public final /* synthetic */ C60782q2 A02;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    public Q2W(C99054cS c99054cS, C60782q2 c60782q2) {
        this.A02 = c60782q2;
        this.A01 = c99054cS;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.A00;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.A01.A04.available()) {
                    return -1;
                }
                this.A01.A01(j);
                this.A00 = j;
            }
            C99054cS c99054cS = this.A01;
            DataInputStream dataInputStream = c99054cS.A04;
            if (i2 > dataInputStream.available()) {
                i2 = dataInputStream.available();
            }
            int read = c99054cS.read(bArr, i, i2);
            if (read >= 0) {
                this.A00 += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.A00 = -1L;
        return -1;
    }
}
