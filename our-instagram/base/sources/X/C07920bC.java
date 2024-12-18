package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.0bC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07920bC {
    public MappedByteBuffer A00;
    public final File A01;

    public void mlockBuffer() {
    }

    public C07920bC(File file, int i) {
        if (i <= 65536) {
            this.A01 = file;
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    this.A00 = channel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
                    if (channel.tryLock() != null) {
                        channel.close();
                        randomAccessFile.close();
                        return;
                    }
                    throw new IOException(String.format("Unable to acquire lock for app state log aslFile: %s", file.getCanonicalPath()));
                } finally {
                }
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                    throw th;
                } finally {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                }
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Size too big for file: ", i));
    }
}
