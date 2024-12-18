package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.StK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63764StK implements InterfaceC65570Tn3 {
    public final File A00;

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
    }

    @Override // X.InterfaceC65570Tn3
    public final Class Avg() {
        return ByteBuffer.class;
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return C05F.A00;
    }

    @Override // X.InterfaceC65570Tn3
    public final void ChQ(EnumC61107RfN enumC61107RfN, InterfaceC65471Tko interfaceC65471Tko) {
        try {
            File file = this.A00;
            FileChannel fileChannel = null;
            try {
                long length = file.length();
                if (length <= 2147483647L) {
                    if (length != 0) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                        try {
                            fileChannel = randomAccessFile.getChannel();
                            MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                            try {
                                fileChannel.close();
                            } catch (IOException unused) {
                            }
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused2) {
                            }
                            interfaceC65471Tko.D9H(load);
                            return;
                        } catch (Throwable th) {
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                } catch (IOException unused3) {
                                }
                            }
                            try {
                                randomAccessFile.close();
                                throw th;
                            } catch (IOException unused4) {
                                throw th;
                            }
                        }
                    }
                    throw MSW.A0y("File unsuitable for memory mapping");
                }
                throw MSW.A0y("File too large to map into memory");
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (IOException e) {
            android.util.Log.isLoggable("ByteBufferFileLoader", 3);
            interfaceC65471Tko.DPj(e);
        }
    }

    public C63764StK(File file) {
        this.A00 = file;
    }
}
