package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F61 {
    public static C30141cU parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30141cU c30141cU = new C30141cU();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("clip".equals(A0s)) {
                    c30141cU.A00 = IQG.parseFromJson(c16l);
                } else if ("text".equals(A0s)) {
                    c30141cU.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("clipsSpinId".equals(A0s)) {
                    c30141cU.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("social_context_share_type".equals(A0s)) {
                    c30141cU.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("is_x_transport_forward".equals(A0s)) {
                    c30141cU.A04 = c16l.A0d();
                } else if (AbstractC43591JPw.A00(469).equals(A0s)) {
                    c30141cU.A05 = c16l.A0d();
                } else {
                    AbstractC47856LCb.A01(c16l, c30141cU, A0s);
                }
                c16l.A0z();
            }
            return c30141cU;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
