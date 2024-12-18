package X;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: X.Re9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61037Re9 extends InputStream {
    public long A00;
    public final RandomAccessFile A01;

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 0);
        long j = this.A00;
        if (j > 0) {
            int read = this.A01.read(bArr, i, (int) Math.min(j, i2));
            if (read >= 0) {
                this.A00 -= read;
            }
            return read;
        }
        return -1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.close();
    }

    public C61037Re9(File file, long j, long j2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.A01 = randomAccessFile;
        try {
            randomAccessFile.seek(j);
            this.A00 = j2;
        } catch (IOException e) {
            try {
                this.A01.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.A00;
        if (j > 0) {
            this.A00 = j - 1;
            return this.A01.read();
        }
        return -1;
    }
}
