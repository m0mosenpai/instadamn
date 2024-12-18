package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6L {
    public static C1dN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C1dN c1dN = new C1dN();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("profile".equals(A0s)) {
                    c1dN.A01 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c1dN.A00 = FUT.parseFromJson(c16l);
                } else if ("is_x_transport_forward".equals(A0s)) {
                    c1dN.A02 = c16l.A0d();
                } else {
                    AbstractC47856LCb.A01(c16l, c1dN, A0s);
                }
                c16l.A0z();
            }
            return c1dN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
