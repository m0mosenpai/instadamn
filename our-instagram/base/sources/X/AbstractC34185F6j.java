package X;

import java.io.IOException;

/* renamed from: X.F6j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34185F6j {
    public static C32851h9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32851h9 c32851h9 = new C32851h9();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    c32851h9.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("shh_mode_enabled".equals(A0q)) {
                    c32851h9.A03 = c16l.A0d();
                } else if ("shh_mode_toggler_user_id".equals(A0q)) {
                    c32851h9.A02 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c32851h9, A0q);
                }
                c16l.A0z();
            }
            return c32851h9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
