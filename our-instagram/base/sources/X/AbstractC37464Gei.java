package X;

import java.io.IOException;

/* renamed from: X.Gei, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37464Gei {
    public static C37462Geg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("host_profile_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_eligible_request".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("host_profile_id", c16l, "ProfileAdsInfoDictImpl");
            } else if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("is_eligible_request", c16l, "ProfileAdsInfoDictImpl");
            } else {
                return new C37462Geg(str, bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
