package X;

import java.io.IOException;

/* renamed from: X.Kpi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46963Kpi {
    public static C29631be parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29631be c29631be = new C29631be();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("private_reply_info".equals(A0s)) {
                    c29631be.A00 = AbstractC47855LCa.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c29631be, A0s);
                }
                c16l.A0z();
            }
            return c29631be;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
