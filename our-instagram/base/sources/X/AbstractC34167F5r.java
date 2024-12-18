package X;

import java.io.IOException;

/* renamed from: X.F5r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34167F5r {
    public static C32071fr parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C32071fr c32071fr = new C32071fr();
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
                    c32071fr.A01 = A1P;
                } else if ("vc_mute".equals(A0q)) {
                    c32071fr.A02 = c16l.A0d();
                } else if ("mute_seconds".equals(A0q)) {
                    c32071fr.A00 = AbstractC166997dE.A0h(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c32071fr, A0q);
                }
                c16l.A0z();
            }
            return c32071fr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
