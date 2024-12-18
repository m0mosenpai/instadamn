package X;

import com.instagram.api.schemas.RingSpecPointImpl;
import java.io.IOException;

/* renamed from: X.Hsk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40221Hsk {
    public static RingSpecPointImpl parseFromJson(C16L c16l) {
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
                if ("x".equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if ("y".equals(A0s)) {
                    f2 = AbstractC167007dF.A0b(c16l);
                }
                c16l.A0z();
            }
            if (f == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("x", c16l, "RingSpecPointImpl");
            } else if (f2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("y", c16l, "RingSpecPointImpl");
            } else {
                return new RingSpecPointImpl(f.floatValue(), f2.floatValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
