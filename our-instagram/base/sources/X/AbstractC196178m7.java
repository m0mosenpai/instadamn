package X;

import java.io.IOException;

/* renamed from: X.8m7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196178m7 {
    public static C8m8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C8m8 c8m8 = new C8m8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("surface".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c8m8.A01 = str;
                } else if ("is_eligible".equals(A0q)) {
                    c8m8.A02 = c16l.A0d();
                } else if ("ineligible_reason".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c8m8.A00 = str;
                }
                c16l.A0z();
            }
            return c8m8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
