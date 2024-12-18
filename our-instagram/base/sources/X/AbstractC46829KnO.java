package X;

import java.io.IOException;

/* renamed from: X.KnO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46829KnO {
    public static C45120Jxp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_from_xplat_reverb".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_open_eb".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("is_from_eb_server".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("is_e2ee_attributed".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("is_created_directly_from_server_response".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("is_from_xplat_reverb", c16l, "ArmadilloExpressData");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_from_eb_server", c16l, "ArmadilloExpressData");
                } else {
                    return new C45120Jxp(bool4, bool5, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("is_open_eb", c16l, "ArmadilloExpressData");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
