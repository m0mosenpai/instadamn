package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Hw6 {
    public static C38803H6s parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            User user = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                user = AbstractC31180DnO.A0W(c16l, user, AbstractC166997dE.A0s(c16l), "target_user");
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("target_user", c16l, "ThreadHeaderContextFollowInfoImpl");
                throw C00O.createAndThrow();
            }
            return new C38803H6s(user);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
