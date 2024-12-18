package X;

import java.io.IOException;

/* loaded from: classes10.dex */
public final class SSY {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.RbK, X.1um] */
    public static C60905RbK parseFromJson(C16L c16l) {
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
                    c40791um.A01 = c16l.A0d();
                } else if ("state_changed".equals(A0s)) {
                    c40791um.A00 = c16l.A0d();
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
