package X;

import java.io.IOException;

/* renamed from: X.4dQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99504dQ {
    public static C99514dR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("enable_1x1".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("enable_dense_ufi".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("enable_ufi_interactive_like".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("enable_ufi_interactive_reshare".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new C99514dR(bool, bool2, bool3, bool4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
