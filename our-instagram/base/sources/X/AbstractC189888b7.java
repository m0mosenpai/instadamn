package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.8b7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC189888b7 {
    public static final void A00(File file) {
        if (!file.exists() && !file.mkdirs()) {
            IOException e = null;
            StringBuilder sb = new StringBuilder();
            sb.append("could not make directory: ");
            try {
                sb.append(file.getCanonicalPath());
                sb.append("-canonical");
            } catch (IOException e2) {
                e = e2;
                sb.append(file.getAbsolutePath());
                sb.append("-absolute");
            }
            IOException iOException = new IOException(sb.toString());
            if (e != null) {
                iOException.initCause(e);
                throw iOException;
            }
            throw iOException;
        }
    }
}
