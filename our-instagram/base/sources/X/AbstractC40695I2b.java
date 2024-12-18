package X;

import java.io.IOException;

/* renamed from: X.I2b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40695I2b {
    public static C26086BgF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C38011pl c38011pl = null;
            C37881pR c37881pR = null;
            Integer num = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("client_gap_rules".equals(A0q)) {
                    c38011pl = AbstractC38761r8.parseFromJson(c16l);
                } else if ("ad_pod_rules".equals(A0q)) {
                    c37881pR = AbstractC38751r7.parseFromJson(c16l);
                } else if ("priority_index".equals(A0q)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1X(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C26086BgF(c37881pR, num, c38011pl, str, str2, 11);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
