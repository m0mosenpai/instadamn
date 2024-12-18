package X;

import java.io.IOException;

/* renamed from: X.EuV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33681EuV {
    public static C32071E6x parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("creator_tool".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "render_position");
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("creator_tool", c16l, "CreatorTool");
            } else if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("render_position", c16l, "CreatorTool");
            } else {
                return new C32071E6x(str, num.intValue(), 5);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
