package X;

import java.io.IOException;

/* renamed from: X.Nu2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53991Nu2 {
    public static C54419O2z parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C54419O2z c54419O2z = new C54419O2z();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("uri".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c54419O2z.A00 = A1P;
                }
                c16l.A0z();
            }
            return c54419O2z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
