package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.613, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass613 {
    public static final String A00() {
        String str = null;
        try {
            str = AbstractC23881Ey.A00().AXd(null, 195432639).getCanonicalPath();
        } catch (IOException unused) {
            C0w9.A03("msys_mailbox_config", "Unable to retrieve canonical path from Cask");
        }
        if (str != null) {
            C14360o3.A0B("/", 1);
            if (!str.endsWith("/")) {
                return AnonymousClass001.A0C(str, '/');
            }
            return str;
        }
        return str;
    }

    public static final void A01(File file) {
        if (file.isDirectory()) {
            C0s6 A00 = AbstractC13190m5.A00(file.listFiles());
            while (A00.hasNext()) {
                File file2 = (File) A00.next();
                C14360o3.A0A(file2);
                A01(file2);
            }
        }
        file.delete();
    }
}
