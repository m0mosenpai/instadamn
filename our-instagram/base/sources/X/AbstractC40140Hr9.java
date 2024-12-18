package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Hr9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40140Hr9 {
    public static H4U parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            User user = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                user = AbstractC31180DnO.A0W(c16l, user, AbstractC166997dE.A0s(c16l), "producer");
                c16l.A0z();
            }
            return new H4U(user);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
