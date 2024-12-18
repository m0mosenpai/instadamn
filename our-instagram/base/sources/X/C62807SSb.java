package X;

import java.io.File;

/* renamed from: X.SSb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62807SSb {
    public static final long A00(C62807SSb c62807SSb, File file, int i) {
        File[] listFiles;
        int length;
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            long j2 = i;
            return (((file.length() + j2) - 1) / j2) * j2;
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length - 1 < 0) {
            return 0L;
        }
        while (true) {
            int i2 = length - 1;
            j += A00(c62807SSb, listFiles[length], i);
            if (i2 < 0) {
                return j;
            }
            length = i2;
        }
    }
}
