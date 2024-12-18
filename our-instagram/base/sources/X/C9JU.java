package X;

import java.io.IOException;

/* renamed from: X.9JU, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9JU {
    public static C171757l5 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C171757l5 c171757l5 = new C171757l5();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("reason".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    EnumC171747l4 enumC171747l4 = (EnumC171747l4) EnumC171747l4.A01.get(A1P);
                    if (enumC171747l4 != null) {
                        c171757l5.A00 = enumC171747l4;
                    } else {
                        throw AbstractC167007dF.A0c("Unrecognized value ", A1P);
                    }
                }
                c16l.A0z();
            }
            return c171757l5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
