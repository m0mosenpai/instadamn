package X;

import java.io.IOException;

/* renamed from: X.EvC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33724EvC {
    public static C26141BhS parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = MSV.A00(396);
                if (A1J == c16r) {
                    break;
                }
                if (AbstractC31177DnL.A1V(c16l, A00)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "OpenInsightsPageCommandImpl");
                throw C00O.createAndThrow();
            }
            return new C26141BhS(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
