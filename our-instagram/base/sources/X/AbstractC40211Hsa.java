package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Hsa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40211Hsa {
    public static H50 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("repost_context".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("repost_fbid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("repost_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("reposted_at".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, "reposter");
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("repost_fbid", c16l, "RepostInfo");
            } else if (str3 != null || !(c16l instanceof C07950bF)) {
                if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("reposted_at", c16l, "RepostInfo");
                } else if (user == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("reposter", c16l, "RepostInfo");
                } else {
                    return new H50(user, str, str2, str3, l.longValue());
                }
            } else {
                AbstractC166997dE.A1V("repost_id", c16l, "RepostInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
