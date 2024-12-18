package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I5C {
    public static C38823H7r parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("charity_user".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("prompt_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("charity_user", c16l, "DonationsPromptInfoModel");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("prompt_title", c16l, "DonationsPromptInfoModel");
            } else {
                return new C38823H7r(user, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
