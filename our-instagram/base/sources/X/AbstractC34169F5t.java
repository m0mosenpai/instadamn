package X;

import java.io.IOException;

/* renamed from: X.F5t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34169F5t {
    public static C35031ki parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C35031ki c35031ki = new C35031ki();
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
                    c35031ki.A01 = A1P;
                } else if ("is_pin".equals(A0q)) {
                    c35031ki.A02 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c35031ki, A0q);
                }
                c16l.A0z();
            }
            return c35031ki;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
