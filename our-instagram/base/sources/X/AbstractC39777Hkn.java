package X;

import java.io.IOException;

/* renamed from: X.Hkn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39777Hkn {
    public static H2S parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1H(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("top_left_x".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if ("top_left_y".equals(A0s)) {
                    f3 = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC37300Gc1.A1G(A0s)) {
                    f4 = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            return new H2S(f, f2, f3, f4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
