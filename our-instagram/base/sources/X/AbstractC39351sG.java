package X;

import java.io.IOException;

/* renamed from: X.1sG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39351sG {
    public static C39361sH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("should_disable".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new C39361sH(bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
