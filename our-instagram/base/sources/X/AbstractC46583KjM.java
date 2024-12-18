package X;

import java.io.IOException;

/* renamed from: X.KjM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46583KjM {
    public static C26087BgG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_eligible_for_refresh".equals(A0q)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("last_refresh_time".equals(A0q)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0q, "last_visited_time");
                }
                c16l.A0z();
            }
            return new C26087BgG(bool, num, num2, str, 2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
