package X;

import java.io.IOException;

/* renamed from: X.A0i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22712A0i {
    public static C9CG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9CG c9cg = new C9CG(3);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_id".equals(A0s)) {
                    c9cg.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("imagine_media_id".equals(A0s)) {
                    c9cg.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("editable".equals(A0s)) {
                    c9cg.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("animatable".equals(A0s)) {
                    c9cg.A00 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return c9cg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
