package X;

import java.io.IOException;

/* renamed from: X.F6l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34187F6l {
    public static C32131fx parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C32131fx c32131fx = new C32131fx();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c32131fx.A00 = A1P;
                } else if ("translation_enabled".equals(A0q)) {
                    c32131fx.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c32131fx, A0q);
                }
                c16l.A0z();
            }
            return c32131fx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
