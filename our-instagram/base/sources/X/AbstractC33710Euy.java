package X;

import java.io.IOException;

/* renamed from: X.Euy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33710Euy {
    public static C5F3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "stories")) {
                    bool = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("stories", c16l, "IsCallToActionEnabledBySurfaceDictImpl");
                throw C00O.createAndThrow();
            }
            return new C5F3(bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
