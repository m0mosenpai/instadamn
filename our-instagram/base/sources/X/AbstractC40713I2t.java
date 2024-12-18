package X;

import java.io.IOException;

/* renamed from: X.I2t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40713I2t {
    public static C38687GzS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C58590PyH c58590PyH = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("layout".equals(A0s)) {
                    c58590PyH = C58590PyH.A00(c16l);
                } else if ("payload".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38687GzS(str, c58590PyH, 4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
