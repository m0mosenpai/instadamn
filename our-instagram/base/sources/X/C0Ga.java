package X;

import android.os.StrictMode;
import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.InterruptedIOException;
import java.util.HashSet;

/* renamed from: X.0Ga, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Ga {
    public final java.util.Set A00 = new HashSet();

    public static int A00(C0Ga c0Ga, String str, byte[] bArr) {
        java.util.Set set = c0Ga.A00;
        if (!set.contains(str)) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                int length = bArr.length;
                try {
                    FileDescriptor open = Os.open(str, 0, 0);
                    try {
                        int read = Os.read(open, bArr, 0, length - 1);
                        try {
                            Os.close(open);
                        } catch (ErrnoException unused) {
                        }
                        if (read != -2147483647) {
                            return read;
                        }
                    } catch (ErrnoException | InterruptedIOException unused2) {
                        Os.close(open);
                    } catch (Throwable th) {
                        try {
                            Os.close(open);
                        } catch (ErrnoException unused3) {
                        }
                        throw th;
                    }
                } catch (ErrnoException unused4) {
                }
                set.add(str);
                if (allowThreadDiskReads != null) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    return -1;
                }
            } finally {
                if (allowThreadDiskReads != null) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
        }
        return -1;
    }
}
