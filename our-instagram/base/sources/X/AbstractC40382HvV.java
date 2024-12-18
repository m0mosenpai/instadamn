package X;

import java.io.IOException;

/* renamed from: X.HvV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40382HvV {
    public static C26031BfK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "estimated_tax_rate")) {
                    f = AbstractC167007dF.A0b(c16l);
                }
                c16l.A0z();
            }
            if (f == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("estimated_tax_rate", c16l, "TaxInfo");
                throw C00O.createAndThrow();
            }
            return new C26031BfK(f.floatValue(), 0);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
