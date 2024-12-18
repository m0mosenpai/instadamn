package X;

import java.io.IOException;

/* renamed from: X.NvY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54074NvY {
    public static C40321u0 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C40321u0 c40321u0 = new C40321u0();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sub_share_id".equals(A0s)) {
                    c40321u0.A00 = c16l.A1D();
                } else if ("is_configured_in_server".equals(A0s)) {
                    c40321u0.A02 = c16l.A0d();
                } else if ("group_destination_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c40321u0.A01 = A1P;
                }
                c16l.A0z();
            }
            return c40321u0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
