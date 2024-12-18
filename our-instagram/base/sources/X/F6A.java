package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6A {
    public static C30101cQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30101cQ c30101cQ = new C30101cQ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("igtv_share".equals(A0s)) {
                    c30101cQ.A00 = FUU.parseFromJson(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c30101cQ.A01 = FUT.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c30101cQ, A0s);
                }
                c16l.A0z();
            }
            return c30101cQ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
