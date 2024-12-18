package X;

import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.0Pp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05190Pp {
    public static void A01(File file, String str, ZipOutputStream zipOutputStream) {
        File absoluteFile = new File(file, str).getAbsoluteFile();
        java.net.URI uri = file.toURI();
        for (String str2 : absoluteFile.list()) {
            File file2 = new File(absoluteFile, str2);
            if (file2.exists()) {
                String path = uri.relativize(file2.toURI()).getPath();
                if (file2.isFile()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(new File(file, path));
                        try {
                            byte[] bArr = new byte[1024];
                            zipOutputStream.putNextEntry(new ZipEntry(path));
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                } else {
                                    zipOutputStream.write(bArr, 0, read);
                                }
                            }
                            fileInputStream.close();
                        } finally {
                        }
                    } finally {
                        zipOutputStream.closeEntry();
                    }
                } else if (file2.isDirectory()) {
                    A01(file, path, zipOutputStream);
                }
            }
        }
    }

    public static void A00(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    File file2 = new File(file, str);
                    if (file2.isDirectory()) {
                        A00(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }
}
