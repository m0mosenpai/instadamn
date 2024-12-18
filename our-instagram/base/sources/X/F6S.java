package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6S {
    public static C29201ax parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29201ax c29201ax = new C29201ax();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c29201ax.A00 = AbstractC31172DnG.A0o(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c29201ax, A0q);
                }
                c16l.A0z();
            }
            return c29201ax;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
