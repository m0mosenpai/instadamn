package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.HnK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39929HnK {
    public static H3N parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C66635UQn c66635UQn = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("custom_profile_pic_url".equals(A0s)) {
                    c66635UQn = AbstractC39892Hmf.parseFromJson(c16l);
                } else if ("following".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(2535).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(252).equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("social_context".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, AbstractC111324zv.A00(3278));
                }
                c16l.A0z();
            }
            return new H3N(c66635UQn, user, bool, bool2, bool3, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
