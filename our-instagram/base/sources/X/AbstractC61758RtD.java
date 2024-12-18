package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.RtD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61758RtD {
    public static void A00(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    String absolutePath = file.getAbsolutePath();
                    IOException iOException = new IOException(file.getAbsolutePath());
                    IOException iOException2 = new IOException(absolutePath);
                    iOException2.initCause(iOException);
                    throw iOException2;
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(file.getAbsolutePath());
        }
    }
}
