package X;

import java.io.File;

/* renamed from: X.PwH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58490PwH {
    public static void A00(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete file which is a directory ");
            sb.append(file2);
            android.util.Log.e("AtomicFile", sb.toString());
        }
        if (!file.renameTo(file2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(MSV.A00(769));
            sb2.append(file);
            sb2.append(" to ");
            sb2.append(file2);
            android.util.Log.e("AtomicFile", sb2.toString());
        }
    }
}
