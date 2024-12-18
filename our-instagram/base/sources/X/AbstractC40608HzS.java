package X;

import java.io.IOException;

/* renamed from: X.HzS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40608HzS {
    public static C40952IBz parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C40952IBz c40952IBz = new C40952IBz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                } else if ("keyword".equals(A0q)) {
                    c40952IBz.A00 = AbstractC40611HzV.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c40952IBz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
