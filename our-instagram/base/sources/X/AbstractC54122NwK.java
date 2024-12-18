package X;

import java.io.IOException;

/* renamed from: X.NwK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54122NwK {
    public static C40351u3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C40351u3 c40351u3 = new C40351u3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sub_share_id".equals(A0s)) {
                    c40351u3.A00 = c16l.A1D();
                } else if ("is_configured_in_server".equals(A0s)) {
                    c40351u3.A01 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c40351u3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
