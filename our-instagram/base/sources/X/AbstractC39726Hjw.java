package X;

import java.io.IOException;

/* renamed from: X.Hjw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39726Hjw {
    public static C38671GzC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("category_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("like_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("page_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("page_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("profile_picture_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("page_id", c16l, "AdminedPage");
                throw C00O.createAndThrow();
            }
            return new C38671GzC(num, str, str2, str3, l.longValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
