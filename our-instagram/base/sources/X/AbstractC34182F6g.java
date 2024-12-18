package X;

import java.io.IOException;

/* renamed from: X.F6g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34182F6g {
    public static C35531lZ parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C35531lZ c35531lZ = new C35531lZ();
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
                    c35531lZ.A01 = A1P;
                } else if ("locked_status".equals(A0q)) {
                    c35531lZ.A00 = c16l.A1D();
                } else {
                    AbstractC43669JTd.A01(c16l, c35531lZ, A0q);
                }
                c16l.A0z();
            }
            return c35531lZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
