package X;

import java.io.IOException;

/* renamed from: X.Hsb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40212Hsb {
    public static H51 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1A(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC37300Gc1.A1B(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            return new H51(f, f2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
