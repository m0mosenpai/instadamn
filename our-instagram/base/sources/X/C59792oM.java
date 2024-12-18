package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.2oM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59792oM {
    public final C1F5 A00;

    public C59792oM(C1F1 c1f1, File file, String str) {
        String absolutePath;
        C14360o3.A0B(file, 2);
        try {
            absolutePath = file.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = file.getAbsolutePath();
        }
        this.A00 = c1f1.A00(str, absolutePath, "stash_extras");
    }
}
