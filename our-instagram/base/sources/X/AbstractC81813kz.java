package X;

import java.io.IOException;

/* renamed from: X.3kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81813kz {
    public static C81823l0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C110314y2 c110314y2 = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C43G c43g = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("linked_fb_page".equals(A0q)) {
                    c110314y2 = AbstractC110304y1.parseFromJson(c16l);
                } else if ("linked_fb_user".equals(A0q)) {
                    c43g = C43F.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C81823l0(c110314y2, c43g);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
