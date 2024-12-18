package X;

import android.os.Environment;
import java.io.File;

/* renamed from: X.0eT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0eT {
    public static File A00(String str) {
        synchronized (C0eT.class) {
        }
        if (str == null) {
            return Environment.getExternalStorageDirectory();
        }
        return Environment.getExternalStoragePublicDirectory(str);
    }
}
