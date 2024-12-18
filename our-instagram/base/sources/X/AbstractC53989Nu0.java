package X;

import java.io.IOException;

/* renamed from: X.Nu0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53989Nu0 {
    public static C54418O2y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54418O2y c54418O2y = new C54418O2y();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("instagram".equals(AbstractC166997dE.A0s(c16l))) {
                    c54418O2y.A00 = AbstractC53988Ntz.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c54418O2y;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
