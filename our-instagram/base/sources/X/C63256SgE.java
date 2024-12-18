package X;

import java.io.File;

/* renamed from: X.SgE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63256SgE {
    public static final C63256SgE A00 = new Object();

    public static final void A01(String str) {
        C14360o3.A0B(str, 0);
        C63256SgE c63256SgE = A00;
        File A11 = AbstractC166987dD.A11(str);
        if (A11.exists()) {
            if (A11.isDirectory()) {
                c63256SgE.A00(A11);
            } else {
                if (A11.delete()) {
                    return;
                }
                A11.delete();
            }
        }
    }

    private final void A00(File file) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            C0s6 c0s6 = new C0s6(listFiles);
            while (c0s6.hasNext()) {
                File file2 = (File) c0s6.next();
                if (file2.isDirectory()) {
                    A00(file2);
                } else if (!file2.delete()) {
                    file2.delete();
                }
            }
        }
        if (!file.delete()) {
            file.delete();
        }
    }
}
