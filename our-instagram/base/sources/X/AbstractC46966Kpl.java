package X;

import java.io.IOException;

/* renamed from: X.Kpl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46966Kpl {
    public static C29681bj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29681bj c29681bj = new C29681bj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("pending_media".equals(A0s)) {
                    c29681bj.A00 = AbstractC47865LCl.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c29681bj, A0s);
                }
                c16l.A0z();
            }
            return c29681bj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
