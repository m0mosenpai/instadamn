package X;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: X.0eL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0eL {
    public static final Comparator A01 = new Comparator() { // from class: X.0Z1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            long lastModified = ((File) obj).lastModified();
            long lastModified2 = ((File) obj2).lastModified();
            if (lastModified < lastModified2) {
                return -1;
            }
            if (lastModified != lastModified2) {
                return 1;
            }
            return 0;
        }
    };
    public final Context A00;

    public final ObjectOutputStream A01(final String str) {
        final File A00 = C0eS.A00(this.A00, 1045170971);
        A00.mkdirs();
        final File file = new File(A00, String.format(Locale.US, "qpl_sampling_config_v2_%s.tmp", str));
        if (!A00.exists() && !A00.mkdirs()) {
            throw new IOException("Failed to create storage dir");
        }
        return new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file) { // from class: X.0Z2
            @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                int length;
                super.close();
                String format = String.format(Locale.US, "qpl_sampling_config_v2.%s", str);
                File file2 = file;
                File file3 = A00;
                if (file2.renameTo(new File(file3, format))) {
                    File[] listFiles = file3.listFiles();
                    if (listFiles != null && (length = listFiles.length) > 5) {
                        Arrays.sort(listFiles, C0eL.A01);
                        for (int i = 0; i < length - 5; i++) {
                            listFiles[i].delete();
                        }
                        return;
                    }
                    return;
                }
                throw new IOException("Failed to rename file");
            }
        }));
    }

    public C0eL(Context context) {
        this.A00 = context;
    }

    public final ObjectInputStream A00(String str) {
        File A00 = C0eS.A00(this.A00, 1045170971);
        A00.mkdirs();
        return new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(A00, String.format(Locale.US, "qpl_sampling_config_v2.%s", str)))));
    }
}
