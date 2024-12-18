package X;

import java.io.IOException;

/* renamed from: X.NzG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54296NzG {
    public static C40371u5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C40371u5 c40371u5 = new C40371u5();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sub_share_id".equals(A0s)) {
                    c40371u5.A00 = c16l.A1D();
                } else if ("is_configured_in_server".equals(A0s)) {
                    c40371u5.A01 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c40371u5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
