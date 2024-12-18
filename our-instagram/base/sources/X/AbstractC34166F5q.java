package X;

import java.io.IOException;

/* renamed from: X.F5q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34166F5q {
    public static C32011fl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C32011fl c32011fl = new C32011fl();
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
                    c32011fl.A00 = A1P;
                } else if ("to_mute".equals(A0q)) {
                    c32011fl.A01 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c32011fl, A0q);
                }
                c16l.A0z();
            }
            return c32011fl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
