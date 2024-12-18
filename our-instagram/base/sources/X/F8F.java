package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F8F {
    public static C51755Mte parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            UQE uqe = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "genericMessage")) {
                    uqe = F8E.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (uqe == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("genericMessage", c16l, "MwcRtcAppMessagesBody");
                throw C00O.createAndThrow();
            }
            return new C51755Mte(uqe);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
