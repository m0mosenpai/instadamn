package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Hts, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40288Hts {
    public static C38765H5f parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            User user = null;
            C38825H7t c38825H7t = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("amount_raised".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("charity".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("donations".equals(A0s)) {
                    c38825H7t = I5G.parseFromJson(c16l);
                } else if ("fundraiser_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38765H5f(c38825H7t, user, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
