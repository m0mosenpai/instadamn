package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IBA {
    public static C38886HAi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38886HAi c38886HAi = new C38886HAi();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("translation".equals(A0s)) {
                    c38886HAi.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    c38886HAi.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("source_locale".equals(A0s)) {
                    c38886HAi.A00 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c38886HAi, A0s);
                }
                c16l.A0z();
            }
            return c38886HAi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
