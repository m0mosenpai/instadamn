package X;

import java.io.IOException;

/* renamed from: X.5ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125465ls {
    public static C125475lt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C125475lt c125475lt = new C125475lt();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (!"num_columns".equals(A0q) && !"total_num_columns".equals(A0q)) {
                    if ("aspect_ratio".equals(A0q)) {
                        c125475lt.A00 = (float) c16l.A0U();
                    } else if ("autoplay".equals(A0q)) {
                        c125475lt.A01 = c16l.A0d();
                    }
                } else {
                    c16l.A1D();
                }
                c16l.A0z();
            }
            return c125475lt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
