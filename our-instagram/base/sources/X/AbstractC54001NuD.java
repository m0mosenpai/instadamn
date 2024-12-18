package X;

import java.io.IOException;

/* renamed from: X.NuD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54001NuD {
    public static O32 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            O32 o32 = new O32();
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
                    o32.A00 = A1P;
                }
                c16l.A0z();
            }
            return o32;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
