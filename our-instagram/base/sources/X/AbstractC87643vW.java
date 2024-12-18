package X;

import java.io.IOException;

/* renamed from: X.3vW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87643vW {
    public static C38722H3k parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38725H3n c38725H3n = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (AbstractC58317Pt9.A00(711).equals(A0q)) {
                    c38725H3n = AbstractC40001Hoi.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38722H3k(c38725H3n);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
