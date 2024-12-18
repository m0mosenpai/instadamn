package X;

import java.io.IOException;

/* renamed from: X.Nyd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54258Nyd {
    public static C51745MtU parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C51745MtU c51745MtU = new C51745MtU();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("support_tier".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c51745MtU.A01 = AbstractC109714wx.A00(A1P);
                } else if ("badges_count".equals(A0s)) {
                    c51745MtU.A00 = c16l.A1D();
                } else if ("show_highlight".equals(A0s)) {
                    c51745MtU.A02 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c51745MtU;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
