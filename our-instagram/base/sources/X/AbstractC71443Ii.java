package X;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* renamed from: X.3Ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC71443Ii extends OutputStream {
    public boolean A00;
    public boolean A01;
    public final OutputStream A02;

    public abstract void A02();

    public abstract boolean A03();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00 = true;
        try {
            this.A02.close();
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        try {
            this.A02.write(bArr);
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    public FileChannel A01() {
        throw new UnsupportedOperationException("Stash streams do not support getChannel()");
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.A02.flush();
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    public AbstractC71443Ii(OutputStream outputStream) {
        this.A02 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 0);
        try {
            this.A02.write(bArr, i, i2);
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        try {
            this.A02.write(i);
        } catch (IOException unused) {
            this.A01 = true;
        }
    }
}
