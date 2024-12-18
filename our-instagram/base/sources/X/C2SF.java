package X;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

/* renamed from: X.2SF, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2SF {
    public static void A00(File file, boolean z) {
        try {
            DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(file.toPath());
            if (newDirectoryStream != null) {
                try {
                    Iterator<Path> it = newDirectoryStream.iterator();
                    AbstractC05810Sj.A00(it);
                    while (it.hasNext()) {
                        Path next = it.next();
                        if (z) {
                            String path = next.getFileName().toString();
                            if (!C2SG.A01.matcher(path).matches() && !C2SG.A00.matcher(path).matches()) {
                            }
                        }
                        next.toFile().delete();
                    }
                    newDirectoryStream.close();
                } finally {
                }
            }
        } catch (IOException unused) {
        }
    }
}
