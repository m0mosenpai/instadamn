package X;

import java.io.File;

/* renamed from: X.RtE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61759RtE {
    public static final void A00(File file) {
        File[] listFiles;
        C14360o3.A0B(file, 0);
        if (file.isDirectory() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            C0s6 c0s6 = new C0s6(listFiles);
            while (c0s6.hasNext()) {
                File file2 = (File) c0s6.next();
                C14360o3.A0A(file2);
                A00(file2);
            }
        }
        file.delete();
    }
}
