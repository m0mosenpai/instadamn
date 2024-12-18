package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6I {
    public static C30061cM parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C30061cM c30061cM = new C30061cM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(880).equals(A0s)) {
                    c30061cM.A00 = FUV.parseFromJson(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c30061cM.A01 = FUT.parseFromJson(c16l);
                } else if ("is_x_transport_forward".equals(A0s)) {
                    c30061cM.A03 = c16l.A0d();
                } else if ("send_as_quoted_reply".equals(A0s)) {
                    c30061cM.A04 = c16l.A0d();
                } else if ("social_context_share_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c30061cM.A02 = A1P;
                } else if (AbstractC43591JPw.A00(469).equals(A0s)) {
                    c30061cM.A05 = c16l.A0d();
                } else {
                    AbstractC47856LCb.A01(c16l, c30061cM, A0s);
                }
                c16l.A0z();
            }
            return c30061cM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
