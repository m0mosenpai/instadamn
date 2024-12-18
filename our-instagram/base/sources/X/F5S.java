package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5S {
    public static C34591jx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34591jx c34591jx = new C34591jx();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c34591jx.A00 = AbstractC31172DnG.A0o(c16l);
                } else if ("is_enabled".equals(A0q)) {
                    c34591jx.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c34591jx, A0q);
                }
                c16l.A0z();
            }
            return c34591jx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
