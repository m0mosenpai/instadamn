package X;

import java.io.IOException;

/* renamed from: X.NuQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54014NuQ {
    public static O34 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            O34 o34 = new O34();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("text".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    o34.A00 = A1P;
                }
                c16l.A0z();
            }
            return o34;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
