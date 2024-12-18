package X;

import java.io.IOException;

/* renamed from: X.Kpy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46979Kpy {
    public static C29971cC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29971cC c29971cC = new C29971cC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("reel_id".equals(A0s)) {
                    c29971cC.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("story_share".equals(A0s)) {
                    c29971cC.A01 = LCC.parseFromJson(c16l);
                } else if ("reel_viewer_module_name".equals(A0s)) {
                    c29971cC.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("is_story_group_reply".equals(A0s)) {
                    c29971cC.A05 = c16l.A0d();
                } else if ("is_story_group_reaction".equals(A0s)) {
                    c29971cC.A04 = c16l.A0d();
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c29971cC.A00 = FUT.parseFromJson(c16l);
                } else if ("is_x_transport_forward".equals(A0s)) {
                    c29971cC.A06 = c16l.A0d();
                } else {
                    AbstractC47856LCb.A01(c16l, c29971cC, A0s);
                }
                c16l.A0z();
            }
            return c29971cC;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
