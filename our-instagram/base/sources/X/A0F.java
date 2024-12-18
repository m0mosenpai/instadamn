package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A0F {
    public static C172147lj parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C172147lj c172147lj = new C172147lj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("orientation".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    EnumC171727l2 enumC171727l2 = (EnumC171727l2) EnumC171727l2.A01.get(A1P);
                    if (enumC171727l2 != null) {
                        c172147lj.A00 = enumC171727l2;
                    } else {
                        throw AbstractC167007dF.A0c("Unrecognized value ", A1P);
                    }
                }
                c16l.A0z();
            }
            return c172147lj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
