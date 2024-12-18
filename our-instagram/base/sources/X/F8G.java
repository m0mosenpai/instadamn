package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F8G {
    public static C51755Mte parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51755Mte c51755Mte = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "body")) {
                    c51755Mte = F8F.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (c51755Mte == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("body", c16l, "MwcRtcAppMessages");
                throw C00O.createAndThrow();
            }
            return new C51755Mte(c51755Mte, 34);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
