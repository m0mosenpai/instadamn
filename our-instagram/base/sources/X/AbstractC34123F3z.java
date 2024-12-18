package X;

import java.io.IOException;

/* renamed from: X.F3z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34123F3z {
    public static C34501FIn parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(5588);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("user_igid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("user_igid", c16l, "ClipWatchedActionLog");
            } else if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "ClipWatchedActionLog");
            } else {
                return new C34501FIn(str, l.longValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
