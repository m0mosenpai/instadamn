package X;

import java.io.IOException;

/* renamed from: X.SSv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62823SSv {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.RbJ, X.1um] */
    public static C60904RbJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("success".equals(AbstractC166997dE.A0s(c16l))) {
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
