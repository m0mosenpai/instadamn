package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.0zo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20690zo extends FilterInputStream {
    public long A00;

    public C20690zo(InputStream inputStream) {
        super(inputStream);
        this.A00 = 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            long j = this.A00;
            if (j >= 0) {
                this.A00 = j + 1;
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read > 0) {
            long j = this.A00;
            if (j >= 0) {
                this.A00 = j + read;
            }
        }
        return read;
    }
}
