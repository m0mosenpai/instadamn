package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.0MB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0MB {
    public static char A00(File file) {
        C0MI c0mi;
        RandomAccessFile randomAccessFile;
        if (file.exists()) {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                } finally {
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateNativeParser", e, null);
                C0K8.A0H("lacrima", "Reading AppStateNativeParser failed", e);
            }
            if (randomAccessFile.length() != 0) {
                char readByte = (char) randomAccessFile.readByte();
                randomAccessFile.close();
                return readByte;
            }
            randomAccessFile.close();
            c0mi = C0MI.A0D;
        } else {
            c0mi = C0MI.A0c;
        }
        return c0mi.A01;
    }
}
