package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6Z {
    public static C34731kE parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34731kE c34731kE = new C34731kE();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c34731kE.A00 = AbstractC31172DnG.A0o(c16l);
                } else if ("should_hide".equals(A0q)) {
                    c34731kE.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c34731kE, A0q);
                }
                c16l.A0z();
            }
            return c34731kE;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
