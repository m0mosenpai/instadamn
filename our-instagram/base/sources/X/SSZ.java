package X;

import java.io.IOException;

/* loaded from: classes10.dex */
public final class SSZ {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.RbL, X.1um] */
    public static C60906RbL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("success".equals(A0s)) {
                    c40791um.A02 = c16l.A0d();
                } else if ("file_handle1".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c40791um.A00 = A0m;
                } else if ("file_handle2".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
