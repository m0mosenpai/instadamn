package X;

import java.io.IOException;

/* renamed from: X.HzN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40603HzN {
    public static C132755yy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C132755yy c132755yy = new C132755yy();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("channel_id".equals(A0s)) {
                    c132755yy.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("channel_type".equals(A0s)) {
                    c132755yy.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("header".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    c132755yy.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("context".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("media_count".equals(A0s)) {
                    c16l.A1D();
                } else if (AbstractC37300Gc1.A1F(A0s)) {
                    c132755yy.A00 = C38321qM.A00(c16l);
                }
                c16l.A0z();
            }
            return c132755yy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
