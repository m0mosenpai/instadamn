package X;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes10.dex */
public final /* synthetic */ class THd implements FileFilter {
    public static final /* synthetic */ THd A00 = new Object();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.getName().endsWith(".apk");
    }
}
