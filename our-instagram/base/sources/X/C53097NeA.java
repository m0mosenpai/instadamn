package X;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.NeA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53097NeA extends OutputStream {
    public final FileOutputStream A00;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 0);
        this.A00.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.A00.flush();
    }

    public C53097NeA(FileOutputStream fileOutputStream) {
        this.A00 = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        this.A00.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.A00.write(i);
    }
}
