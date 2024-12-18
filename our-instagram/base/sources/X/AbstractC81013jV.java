package X;

import java.io.IOException;

/* renamed from: X.3jV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81013jV {
    public static C9CG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9CG c9cg = new C9CG(2);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("item_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9cg.A02 = str;
                } else if ("created_at".equals(A0q)) {
                    c9cg.A01 = Long.valueOf(c16l.A0y());
                } else if ("item_otid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9cg.A03 = str;
                } else if ("is_different_than_cached_marker".equals(A0q)) {
                    c9cg.A00 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return c9cg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
