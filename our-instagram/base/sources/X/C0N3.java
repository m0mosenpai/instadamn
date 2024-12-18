package X;

import android.content.Context;
import java.io.File;
import java.io.FileFilter;
import java.io.RandomAccessFile;

/* renamed from: X.0N3, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0N3 {
    public static File A00(Context context, String str) {
        File[] listFiles = context.getDir("minidumps", 0).listFiles(new FileFilter() { // from class: X.0N2
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return file.getName().endsWith(".dmp");
            }
        });
        if (listFiles == null) {
            return null;
        }
        String substring = str.substring(str.indexOf(45) + 1);
        for (File file : listFiles) {
            String name = file.getName();
            if (file.length() == 0) {
                C0K8.A0D("lacrima", "The minidump file is empty during matching!");
                return null;
            }
            if (!name.contains(substring)) {
                if (name.startsWith("_")) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                        try {
                            String A01 = new C0A9(randomAccessFile).A01(C0LK.A4V.A00);
                            if (A01 != null && str.contains(A01)) {
                                randomAccessFile.close();
                                return file;
                            }
                            randomAccessFile.close();
                        } finally {
                        }
                    } catch (Throwable th) {
                        C0PC.A00().DEh("MinidumpFind", th, null);
                        C0K8.A0O("lacrima", "Could not read minidump, file size: %d.", Long.valueOf(file.length()), th);
                    }
                }
            } else {
                return file;
            }
        }
        return null;
    }
}
