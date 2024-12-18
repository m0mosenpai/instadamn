package X;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.OKb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54807OKb {
    public final InterfaceC08100bW A00;
    public final File A01;
    public final HashMap A02 = AbstractC166987dD.A1G();

    public final File A00() {
        File file = this.A01;
        if (file.exists()) {
            if (file.isDirectory()) {
                if (file.canRead()) {
                    if (!file.canWrite()) {
                        throw MSW.A0y(AnonymousClass001.A0g("No write permissions for temporary directory ", file.getAbsolutePath(), "."));
                    }
                } else {
                    throw MSW.A0y(AnonymousClass001.A0g("No read permissions for temporary directory ", file.getAbsolutePath(), "."));
                }
            } else {
                throw MSW.A0y(AnonymousClass001.A0g("Temporary folder ", file.getAbsolutePath(), " is not a directory."));
            }
        } else if (!file.mkdirs()) {
            this.A00.EHA("TempFileDirectoryManager", AnonymousClass001.A0g("Could not create temporary directory. ", file.getCanonicalPath(), ""), null);
        }
        return file;
    }

    public C54807OKb(InterfaceC08100bW interfaceC08100bW, File file) {
        this.A01 = file.getCanonicalFile();
        this.A00 = interfaceC08100bW;
    }

    public final void A01(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        File[] listFiles = A00().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file != null && currentTimeMillis - file.lastModified() >= j) {
                    file.delete();
                }
            }
            Iterator A0k = AbstractC167007dF.A0k(this.A02);
            while (A0k.hasNext()) {
                ((C54807OKb) A0k.next()).A01(j);
            }
        }
    }
}
