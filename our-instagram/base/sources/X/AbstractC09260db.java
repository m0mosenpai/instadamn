package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.soloader.SysUtil$LollipopSysdeps;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: X.0db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09260db implements Closeable {
    public static void A00(C09240dZ c09240dZ, File file, InputStream inputStream, byte[] bArr) {
        String str = c09240dZ.A01;
        android.util.Log.isLoggable("fb-UnpackingSoSource", 4);
        File file2 = new File(file, str);
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    int available = inputStream.available();
                    if (available > 1) {
                        SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFile.getFD(), available);
                    }
                    int i = 0;
                    do {
                        int read = inputStream.read(bArr, 0, Math.min(Constants.LOAD_RESULT_PGO, Integer.MAX_VALUE - i));
                        if (read == -1) {
                            break;
                        }
                        randomAccessFile.write(bArr, 0, read);
                        i += read;
                    } while (i < Integer.MAX_VALUE);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    if (file2.setExecutable(true, false)) {
                        randomAccessFile.close();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("cannot make file executable: ");
                        sb.append(file2);
                        throw new IOException(sb.toString());
                    }
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error extracting dso  ");
                sb2.append(file2);
                sb2.append(" due to: ");
                sb2.append(e);
                android.util.Log.e("fb-UnpackingSoSource", sb2.toString());
                AbstractC09200dV.A04(file2);
                throw e;
            }
        } finally {
            if (file2.exists() && !file2.setWritable(false)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Error removing ");
                sb3.append(file2);
                sb3.append(" write permission from directory ");
                sb3.append(file);
                sb3.append(" (writable: ");
                sb3.append(file.canWrite());
                sb3.append(")");
                android.util.Log.e("SoLoader", sb3.toString());
            }
        }
    }

    public abstract void A01(File file);

    public abstract C09240dZ[] A02();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
