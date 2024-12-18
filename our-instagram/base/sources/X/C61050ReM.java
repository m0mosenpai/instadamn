package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.ReM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61050ReM extends OutputStream {
    public boolean A00 = false;
    public final FileOutputStream A01;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.A00) {
            this.A00 = true;
            flush();
            try {
                this.A01.getFD().sync();
            } catch (IOException e) {
                AbstractC46512Bo.A06("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.A01.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.A01.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.A01.write(i);
    }

    public C61050ReM(File file) {
        this.A01 = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.A01.write(bArr);
    }
}
