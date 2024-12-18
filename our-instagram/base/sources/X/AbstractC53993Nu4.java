package X;

import java.io.IOException;

/* renamed from: X.Nu4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53993Nu4 {
    public static O30 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            O30 o30 = new O30();
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
                    o30.A00 = A1P;
                }
                c16l.A0z();
            }
            return o30;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
