package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hvt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40406Hvt {
    public static C45117Jxm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("aysf_header_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("has_more".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("paging_token".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("unreciprocated_follows_only".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("has_more", c16l, "TextPostAppRecommendedUsersResponse");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("unreciprocated_follows_only", c16l, "TextPostAppRecommendedUsersResponse");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("users", c16l, "TextPostAppRecommendedUsersResponse");
                } else {
                    return new C45117Jxm(str, str2, arrayList, bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("paging_token", c16l, "TextPostAppRecommendedUsersResponse");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
