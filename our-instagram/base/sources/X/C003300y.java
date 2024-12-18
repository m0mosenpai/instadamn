package X;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.00y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C003300y implements InterfaceC09010d5 {
    public File A00;
    public FileInputStream A01;
    public FileChannel A02;

    @Override // X.InterfaceC09010d5
    public final int E7n(ByteBuffer byteBuffer, long j) {
        return this.A02.read(byteBuffer, j);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.A02.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.A02.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.A02.write(byteBuffer);
    }
}
