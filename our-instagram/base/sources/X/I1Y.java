package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1Y {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.HjG, java.lang.Object] */
    public static C39684HjG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "view_progress_s")) {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("view_progress_s", c16l, "IGTVSeenStateInfo");
                throw C00O.createAndThrow();
            }
            int intValue = num.intValue();
            ?? obj = new Object();
            obj.A00 = intValue;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
