package X;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class PKZ implements FileFilter {
    public static final PKZ A00 = new PKZ();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        C14360o3.A0B(file, 0);
        return MSY.A1R((file.lastModified() > (System.currentTimeMillis() - AbstractC43593JPy.A09(TimeUnit.DAYS)) ? 1 : (file.lastModified() == (System.currentTimeMillis() - AbstractC43593JPy.A09(TimeUnit.DAYS)) ? 0 : -1)));
    }
}
