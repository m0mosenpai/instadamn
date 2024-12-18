package X;

import java.io.IOException;

/* renamed from: X.Hn8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39918Hn8 {
    public static H3I parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("length".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("offset".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("profile_deeplink".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("profile_www_link".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("length", c16l, "FbMentionedUserDataImpl");
            } else if (num2 != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("profile_deeplink", c16l, "FbMentionedUserDataImpl");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("profile_www_link", c16l, "FbMentionedUserDataImpl");
                } else {
                    return new H3I(num.intValue(), num2.intValue(), str, str2);
                }
            } else {
                AbstractC166997dE.A1V("offset", c16l, "FbMentionedUserDataImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
