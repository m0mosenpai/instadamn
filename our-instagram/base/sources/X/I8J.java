package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I8J {
    public static IH3 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            IH3 ih3 = new IH3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("merchant".equals(A0s)) {
                    User A0S = AbstractC31171DnF.A0S(c16l, false);
                    C14360o3.A0B(A0S, 0);
                    ih3.A01 = A0S;
                } else if ("row_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    ih3.A02 = A1P;
                } else if ("seller_badge_info".equals(A0s)) {
                    ih3.A00 = I8I.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return ih3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
